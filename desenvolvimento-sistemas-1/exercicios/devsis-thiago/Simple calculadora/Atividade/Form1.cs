using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Atividade
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void txt_num1_TextChanged(object sender, EventArgs e)
        {

        }

        private void txt_num2_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_somar_Click(object sender, EventArgs e)
        {
            Operacao operacao = new Operacao();

            if (String.IsNullOrEmpty(txt_num1.Text) == false && String.IsNullOrEmpty(txt_num2.Text) == false) {
                if (check_op.Checked || check_op2.Checked || check_op3.Checked || check_op1.Checked)
                {
                    try
                    {
                        double num1 = Convert.ToDouble(txt_num1.Text);
                        double num2 = Convert.ToDouble(txt_num2.Text);

                        if (check_op.Text == "SOMAR" && check_op.Checked)
                        {
                            operacao.soma(num1, num2);
                        }

                        if (check_op1.Text == "SUBTRAIR" && check_op1.Checked)
                        {
                            operacao.subtracao(num1, num2);
                        }

                        if (check_op2.Text == "MULTIPLICACAO" && check_op2.Checked)
                        {
                            operacao.multiplicacao(num1, num2);
                        }

                        if (check_op3.Text == "DIVISAO" && check_op3.Checked)
                        {
                            operacao.divisao(num1, num2);
                        }

                        label3.Text = "O resultado da operação é: " + operacao.resultado.ToString();
                    } catch
                    {
                        label3.Text = "Informe um valor númerico válido";
                    }
                    
                } else
                {
                    label3.Text = "Informe a operação matemática";
                }
                    
            } else
            {
                label3.Text = "Os campos não podem está vázio";
            }


        }


    }
}
