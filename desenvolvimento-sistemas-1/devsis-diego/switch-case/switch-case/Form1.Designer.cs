namespace switch_case
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
            this.label1 = new System.Windows.Forms.Label();
            this.textMes = new System.Windows.Forms.Label();
            this.comboBoxMeses = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(12, 126);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(139, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Selecione um mês";
            // 
            // textMes
            // 
            this.textMes.AutoSize = true;
            this.textMes.Location = new System.Drawing.Point(146, 377);
            this.textMes.Name = "textMes";
            this.textMes.Size = new System.Drawing.Size(120, 13);
            this.textMes.TabIndex = 1;
            this.textMes.Text = "O mês aparecerá aqui...";
            // 
            // comboBoxMeses
            // 
            this.comboBoxMeses.FormattingEnabled = true;
            this.comboBoxMeses.Items.AddRange(new object[] {
            "Selecione o Mês",
            "Janeiro",
            "Fevereiro",
            "Março",
            "Maio",
            "Abril",
            "Maio",
            "Junho",
            "Julho"});
            this.comboBoxMeses.Location = new System.Drawing.Point(171, 128);
            this.comboBoxMeses.Name = "comboBoxMeses";
            this.comboBoxMeses.Size = new System.Drawing.Size(149, 21);
            this.comboBoxMeses.TabIndex = 2;
            this.comboBoxMeses.SelectedIndexChanged += new System.EventHandler(this.comboBoxMeses_SelectedIndexChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(144, 39);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(146, 29);
            this.label3.TabIndex = 3;
            this.label3.Text = "Switch Case";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(426, 609);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.comboBoxMeses);
            this.Controls.Add(this.textMes);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Switch Case";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label textMes;
        private System.Windows.Forms.ComboBox comboBoxMeses;
        private System.Windows.Forms.Label label3;
    }
}

