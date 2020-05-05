using System;

namespace Lib_logicadenegocio
{
    public class Operacion
    {
        #region atributos

        private double num1, num2, suma;
        private string error;
        #endregion

        #region metodos publicos
        public Operacion()
        {
            num1 = 0;
            num2 = 0;
            suma = 0;
            error = "";
        }
        public bool calcular()
        {
            if(!validar())
                return false;

            suma = num1 + num2;
            return true;
            
        }
        #endregion
        #region metodos privados
        private bool validar()
        {
            if(num1<0 || num2 <0)
            {
                error = "valores negativos";
                return false;
            }
            return true;
        }
        #endregion
       
        
    }
}
