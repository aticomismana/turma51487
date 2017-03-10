using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Condicionais
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void flowLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
        private void label1_Click_1(object sender, EventArgs e)
        {

        }
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnVerifica_Click_1(object sender, EventArgs e)
        {
            if (txtIdade.Text == "")
            {
                resposta.Text = "Você não informou nada";
            }else
            {
                int idade = (int)Convert.ToInt64(txtIdade.Text);
                if (idade >= 18)
                {
                    resposta.Text = "Você é maior de idade";
                }
                else
                {
                    resposta.Text = "Vc é menor de idade";
                }
            }
            
        }

        private void txtIdade_TextChanged(object sender, EventArgs e)
        {

        }

        private void cbMeses_SelectedIndexChanged(object sender, EventArgs e)
        {
            String resMes = cbMeses.Text;
            int nMes = cbMeses.SelectedIndex;
            txtMes.Text = "O mês que vc selecionou foi: " + nMes + " - " + resMes;
        }
    }
}
