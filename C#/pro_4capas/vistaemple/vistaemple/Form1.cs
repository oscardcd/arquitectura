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
using System.Data.SqlClient;

namespace vistaemple
{
    public partial class empleados : Form
    {
        public empleados()
        {
            InitializeComponent();
        }
      
        #region btnguarda
        private void btnguardar_Click(object sender, EventArgs e)
        {
         
            try
            {
                string id, nombre, are, cargo;
                double sueldo;

                id = txtident.Text;
                nombre = txtnombre.Text;
                are = txtarea.Text;
                cargo = txtcargo.Text;
                sueldo = Convert.ToDouble(txtsueldo.Text);

                empleado objem = new empleado();

                objem.Identificacion = id;
                objem.Nombre = nombre;
                objem.Areatrabajo = are;
                objem.Cargo = cargo;
                objem.Sueldo = sueldo;

                if(!objem.guar_empl())
                {
                    MessageBox.Show(objem.Error);
                    objem = null;
                    return;
                }
                MessageBox.Show(objem.Error);
                listar_emp();
                objem = null;
                return;
            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
                return;
            }

        }
        #endregion
        #region btn consultar
        private void btnconsultar_Click(object sender, EventArgs e)
        {
            consultaremp();
        }
        private void consultaremp()
        {
            string id;

            id = txtident.Text;
            try
            {
                
                empleado objemp = new empleado();

                objemp.Identificacion = id;

                if (!objemp.consultar_empl())
                {
                    MessageBox.Show(objemp.Error);
                    objemp = null;
                    return;
                }
                else
                {
                    SqlDataReader objreader;

                    objreader = objemp.Sqlreader;
                    if (objreader.HasRows)
                    {
                        objreader.Read();
                        txtnombre.Text = objreader.GetString(1);
                        txtarea.Text = objreader.GetString(2);
                        txtcargo.Text = objreader.GetString(3);
                        txtsueldo.Text = objreader.GetDouble(4).ToString();
                        objreader.Close();
                        objemp = null;
                    }
                    else
                    {
                        MessageBox.Show("no se encontro el usuario");
                        objemp = null;
                    }
                }
               
            }
            catch (Exception es)
            {
                MessageBox.Show(es.Message);
                return;
            }
        }

        
        #endregion
        #region btn actualizar
        private void btnactualizar_Click(object sender, EventArgs e)
        {

            string id, nombre, are, cargo;
            double sueldo;
            try
            {
                id = txtident.Text;
                nombre = txtnombre.Text;
                are = txtarea.Text;
                cargo = txtcargo.Text;
                sueldo = Convert.ToDouble(txtsueldo.Text);

                empleado objem = new empleado();

                objem.Identificacion = id;
                objem.Nombre = nombre;
                objem.Areatrabajo = are;
                objem.Cargo = cargo;
                objem.Sueldo = sueldo;

                if(!objem.actu_empl())
                {
                    MessageBox.Show(objem.Error);
                    objem = null;
                }
                MessageBox.Show(objem.Error);
                listar_emp();
                objem = null;


            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
                return;
            }
        }
        #endregion
        #region eliminar
        private void btneliminar_Click(object sender, EventArgs e)
        {
            string id;
            try
            {
                id = txtident.Text;

                empleado objem = new empleado();

                objem.Identificacion = id;

                if (!objem.eliminar_empl())
                {
                    MessageBox.Show(objem.Error);
                    objem = null;
                    return;
                }
                MessageBox.Show(objem.Error);
                listar_emp();
                objem = null;
                return;
            }
            catch(Exception es)
            {
                MessageBox.Show(es.Message);
                return;
            }

        }
        #endregion
        #region listar
        private void btnlistar_Click(object sender, EventArgs e)
        {
            listar_emp();
        }

        private void listar_emp()
        {
            empleado objempl = new empleado();

            if(!objempl.listar_empleados(dtvempl))
            {
                MessageBox.Show(objempl.Error);
                objempl = null;
                return;
            }
            return;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            llenarComEmpl();
            listar_emp();
        }
        private void llenarComEmpl()
        {
            empleado obje = new empleado();
            if (!obje.llenarcomb_empl(cbmemp))
            {
                MessageBox.Show(obje.Error);
                return;
            }
        }
        #endregion

        private void ingresoDatosToolStripMenuItem_Click(object sender, EventArgs e)
        {
            nomina fornomina = new nomina();

            fornomina.Show();
            this.Hide();
        }
    }
}
