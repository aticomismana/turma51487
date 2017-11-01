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
    public partial class While : Form
    {
        public While()
        {
            InitializeComponent();
        }

        private void while_Load(object sender, EventArgs e)
        {
            int i = 15;
            double dinheiro = 1000.0;
            while(i >= 15)
            {
                dinheiro -= i;
                i--;
            }
            MessageBox.Show("O dinheiro subtraido " + dinheiro);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int i = 1;

            do
            {
                MessageBox.Show(i.ToString());
                i++;
            } while (i < 5);
        }
    }
}
