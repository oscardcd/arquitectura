using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using LIB_logicadeNegocio;

namespace AppEjemplo1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btncalcular_Click(object sender, EventArgs e)
        {
            //instanciar la logica de negocio
            Operacion objO = new Operacion();
            double n1, n2;
            try
            {
                n1 = Convert.ToDouble(txtnum1.Text);
                n2 = Convert.ToDouble(txtnum2.Text);
                //enviando los numeros a la logica de negocio
                objO.setNum1 = n1;
                objO.setNum2 = n2;
                if (!objO.calcular())
                {
                    MessageBox.Show(objO.getError);
                    return;
                }
                else
                {
                    txtsuma.Text = objO.getSuma.ToString();
                    return;
                }
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }


        }
    }
}
