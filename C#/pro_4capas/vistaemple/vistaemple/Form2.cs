using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using LNempleadoOCD;


namespace vistaemple
{
    public partial class nomina : Form
    {
        public nomina()
        {
            InitializeComponent();
        }

        private void btnguardar_Click(object sender, EventArgs e)
        {
            try
            {
                string iden;
                double hor_trabaj;

                iden = idenificacion.Text;
                hor_trabaj = Convert.ToDouble(h_trabajo.Text);

                salario objsal = new salario();
               
                objsal.Identificacion = iden;
                objsal.Horas_tra = hor_trabaj;

               if(objsal.manejo_sal())
                {
                    MessageBox.Show(objsal.Error);
                    objsal = null;
                }
                else
                {
                    empleados forempl = new empleados();

                    forempl.Show();

                    MessageBox.Show("Verifique el Usuario");
                }
                

            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
                return;
            }

        }

        private void nomina_Load(object sender, EventArgs e)
        {
            
        }

        private void nomina_FormClosing(object sender, FormClosingEventArgs e)
        {

            Program.nomina.Show();

            this.Dispose();
        }

        private void manejoEmpleadosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Program.nomina.Show();

            this.Dispose();
        }
    }
}
