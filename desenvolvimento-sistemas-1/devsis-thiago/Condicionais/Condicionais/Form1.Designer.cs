namespace Condicionais
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.titulo = new System.Windows.Forms.Label();
            this.subtitulo = new System.Windows.Forms.Label();
            this.lblIdade = new System.Windows.Forms.Label();
            this.txtIdade = new System.Windows.Forms.TextBox();
            this.btnVerifica = new System.Windows.Forms.Button();
            this.resposta = new System.Windows.Forms.Label();
            this.fontDialog1 = new System.Windows.Forms.FontDialog();
            this.cbMeses = new System.Windows.Forms.ComboBox();
            this.lblMes = new System.Windows.Forms.Label();
            this.txtMes = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // titulo
            // 
            this.titulo.AutoSize = true;
            this.titulo.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.titulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 30F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.titulo.Location = new System.Drawing.Point(66, 11);
            this.titulo.Name = "titulo";
            this.titulo.Size = new System.Drawing.Size(336, 48);
            this.titulo.TabIndex = 0;
            this.titulo.Text = "Aula condicionais";
            this.titulo.Click += new System.EventHandler(this.label1_Click);
            // 
            // subtitulo
            // 
            this.subtitulo.AutoSize = true;
            this.subtitulo.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.subtitulo.Location = new System.Drawing.Point(111, 64);
            this.subtitulo.Name = "subtitulo";
            this.subtitulo.Size = new System.Drawing.Size(228, 20);
            this.subtitulo.TabIndex = 1;
            this.subtitulo.Text = "Desenvolvimento de sistemas I";
            this.subtitulo.Click += new System.EventHandler(this.label2_Click);
            // 
            // lblIdade
            // 
            this.lblIdade.AutoSize = true;
            this.lblIdade.Font = new System.Drawing.Font("Palatino Linotype", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblIdade.Location = new System.Drawing.Point(155, 90);
            this.lblIdade.Name = "lblIdade";
            this.lblIdade.Size = new System.Drawing.Size(149, 22);
            this.lblIdade.TabIndex = 2;
            this.lblIdade.Text = "Informe sua idade:";
            this.lblIdade.Click += new System.EventHandler(this.label1_Click_1);
            // 
            // txtIdade
            // 
            this.txtIdade.Location = new System.Drawing.Point(66, 115);
            this.txtIdade.Name = "txtIdade";
            this.txtIdade.Size = new System.Drawing.Size(336, 20);
            this.txtIdade.TabIndex = 3;
            this.txtIdade.TextChanged += new System.EventHandler(this.txtIdade_TextChanged);
            // 
            // btnVerifica
            // 
            this.btnVerifica.Location = new System.Drawing.Point(158, 143);
            this.btnVerifica.Name = "btnVerifica";
            this.btnVerifica.Size = new System.Drawing.Size(122, 51);
            this.btnVerifica.TabIndex = 4;
            this.btnVerifica.Text = "Enviar";
            this.btnVerifica.UseVisualStyleBackColor = true;
            this.btnVerifica.Click += new System.EventHandler(this.btnVerifica_Click_1);
            // 
            // resposta
            // 
            this.resposta.AutoSize = true;
            this.resposta.Location = new System.Drawing.Point(162, 203);
            this.resposta.Name = "resposta";
            this.resposta.Size = new System.Drawing.Size(0, 13);
            this.resposta.TabIndex = 5;
            // 
            // cbMeses
            // 
            this.cbMeses.Items.AddRange(new object[] {
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"});
            this.cbMeses.Location = new System.Drawing.Point(66, 261);
            this.cbMeses.Name = "cbMeses";
            this.cbMeses.Size = new System.Drawing.Size(336, 21);
            this.cbMeses.TabIndex = 8;
            this.cbMeses.SelectedIndexChanged += new System.EventHandler(this.cbMeses_SelectedIndexChanged);
            // 
            // lblMes
            // 
            this.lblMes.AutoSize = true;
            this.lblMes.Font = new System.Drawing.Font("Microsoft JhengHei UI", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblMes.Location = new System.Drawing.Point(161, 239);
            this.lblMes.Name = "lblMes";
            this.lblMes.Size = new System.Drawing.Size(119, 19);
            this.lblMes.TabIndex = 7;
            this.lblMes.Text = "Informe o mês:";
            // 
            // txtMes
            // 
            this.txtMes.AutoSize = true;
            this.txtMes.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtMes.Location = new System.Drawing.Point(98, 288);
            this.txtMes.Name = "txtMes";
            this.txtMes.Size = new System.Drawing.Size(0, 17);
            this.txtMes.TabIndex = 9;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.InactiveCaption;
            this.ClientSize = new System.Drawing.Size(469, 360);
            this.Controls.Add(this.txtMes);
            this.Controls.Add(this.lblMes);
            this.Controls.Add(this.cbMeses);
            this.Controls.Add(this.resposta);
            this.Controls.Add(this.btnVerifica);
            this.Controls.Add(this.txtIdade);
            this.Controls.Add(this.lblIdade);
            this.Controls.Add(this.subtitulo);
            this.Controls.Add(this.titulo);
            this.ForeColor = System.Drawing.SystemColors.InfoText;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label titulo;
        private System.Windows.Forms.Label subtitulo;
        private System.Windows.Forms.Label lblIdade;
        private System.Windows.Forms.TextBox txtIdade;
        private System.Windows.Forms.Button btnVerifica;
        private System.Windows.Forms.Label resposta;
        private System.Windows.Forms.FontDialog fontDialog1;
        private System.Windows.Forms.ComboBox cbMeses;
        private System.Windows.Forms.Label lblMes;
        private System.Windows.Forms.Label txtMes;
    }
}

