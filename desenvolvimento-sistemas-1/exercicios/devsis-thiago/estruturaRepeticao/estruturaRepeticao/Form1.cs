using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace estruturaRepeticao
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

        private void button1_Click(object sender, EventArgs e)
        {
            While wl = new While();

            wl.Show();
            this.Hide();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            // ir para foreach
            forEach fr = new forEach();
            fr.Show();
            this.Hide();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            // ESTRUTURA DE REPETIÇÃO FOR
            // for (INICIO; ATE <EXPRESSAO>; FIM)
            double dinheiro = 1000.0;

            for(int i = 0; i < 10; i++)
            {
                dinheiro = dinheiro + 1;
            }
            MessageBox.Show("A quantidade acumulado do dinheiro foi " + dinheiro);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            
        }
    }
}
