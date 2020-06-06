using System;

namespace LogNegocio
{
    public class Operacion
    {
        #region atributos
        private double valorh, horas, salario,;
        string error;
        #endregion
        #region propiedades
        public double setvalh { set { valorh = value; } }
        public double Horas { set => horas = value; }
        public double Salario { get => this.salario; }       
        public string Error { get => this.error; }
        
        #endregion
        #region metodos publicos
        public Operacion()
        {
            valorh = 0;
            horas = 0;
            salario = 0;
            error = "";
        }

        public bool calcular()
        {
            if (!validar() == true)
                return false;
            try 
            {
                salario = valorh * horas;
                return true;
            } 
            catch(Exception ex) 
            {
                error = ex.Message;
                return false;
            }
        }
        #endregion
        #region metodos privados
        private bool validar()
        {
            if(valorh<0 || horas<0)
            {
                error = "los valores son negativos";
                return false;
            }
            return true;

            
        }
        #endregion
    }
}
