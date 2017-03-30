namespace Atividade
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
            this.txt_num1 = new System.Windows.Forms.TextBox();
            this.lblnum1 = new System.Windows.Forms.Label();
            this.txt_num2 = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btn_somar = new System.Windows.Forms.Button();
            this.backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            this.check_op = new System.Windows.Forms.RadioButton();
            this.check_op3 = new System.Windows.Forms.RadioButton();
            this.check_op1 = new System.Windows.Forms.RadioButton();
            this.check_op2 = new System.Windows.Forms.RadioButton();
            this.label1 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txt_num1
            // 
            this.txt_num1.Location = new System.Drawing.Point(55, 92);
            this.txt_num1.Name = "txt_num1";
            this.txt_num1.Size = new System.Drawing.Size(166, 20);
            this.txt_num1.TabIndex = 0;
            this.txt_num1.TextChanged += new System.EventHandler(this.txt_num1_TextChanged);
            // 
            // lblnum1
            // 
            this.lblnum1.AutoSize = true;
            this.lblnum1.BackColor = System.Drawing.Color.Transparent;
            this.lblnum1.Font = new System.Drawing.Font("Microsoft Sans Serif", 13F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblnum1.Location = new System.Drawing.Point(60, 67);
            this.lblnum1.Name = "lblnum1";
            this.lblnum1.Size = new System.Drawing.Size(155, 22);
            this.lblnum1.TabIndex = 1;
            this.lblnum1.Text = "Insira o 1º número";
            this.lblnum1.Click += new System.EventHandler(this.label1_Click);
            // 
            // txt_num2
            // 
            this.txt_num2.Location = new System.Drawing.Point(55, 142);
            this.txt_num2.Name = "txt_num2";
            this.txt_num2.Size = new System.Drawing.Size(166, 20);
            this.txt_num2.TabIndex = 2;
            this.txt_num2.TextChanged += new System.EventHandler(this.txt_num2_TextChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 13F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(60, 117);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(155, 22);
            this.label2.TabIndex = 3;
            this.label2.Text = "Insira o 2º número";
            // 
            // btn_somar
            // 
            this.btn_somar.Location = new System.Drawing.Point(95, 231);
            this.btn_somar.Name = "btn_somar";
            this.btn_somar.Size = new System.Drawing.Size(82, 37);
            this.btn_somar.TabIndex = 4;
            this.btn_somar.Text = "Resultado";
            this.btn_somar.UseVisualStyleBackColor = true;
            this.btn_somar.Click += new System.EventHandler(this.btn_somar_Click);
            // 
            // check_op
            // 
            this.check_op.AutoSize = true;
            this.check_op.BackColor = System.Drawing.Color.Transparent;
            this.check_op.Location = new System.Drawing.Point(55, 174);
            this.check_op.Name = "check_op";
            this.check_op.Size = new System.Drawing.Size(64, 17);
            this.check_op.TabIndex = 5;
            this.check_op.TabStop = true;
            this.check_op.Text = "SOMAR";
            this.check_op.UseVisualStyleBackColor = false;
            // 
            // check_op3
            // 
            this.check_op3.AutoSize = true;
            this.check_op3.BackColor = System.Drawing.Color.Transparent;
            this.check_op3.Location = new System.Drawing.Point(142, 197);
            this.check_op3.Name = "check_op3";
            this.check_op3.Size = new System.Drawing.Size(68, 17);
            this.check_op3.TabIndex = 6;
            this.check_op3.TabStop = true;
            this.check_op3.Text = "DIVISAO";
            this.check_op3.UseVisualStyleBackColor = false;
            // 
            // check_op1
            // 
            this.check_op1.AutoSize = true;
            this.check_op1.BackColor = System.Drawing.Color.Transparent;
            this.check_op1.Location = new System.Drawing.Point(55, 197);
            this.check_op1.Name = "check_op1";
            this.check_op1.Size = new System.Drawing.Size(80, 17);
            this.check_op1.TabIndex = 7;
            this.check_op1.TabStop = true;
            this.check_op1.Text = "SUBTRAIR";
            this.check_op1.UseVisualStyleBackColor = false;
            // 
            // check_op2
            // 
            this.check_op2.AutoSize = true;
            this.check_op2.BackColor = System.Drawing.Color.Transparent;
            this.check_op2.Location = new System.Drawing.Point(141, 174);
            this.check_op2.Name = "check_op2";
            this.check_op2.Size = new System.Drawing.Size(110, 17);
            this.check_op2.TabIndex = 8;
            this.check_op2.TabStop = true;
            this.check_op2.Text = "MULTIPLICACAO";
            this.check_op2.UseVisualStyleBackColor = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Monospac821 BT", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(28, 14);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(226, 39);
            this.label1.TabIndex = 9;
            this.label1.Text = "CALCULADORA";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.Color.Transparent;
            this.label3.Location = new System.Drawing.Point(64, 282);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(0, 13);
            this.label3.TabIndex = 10;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::Atividade.Properties.Resources.Desert;
            this.ClientSize = new System.Drawing.Size(284, 304);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.check_op2);
            this.Controls.Add(this.check_op1);
            this.Controls.Add(this.check_op3);
            this.Controls.Add(this.check_op);
            this.Controls.Add(this.btn_somar);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txt_num2);
            this.Controls.Add(this.lblnum1);
            this.Controls.Add(this.txt_num1);
            this.Name = "Form1";
            this.Text = "T";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txt_num1;
        private System.Windows.Forms.Label lblnum1;
        private System.Windows.Forms.TextBox txt_num2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btn_somar;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private System.Windows.Forms.RadioButton check_op;
        private System.Windows.Forms.RadioButton check_op3;
        private System.Windows.Forms.RadioButton check_op1;
        private System.Windows.Forms.RadioButton check_op2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label3;
    }
}

