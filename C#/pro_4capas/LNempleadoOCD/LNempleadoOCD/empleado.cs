using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LibConexionBD;
using System.Data;
using System.Data.SqlClient;
using LibLlenarGrid;
using System.Windows.Forms;
using LibLlenarCombos;

namespace LNempleadoOCD
{
    public class empleado
    {
        #region atributos
        private string identificacion;
        private string nombre;
        private string areatrabajo;
        private string cargo;
        private double sueldo;
        private string error;
        private SqlDataReader sqlreader;


        #endregion
        #region propiedades

        public string Error { get => error; set => error = value; }
        public string Identificacion { get => identificacion; set => identificacion = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public string Areatrabajo { get => areatrabajo; set => areatrabajo = value; }
        public string Cargo { get => cargo; set => cargo = value; }
        public double Sueldo { get => sueldo; set => sueldo = value; }
        public SqlDataReader Sqlreader { get => sqlreader; set => sqlreader = value; }

        #endregion
        #region contructor
        public empleado()
        {
            identificacion = "";
            nombre = "";
            areatrabajo = "";
            cargo = "";
            sueldo = 0;
            error = "";
        }


        #endregion
        #region metodos publicos

        //metodo para guardar
        public bool guar_empl()
        {
            ClsConexion objCx = new ClsConexion();

            string sentencia = "execute usp_guardar_empleado '" + identificacion + "','" + nombre + "','" + areatrabajo + "','" + cargo + "'," + sueldo;

            if (!objCx.EjecutarSentencia(sentencia, false))
            {
                error = objCx.Error;
                objCx = null;
                return false;
            }

            error = "se guardo correctamente";
            objCx = null;
            return true;
        }
        public bool llenarcomb_empl(ComboBox cmbemp)
        {
            ClsLlenarCombos objc = new ClsLlenarCombos();
            objc.NombreTabla = "datosempl";
            objc.SQL = "usp_combo_empleado";
            objc.ColumnaTexto = "nombre";
            objc.ColumnaValor = "identificacion";
            if (!objc.LlenarCombo(cmbemp))
                {
                error = objc.Error;
                objc = null;
                return false;

            }
            objc = null;
            return true;
        }

        public bool actu_empl()
        {
            ClsConexion objCx = new ClsConexion();

            string sentencia = "execute usp_actualizar_empleado '" + identificacion + "','" + nombre + "','" + areatrabajo + "','" + cargo + "'," + sueldo;

            if (!objCx.EjecutarSentencia(sentencia, false))
            {
                error = objCx.Error;
                objCx = null;
                return false;
            }

            error = "se guardo correctamente";
            objCx = null;
            return true;
        }

        public bool eliminar_empl()
        {
            ClsConexion objCx = new ClsConexion();

            string sentencia = "execute usp_eliminar_empleado '" + identificacion + "'";

            if (!objCx.EjecutarSentencia(sentencia, false))
            {
                error = objCx.Error;
                objCx = null;
                return false;
            }

            error = "se elimino el registro correctamente";
            objCx = null;
            return true;
        }
       
        public bool consultar_empl()
        {
            ClsConexion objCx = new ClsConexion();

            string sentencia = "execute usp_consulta_empleado '" + Identificacion + "'";

            if (!objCx.Consultar(sentencia,false))
            {
                error = objCx.Error;
                objCx = null;
                return false;
            }
            sqlreader = objCx.Reader;
            error = "se realizo la consulta";
            objCx = null;
            return true;
        }

        public bool listar_empleados(DataGridView objdgv)
        {

            ClsLlenarGrid objgrid = new ClsLlenarGrid();

            objgrid.NombreTabla = "datosempleados";
            objgrid.SQL = "EXECUTE usp_listar_empleados";

            if (!objgrid.LlenarGrid(objdgv))
            {
                error = objgrid.Error;
                objgrid = null;
                return false;
            }
            objgrid = null;
            return true;
        
        }
        #endregion
        #region metodos privados

        #endregion
  
    }
}
