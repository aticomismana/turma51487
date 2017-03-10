using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace switch_case
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

        private void comboBoxMeses_SelectedIndexChanged(object sender, EventArgs e)
        {
            String mes = comboBoxMeses.Text;
            int numMes = comboBoxMeses.SelectedIndex;
            textMes.Text = numMes.ToString();



        }
    }
}
