using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;

namespace ConexaoMySqlDB
{
    public static class DAO
    {
        private class myConnection
        {
            public myConnection() { Parameters = new List<string>(); }
            public DateTime dataInicio { get; set; }
            public string IdConexao { get; set; }
            public MySqlConnection Connection { get; set; }
            public List<string> Parameters { get; set; }
            public MySqlCommand Command { get; set; }
            public MySqlTransaction MySqlTransaction { get; set; }
        }

        //--------------------------------------

        private static List<myConnection> connections { get; set; }

        private static string s_stringConexao;
        public static void Configurar(string conexao)
        {
            s_stringConexao = conexao;
            if (connections == null)
                connections = new List<myConnection>();
        }

        public static void Configurar(string server, string database, string uid, string pwd, int port = 0)
        {
            string c = $"Server={server};Database={database};Uid={uid};Pwd={pwd};";
            if (port > 0)
                c += "Port=" + port + "";
            Configurar(c);
        }

        //--------------------------------------
        private static myConnection GetConnection(string idConexao)
        {
            return !Array.TrueForAll(connections.ToArray(), x => x.IdConexao != idConexao)
                ? connections.Where(x => x.IdConexao == idConexao).ToList().FirstOrDefault()
                : NewConnection(idConexao);
        }

        private static myConnection NewConnection(string idConexao)
        {
            MySqlConnection coon = new MySqlConnection(s_stringConexao);
            connections.Add(new myConnection() { Connection = coon, IdConexao = idConexao, dataInicio = DateTime.Now });
            return connections.Where(x => x.IdConexao == idConexao).ToList().FirstOrDefault();
        }

        public static void Abrir(string idconexao)
        {
            if (GetConnection(idconexao).Connection.State != ConnectionState.Open)
                GetConnection(idconexao).Connection.Open();
        }

        public static void Fechar(string idconexao)
        {
            if (GetConnection(idconexao).Connection.State == ConnectionState.Open)
            {
                GetConnection(idconexao).Connection.Close();
            }
            try
            {
                List<myConnection> temp = new List<myConnection>();
                foreach (var item in connections)
                {
                    if (item.IdConexao != idconexao && item.dataInicio > DateTime.Now.AddDays(-1)) // uma conexao nao pode ficar aberta mais de 1 dia
                    {
                        temp.Add(item);
                    }
                }
                connections = temp;
            }
            catch { }
        }

        public static void IniciarSql(string idconexao)
        {
            GetConnection(idconexao).Command = GetConnection(idconexao).Connection.CreateCommand();
        }

        public static void IniciarTransacaoDML(string idconexao)
        {
            GetConnection(idconexao).Command = GetConnection(idconexao).Connection.CreateCommand();
            GetConnection(idconexao).MySqlTransaction = GetConnection(idconexao).Connection.BeginTransaction();
            GetConnection(idconexao).Command.Connection = GetConnection(idconexao).Connection;
            GetConnection(idconexao).Command.Transaction = GetConnection(idconexao).MySqlTransaction;
        }

        public static MySqlDataReader ExecutarSQL(string idconexao, string query)
        {
            GetConnection(idconexao).Command = GetConnection(idconexao).Connection.CreateCommand();
            MySqlCommand cmd = new MySqlCommand(query, GetConnection(idconexao).Connection);
            MySqlDataReader reader = cmd.ExecuteReader();
            return reader;
        }

        public static MySqlDataReader ExecutarSqlParameter(string idconexao, string query)
        {
            var parameters = string.Join(" ", GetConnection(idconexao).Parameters);
            var newquery = parameters + " " + query;
            
            MySqlCommand cmd = new MySqlCommand(newquery, GetConnection(idconexao).Connection);
            MySqlDataReader reader = cmd.ExecuteReader();
            return reader;
        }

        public static void ExecutarTransacaoDML(string idconexao, string query)
        {
            GetConnection(idconexao).Command.CommandText = query;
            GetConnection(idconexao).Command.ExecuteNonQuery();
        }

        public static void ExecutarTransacaoDMLParameter(string idconexao, string query)
        {
            var parameters = string.Join(" ", GetConnection(idconexao).Parameters);
            var newquery = parameters + " " + query;

            GetConnection(idconexao).Command.CommandText = newquery;
            GetConnection(idconexao).Command.ExecuteNonQuery();
        }

        public static void ConfirmarTransacaoDML(string idconexao)
        {
            GetConnection(idconexao).MySqlTransaction.Commit();
        }

        public static void CancelarTransacaoDML(string idconexao)
        {
            GetConnection(idconexao).MySqlTransaction.Rollback();
        }

        public static void IncluirParameter(string idconexao, string parameter, string value)
        {
            string declare = "SET @" + parameter + " := '" + value + "';";
            GetConnection(idconexao).Parameters.Add(declare);
        }

        public static void IncluirParameter(string idconexao, string parameter, int value)
        {
            string declare = "SET @" + parameter + " := " + value + ";";
            GetConnection(idconexao).Parameters.Add(declare);
        }

        public static void IncluirParameter(string idconexao, string parameter, bool value)
        {
            string declare = "SET @" + parameter + " := " + value.ToString().ToLower() + ";";
            GetConnection(idconexao).Parameters.Add(declare);
        }

        public static void IncluirParameter(string idconexao, string parameter, decimal value)
        {
            string declare = "SET @" + parameter + " := " + value + ";";
            GetConnection(idconexao).Parameters.Add(declare);
        }

        public static void IncluirParameter(string idconexao, string parameter, double value)
        {
            string declare = "SET @" + parameter + " := " + value + ";";
            GetConnection(idconexao).Parameters.Add(declare);
        }

        public static void IncluirParameter(string idconexao, string parameter, DateTime value)
        {
            string declare = "SET @" + parameter + " := '" + value.ToString("yyyy-MM-dd HH:mm:ss") + "';";
            GetConnection(idconexao).Parameters.Add(declare);
        }

        public static int GetIdSequencial(string idconexao, string coluna, string tabela)
        {
            MySqlCommand cmd = new MySqlCommand($"SELECT MAX({coluna}) FROM {tabela};", GetConnection(idconexao).Connection);
            MySqlDataReader reader = cmd.ExecuteReader();
            int valor = 0;
            if (reader.HasRows)
                while (reader.Read())
                {
                    valor = Convert.ToInt32(reader.GetString(0));
                }
            reader.Close();
            return valor;
        }
    }
}
