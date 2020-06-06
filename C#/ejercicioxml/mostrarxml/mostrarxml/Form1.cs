using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using libparametrosOdcd;

namespace mostrarxml
{
    public partial class alumnos : Form
    {
        public alumnos()
        {
            InitializeComponent();
        }

        private void mostrar_Click(object sender, EventArgs e)
        {
            
            Manejoparametros objm = new Manejoparametros();

            try
            {
                if (objm.mostrardatos())
                {
                   
                    txtnombre.Text = objm.StrNombre;
                    txtdocumento.Text = objm.StrDocumento;
                    txtarea.Text=objm.StrArea;
                    txtficha.Text = objm.StrFicha;
                    txttelefono.Text = objm.StrTelefono;
                    txtcorreo.Text = objm.StrCorreo;
                    txtcorreosena.Text = objm.StrCorreosena;
                }
                else
                {
                    MessageBox.Show(objm.Error);
                }

            }
            catch(Exception ex)
            {
                objm.Error = ex.Message;
            }
        }

        private void btnguardar_Click(object sender, EventArgs e)
        {
            Manejoparametros objm = new Manejoparametros();
            try 
            { 
                objm.StrNombre = txtnombre.Text;
                objm.StrDocumento = txtdocumento.Text;
                objm.StrArea = txtarea.Text;
                objm.StrFicha = txtficha.Text;
                objm.StrTelefono = txttelefono.Text;
                objm.StrCorreo = txtcorreo.Text;
                objm.StrCorreosena = txtcorreosena.Text;

               if( objm.cargarxml())
                {
                    MessageBox.Show("se realizo el guardado correctamente");

                    txtnombre.Text = "";
                    txtdocumento.Text = "";
                    txtarea.Text="";
                    txtficha.Text = "";
                    txttelefono.Text = "";
                    txtcorreo.Text = "";
                    txtcorreosena.Text = "";
                }
                else
                {
                    MessageBox.Show(objm.Error);
                }
                
            }
           catch(Exception ex)
            {
                objm.Error = ex.Message;
            }
        }
    }
}
