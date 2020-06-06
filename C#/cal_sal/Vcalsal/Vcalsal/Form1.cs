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

namespace Vcalsal
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void calcular_Click(object sender, EventArgs e)
        {
            Operacion objO = new Operacion();
            double htra, valhor;

            htra = Convert.ToDouble(horas.Text);
            valhor = Convert.ToDouble(valhora.Text);
            try
            {
                objO.Horas = htra;
                objO.setvalh = valhor;

                if (!objO.calcular())
                {
                    MessageBox.Show(objO.Error);
                }
                else 
                {
                    sueldo.Text = Convert.ToString(objO.Salario);     
                }
            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }
    }
}
