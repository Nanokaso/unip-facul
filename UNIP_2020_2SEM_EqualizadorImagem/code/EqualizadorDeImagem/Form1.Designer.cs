namespace EqualizadorDeImagem
{
    partial class Form1
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.pnlMenu = new System.Windows.Forms.Panel();
            this.label4 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.btnVetor = new System.Windows.Forms.Button();
            this.btnImagem = new System.Windows.Forms.Button();
            this.pnlImagem = new System.Windows.Forms.Panel();
            this.btnEscolherImagem = new System.Windows.Forms.Button();
            this.pnlVetor = new System.Windows.Forms.Panel();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtVetorSaida = new System.Windows.Forms.TextBox();
            this.txtVetorEntrada = new System.Windows.Forms.TextBox();
            this.btnVetorAutoPreencher = new System.Windows.Forms.Button();
            this.btnExemploProf = new System.Windows.Forms.Button();
            this.btnVetorResetar = new System.Windows.Forms.Button();
            this.btnVetorConfirmar = new System.Windows.Forms.Button();
            this.tp = new System.Windows.Forms.ToolTip(this.components);
            this.pnlMenu.SuspendLayout();
            this.pnlImagem.SuspendLayout();
            this.pnlVetor.SuspendLayout();
            this.SuspendLayout();
            // 
            // pnlMenu
            // 
            this.pnlMenu.Controls.Add(this.label4);
            this.pnlMenu.Controls.Add(this.label1);
            this.pnlMenu.Controls.Add(this.btnVetor);
            this.pnlMenu.Controls.Add(this.btnImagem);
            this.pnlMenu.Dock = System.Windows.Forms.DockStyle.Top;
            this.pnlMenu.Location = new System.Drawing.Point(0, 0);
            this.pnlMenu.Name = "pnlMenu";
            this.pnlMenu.Padding = new System.Windows.Forms.Padding(10);
            this.pnlMenu.Size = new System.Drawing.Size(1089, 142);
            this.pnlMenu.TabIndex = 0;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.label4.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(50)))), ((int)(((byte)(60)))), ((int)(((byte)(70)))));
            this.label4.Location = new System.Drawing.Point(10, 119);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(245, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Feito com muito carinho ♥ por Nanokaso Gongon";
            this.label4.TextAlign = System.Drawing.ContentAlignment.BottomRight;
            this.tp.SetToolTip(this.label4, "FEITO COM UM PUT@ ÓDIO. ISSO SIM");
            // 
            // label1
            // 
            this.label1.Dock = System.Windows.Forms.DockStyle.Top;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label1.ForeColor = System.Drawing.Color.Cyan;
            this.label1.Location = new System.Drawing.Point(10, 10);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(1069, 29);
            this.label1.TabIndex = 2;
            this.label1.Text = "Deseja equalizar por:";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.tp.SetToolTip(this.label1, ":P");
            // 
            // btnVetor
            // 
            this.btnVetor.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnVetor.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnVetor.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnVetor.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVetor.ForeColor = System.Drawing.Color.Cyan;
            this.btnVetor.Location = new System.Drawing.Point(552, 53);
            this.btnVetor.Name = "btnVetor";
            this.btnVetor.Size = new System.Drawing.Size(220, 61);
            this.btnVetor.TabIndex = 1;
            this.btnVetor.Text = "Vetor";
            this.tp.SetToolTip(this.btnVetor, "Jeito do professor :T");
            this.btnVetor.UseVisualStyleBackColor = false;
            this.btnVetor.Click += new System.EventHandler(this.btnVetor_Click);
            // 
            // btnImagem
            // 
            this.btnImagem.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnImagem.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnImagem.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnImagem.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnImagem.ForeColor = System.Drawing.Color.Cyan;
            this.btnImagem.Location = new System.Drawing.Point(317, 53);
            this.btnImagem.Name = "btnImagem";
            this.btnImagem.Size = new System.Drawing.Size(220, 61);
            this.btnImagem.TabIndex = 1;
            this.btnImagem.Text = "Imagem";
            this.tp.SetToolTip(this.btnImagem, "Meu jeito!");
            this.btnImagem.UseVisualStyleBackColor = false;
            this.btnImagem.Click += new System.EventHandler(this.btnImagem_Click);
            // 
            // pnlImagem
            // 
            this.pnlImagem.Controls.Add(this.btnEscolherImagem);
            this.pnlImagem.Dock = System.Windows.Forms.DockStyle.Left;
            this.pnlImagem.Location = new System.Drawing.Point(0, 142);
            this.pnlImagem.Name = "pnlImagem";
            this.pnlImagem.Size = new System.Drawing.Size(537, 497);
            this.pnlImagem.TabIndex = 1;
            // 
            // btnEscolherImagem
            // 
            this.btnEscolherImagem.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnEscolherImagem.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnEscolherImagem.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEscolherImagem.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEscolherImagem.ForeColor = System.Drawing.Color.Cyan;
            this.btnEscolherImagem.Location = new System.Drawing.Point(436, 172);
            this.btnEscolherImagem.Name = "btnEscolherImagem";
            this.btnEscolherImagem.Size = new System.Drawing.Size(220, 61);
            this.btnEscolherImagem.TabIndex = 1;
            this.btnEscolherImagem.Text = "Escolha uma imagem";
            this.tp.SetToolTip(this.btnEscolherImagem, "Escolhe logo uma imagem mano!");
            this.btnEscolherImagem.UseVisualStyleBackColor = false;
            this.btnEscolherImagem.Click += new System.EventHandler(this.btnEscolherImagem_Click);
            // 
            // pnlVetor
            // 
            this.pnlVetor.Controls.Add(this.label3);
            this.pnlVetor.Controls.Add(this.label2);
            this.pnlVetor.Controls.Add(this.txtVetorSaida);
            this.pnlVetor.Controls.Add(this.txtVetorEntrada);
            this.pnlVetor.Controls.Add(this.btnVetorAutoPreencher);
            this.pnlVetor.Controls.Add(this.btnExemploProf);
            this.pnlVetor.Controls.Add(this.btnVetorResetar);
            this.pnlVetor.Controls.Add(this.btnVetorConfirmar);
            this.pnlVetor.Dock = System.Windows.Forms.DockStyle.Right;
            this.pnlVetor.Location = new System.Drawing.Point(552, 142);
            this.pnlVetor.Name = "pnlVetor";
            this.pnlVetor.Size = new System.Drawing.Size(537, 497);
            this.pnlVetor.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label3.ForeColor = System.Drawing.Color.Cyan;
            this.label3.Location = new System.Drawing.Point(166, 321);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(54, 20);
            this.label3.TabIndex = 3;
            this.label3.Text = "Saida:";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.tp.SetToolTip(this.label3, "(╯°□°）╯︵ ┻━┻");
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.label2.ForeColor = System.Drawing.Color.Cyan;
            this.label2.Location = new System.Drawing.Point(166, 119);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(601, 20);
            this.label2.TabIndex = 3;
            this.label2.Text = "Entrada: ( Separe os valores com \"-\" , adicione o nivel de luminosidade de 0 até " +
    "255)";
            this.label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // txtVetorSaida
            // 
            this.txtVetorSaida.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtVetorSaida.Location = new System.Drawing.Point(170, 348);
            this.txtVetorSaida.Name = "txtVetorSaida";
            this.txtVetorSaida.ReadOnly = true;
            this.txtVetorSaida.Size = new System.Drawing.Size(732, 29);
            this.txtVetorSaida.TabIndex = 2;
            this.txtVetorSaida.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.tp.SetToolTip(this.txtVetorSaida, "Saida dos calculos lokos");
            // 
            // txtVetorEntrada
            // 
            this.txtVetorEntrada.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtVetorEntrada.Location = new System.Drawing.Point(170, 146);
            this.txtVetorEntrada.Name = "txtVetorEntrada";
            this.txtVetorEntrada.Size = new System.Drawing.Size(732, 29);
            this.txtVetorEntrada.TabIndex = 2;
            this.txtVetorEntrada.Text = "0-0-0-0-0-0-0-0-0-0";
            this.txtVetorEntrada.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.tp.SetToolTip(this.txtVetorEntrada, "Entrada de valores que o professor pediu");
            // 
            // btnVetorAutoPreencher
            // 
            this.btnVetorAutoPreencher.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnVetorAutoPreencher.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnVetorAutoPreencher.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnVetorAutoPreencher.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVetorAutoPreencher.ForeColor = System.Drawing.Color.Cyan;
            this.btnVetorAutoPreencher.Location = new System.Drawing.Point(170, 225);
            this.btnVetorAutoPreencher.Name = "btnVetorAutoPreencher";
            this.btnVetorAutoPreencher.Size = new System.Drawing.Size(148, 61);
            this.btnVetorAutoPreencher.TabIndex = 1;
            this.btnVetorAutoPreencher.Text = "Auto Preender";
            this.tp.SetToolTip(this.btnVetorAutoPreencher, "Gerar umas parada louca!");
            this.btnVetorAutoPreencher.UseVisualStyleBackColor = false;
            this.btnVetorAutoPreencher.Click += new System.EventHandler(this.btnVetorAutoPreencher_Click);
            // 
            // btnExemploProf
            // 
            this.btnExemploProf.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnExemploProf.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnExemploProf.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnExemploProf.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExemploProf.ForeColor = System.Drawing.Color.Cyan;
            this.btnExemploProf.Location = new System.Drawing.Point(463, 225);
            this.btnExemploProf.Name = "btnExemploProf";
            this.btnExemploProf.Size = new System.Drawing.Size(133, 61);
            this.btnExemploProf.TabIndex = 1;
            this.btnExemploProf.Text = "Exemplo Professor";
            this.btnExemploProf.UseVisualStyleBackColor = false;
            this.btnExemploProf.Click += new System.EventHandler(this.btnExemploProf_Click);
            // 
            // btnVetorResetar
            // 
            this.btnVetorResetar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnVetorResetar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnVetorResetar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnVetorResetar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVetorResetar.ForeColor = System.Drawing.Color.Cyan;
            this.btnVetorResetar.Location = new System.Drawing.Point(324, 225);
            this.btnVetorResetar.Name = "btnVetorResetar";
            this.btnVetorResetar.Size = new System.Drawing.Size(133, 61);
            this.btnVetorResetar.TabIndex = 1;
            this.btnVetorResetar.Text = "Resetar";
            this.tp.SetToolTip(this.btnVetorResetar, "Limpa tudo! #FaxinaNaCasa");
            this.btnVetorResetar.UseVisualStyleBackColor = false;
            this.btnVetorResetar.Click += new System.EventHandler(this.btnVetorResetar_Click);
            // 
            // btnVetorConfirmar
            // 
            this.btnVetorConfirmar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(30)))), ((int)(((byte)(40)))), ((int)(((byte)(50)))));
            this.btnVetorConfirmar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnVetorConfirmar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnVetorConfirmar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnVetorConfirmar.ForeColor = System.Drawing.Color.Cyan;
            this.btnVetorConfirmar.Location = new System.Drawing.Point(769, 225);
            this.btnVetorConfirmar.Name = "btnVetorConfirmar";
            this.btnVetorConfirmar.Size = new System.Drawing.Size(133, 61);
            this.btnVetorConfirmar.TabIndex = 1;
            this.btnVetorConfirmar.Text = "Confirmar";
            this.tp.SetToolTip(this.btnVetorConfirmar, "Vamo que Vamo");
            this.btnVetorConfirmar.UseVisualStyleBackColor = false;
            this.btnVetorConfirmar.Click += new System.EventHandler(this.btnVetorConfirmar_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(20)))), ((int)(((byte)(30)))), ((int)(((byte)(40)))));
            this.ClientSize = new System.Drawing.Size(1089, 639);
            this.Controls.Add(this.pnlVetor);
            this.Controls.Add(this.pnlImagem);
            this.Controls.Add(this.pnlMenu);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Equalizador de Imagem";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.pnlMenu.ResumeLayout(false);
            this.pnlMenu.PerformLayout();
            this.pnlImagem.ResumeLayout(false);
            this.pnlVetor.ResumeLayout(false);
            this.pnlVetor.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pnlMenu;
        private System.Windows.Forms.Button btnImagem;
        private System.Windows.Forms.Button btnVetor;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel pnlImagem;
        private System.Windows.Forms.Button btnEscolherImagem;
        private System.Windows.Forms.Panel pnlVetor;
        private System.Windows.Forms.Button btnVetorConfirmar;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtVetorEntrada;
        private System.Windows.Forms.Button btnVetorAutoPreencher;
        private System.Windows.Forms.Button btnVetorResetar;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtVetorSaida;
        private System.Windows.Forms.ToolTip tp;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button btnExemploProf;
    }
}

