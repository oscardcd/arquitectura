using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using LibConexionBD;
using LibLlenarGrid;
using System.Data.SqlClient;
using System.Windows.Forms;

namespace LNempleadoOCD 
{
    public class salario 
    {
        #region atributos
        private string identificacion;
        private double horas_tra;
        private double sal_devengado;
        private string error;
        private SqlDataReader sqlreader;

        #endregion
        #region propiedades
        public string Identificacion { get => identificacion; set => identificacion = value; }
        public double Horas_tra { get => horas_tra; set => horas_tra = value; }
        public double Sal_devengado { get => sal_devengado; set => sal_devengado = value; }
        public string Error { get => error; set => error = value; }
        public SqlDataReader Sqlreader { get => sqlreader; set => sqlreader = value; }
        #endregion
        #region constructor

        public salario()
        {
            identificacion = "";
            horas_tra = 0;
            sal_devengado = 0;
            error = "";
           
        }
        #endregion
        #region metodos publicos
        public bool manejo_sal()
        {
            try
            {
                if (calcular_sal())
                {
                    cons_salario();

                    SqlDataReader objreader;

                    objreader = Sqlreader;
                    if (!objreader.HasRows)
                    {

                        guar_salario();
                        return true;

                    }
                    else
                    {
                        double s_bd,h_bd;
                        objreader.Read();
                        s_bd = objreader.GetDouble(3);
                        sal_devengado = s_bd + sal_devengado;
                        h_bd = objreader.GetDouble(2);
                        horas_tra = h_bd + horas_tra;
                        act_salario();
                        objreader.Close();
                        return true;
                    }
                    
                }
                Error = error;
                return false;
            }
            catch (Exception ex)
            {
                error = ex.Message;
                return false;
            }

        }
        #region crub
        public bool guar_salario()
        {
            try
            {
                ClsConexion objCx = new ClsConexion();

                string sentencia = "execute usp_guardar_salario '" + identificacion + "','" + horas_tra + "','" + sal_devengado + "'";

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
            catch(Exception ex)
            {
                error = ex.Message;
                return false;
            }
        }

        public bool act_salario()
        {
            ClsConexion objCx = new ClsConexion();
            Sal_devengado = Math.Round(sal_devengado, 0);
            string sentencia = "execute usp_actualizar_salario '"+identificacion+"',"+ horas_tra + ","+ sal_devengado;

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
        public bool cons_salario()
        {
           
                ClsConexion objCx = new ClsConexion();

                string sentencia = "execute usp_consulta_salario '" + Identificacion + "'";

                if (!objCx.Consultar(sentencia, false))
                {
                    error = objCx.Error;
                    objCx = null;
                    return false;
                }
                sqlreader = objCx.Reader;
                error = "se realizo la consulta";
                return true;
                objCx = null;
            }
        #endregion

        #endregion
        #region metodos privados
        private bool calcular_sal()
        {
            try 
            {
                double hor_tra, basico, saldev;

                empleado empleado = new empleado();

                empleado.Identificacion = identificacion;

                if (!empleado.consultar_empl())
                {

                    MessageBox.Show(empleado.Error);
                    empleado = null;
                    return false;
                }
                else
                {
                    SqlDataReader objreader;

                    objreader = empleado.Sqlreader;
                    if (objreader.HasRows)
                    {
                        objreader.Read();
                        basico = objreader.GetDouble(4);
                        hor_tra = horas_tra;
                        saldev = ((basico / 30)/8) * hor_tra;
                        sal_devengado = saldev;

                        objreader.Close();
                        return true;
                    }
                    error = "no se encontro el usuario";
                    empleado = null;
                    return false;
                }
            }
            catch (Exception ex)
            {
                error = ex.Message;
                return false;
            }
        }

        
        #endregion
    }
}


