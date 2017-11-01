using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : System.Windows.Forms.Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private int value;

        private int sum(int inputValue)
        {
            
            return value + inputValue;
        }
   
        private void btnEnviar_Click(object sender, EventArgs e)
        {
            value = sum(Convert.ToInt16(tboxTeste.Text));
            lbnText.Text = value.ToString();
        }
    }
}
