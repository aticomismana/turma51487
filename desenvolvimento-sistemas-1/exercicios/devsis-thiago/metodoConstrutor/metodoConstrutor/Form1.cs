using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace metodoConstrutor
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

        private void cadastrar_Click(object sender, EventArgs e)
        {
            
            Usuario user = new Usuario(Convert.ToString(txtNome.Text), Convert.ToString(txtCidade.Text), Convert.ToString(txtEstado.Text),Convert.ToInt32(txtCPF.Text), Convert.ToInt32(txtRG.Text));

            MessageBox.Show(user.nomeCompleto);

        }
    }
}
