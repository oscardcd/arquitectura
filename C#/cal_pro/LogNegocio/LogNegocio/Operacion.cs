using System;

namespace LogNegocio
{
    public class Operacion
    {
        #region atributos
        private double num1, num2, num3, prom;

        private string error;
        #endregion
        #region propiedades
        public double setnum1
        {
            set { num1 = value; }
            
        }
        public double setnum2
        {
            set { num2 = value; }
        }
        public double setnum3
        {
            set { num3 = value; }
        }
        public double getprom
        {
            get { return prom; }
        }

        public string geterror
        {
            get { return error; }
        }
        #endregion
        #region metodos publicos
        public Operacion()
        {
            num1 = 0;
            num2 = 0;
            num3 = 0;
            error = "";
        }

        public bool calcular()
        {
            if (!validar() == true)
            { 
            return false;
             }
            else
            {
                try
                {
                    prom = (num1 + num2 + num3) / 3;
                    return true;
                }
                catch (Exception e)
                {
                    error = e.Message;
                    return false;
                }
            }
        }
        #endregion
        #region metodos privados
        private bool validar()
        {
            if (num1 < 0 || num2 < 0 || num3 < 0)
            {
                error = "los valores son negativos";
                return false;
            }
            else
            {
                if (num1 > 5 || num2 > 5 || num3 > 5)
                {
                    error = "los valores son mayor a 5 ";
                    return false;
                }
            }
            return true;

        }
        #endregion
    }
}
