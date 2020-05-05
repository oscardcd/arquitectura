

using LogNegocio;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace vistaprome
{
    public partial class calprom : Form
    {
        public calprom()
        {
            InitializeComponent();
        }

      
        private void calcular_Click(object sender, EventArgs e)
        {
            Operacion obj = new Operacion();
            double n1, n2, n3;

            try
            {
                n1 = Convert.ToDouble(num1.Text);
                n2 = Convert.ToDouble(num2.Text);
                n3 = Convert.ToDouble(num3.Text);

                obj.setnum1 = n1;
                obj.setnum2 = n2;
                obj.setnum3 = n3;


                if (!obj.calcular())
                {
                    MessageBox.Show(obj.geterror);
                    return;
                }
                else
                {
                    result.Text = Convert.ToString(obj.getprom);
                    if(obj.getprom<3)
                        result.BackColor = Color.FromArgb(245, 4, 4);
                    result.BackColor = Color.FromArgb(7, 245, 4);
                }
            }
            catch (Exception ex)
            {

                MessageBox.Show(ex.Message);

            }
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
