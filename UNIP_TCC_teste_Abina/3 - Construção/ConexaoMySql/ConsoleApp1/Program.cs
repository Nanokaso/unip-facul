using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

            ConexaoMySqlDB.DAO.Configurar("localhost", "tessss", "root", "root");
            try
            {
                string idconexao = Guid.NewGuid().ToString();
                try
                {
                    ConexaoMySqlDB.DAO.Abrir(idconexao);

                    ConexaoMySqlDB.DAO.IniciarTransacaoDML(idconexao);

                    ConexaoMySqlDB.DAO.ExecutarTransacaoDML(idconexao, "Insert into minhamae(DsMinhamae) Values('suceso visual studio 2')");

                    int idIncrement = ConexaoMySqlDB.DAO.GetIdSequencial(idconexao,"idminhamae","minhamae");                   

                    ConexaoMySqlDB.DAO.ConfirmarTransacaoDML(idconexao);
                }
                catch (Exception ex)
                {
                    string a = "";
                }
                finally
                {
                    ConexaoMySqlDB.DAO.Fechar(idconexao);
                }
            }
            catch (Exception ex)
            {
                
            }
        }
    }
}
