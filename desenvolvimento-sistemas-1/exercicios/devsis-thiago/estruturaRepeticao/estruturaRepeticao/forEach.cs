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
    public partial class forEach : Form
    {
        public forEach()
        {
            InitializeComponent();
            int[] array = {1,2,3,4 };
            foreach(int value in array){
                MessageBox.Show(value.ToString());
            }
        }

        private void forEach_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form1 menu = new Form1();

            menu.Show();
            this.Hide();
        }
    }
}
