using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Windows.Forms;


namespace libparametrosOdcd
{
    public class Manejoparametros
    {
        #region atributos
        private String strNombre;
        private String strDocumento;
        private String strArea;
        private String strFicha;
        private String strTelefono;
        private String strCorreo;
        private String strCorreosena;
        private String strArchivo;
        private String strError;

        private XmlDataDocument objDcto;
        private XmlNode objNodo;
        #endregion

        #region contructor
        public Manejoparametros()
        {
            objDcto = new XmlDataDocument();
            strNombre = "";
            strDocumento = "";
            strArea = "";
            strFicha = "";
            strTelefono = "";
            strCorreo = "";
            strCorreosena = "";
            strArchivo = "";
            StrError = "";


        }
        #endregion
        #region propiedades
        public string StrNombre { get => strNombre; set => strNombre = value; }
        public string StrDocumento { get => strDocumento; set => strDocumento = value; }
        public string StrArea { get => strArea; set => strArea = value; }
        public string StrFicha { get => strFicha; set => strFicha = value; }
        public string StrTelefono { get => strTelefono; set => strTelefono = value; }
        public string StrCorreo { get => strCorreo; set => strCorreo = value; }
        public string StrCorreosena { get => strCorreosena; set => strCorreosena = value; }
        public string Error { get { return StrError; } set { StrError = value; } }

        public string StrError { get => strError; set => strError = value; }
        #endregion

        #region metodos publicos

        

        public bool mostrardatos()
        {

            if (ver_archivo())
            {
                try
                {

                    objDcto.Load(strArchivo);

                    objNodo = objDcto.SelectSingleNode("//Nombre");
                    strNombre = objNodo.InnerText;


                    objNodo = objDcto.SelectSingleNode("//Documento");
                    strDocumento = objNodo.InnerText;

                    objNodo = objDcto.SelectSingleNode("//Area");
                    strArea = objNodo.InnerText;

                    objNodo = objDcto.SelectSingleNode("//Ficha");
                    strFicha = objNodo.InnerText;

                    objNodo = objDcto.SelectSingleNode("//Telefono");
                    strTelefono = objNodo.InnerText;

                    objNodo = objDcto.SelectSingleNode("//Correo");
                    strCorreo = objNodo.InnerText;

                    objNodo = objDcto.SelectSingleNode("//Correosena");
                    strCorreosena = objNodo.InnerText;

                    return true;
                }
                catch (Exception ex)
                {
                    StrError = ex.Message;
                    return false;
                }
            }
            else
             return false;
        }

        public bool cargarxml()
        {
            if (ver_archivo())
            {
                try
                {
                    objDcto.Load(strArchivo);

                    objNodo = objDcto.SelectSingleNode("//Nombre");
                    objNodo.InnerText = StrNombre;

                    objNodo = objDcto.SelectSingleNode("//Documento");
                    objNodo.InnerText = StrDocumento;

                    objNodo = objDcto.SelectSingleNode("//Area");
                    objNodo.InnerText = StrArea;

                    objNodo = objDcto.SelectSingleNode("//Ficha");
                    objNodo.InnerText = StrFicha;

                    objNodo = objDcto.SelectSingleNode("//Telefono");
                    objNodo.InnerText = StrTelefono;

                    objNodo = objDcto.SelectSingleNode("//Correo");
                    objNodo.InnerText = StrCorreo;

                    objNodo = objDcto.SelectSingleNode("//Corresena");
                    objNodo.InnerText = StrCorreosena;

                    objDcto.Save(strArchivo);
                    return true;
                }
                catch (Exception ex)
                {
                    StrError = ex.Message;
                    return false;
                }
            }
            else
               return false;

        }
        #endregion
        #region metodos privados
        private bool ver_archivo()
        {
            if (strArchivo == "")
            {
                try
                {
                    string strNombreArchivo;
                    strNombreArchivo = AppDomain.CurrentDomain.BaseDirectory;
                    strNombreArchivo = strNombreArchivo.Substring(0, strNombreArchivo.Length - 1);
                    if (strNombreArchivo.LastIndexOf("/") > 0)
                    {
                        //Es una aplicacion windows
                        strArchivo = strNombreArchivo.Replace("/", "\\");
                        strArchivo = strArchivo + "\\estudiantes.xml";
                    }
                    else
                    {
                        //Es una aplicacion web
                        strArchivo = Application.StartupPath + "\\estudiantes.xml";
                    }
                    return true;
                }
                catch (Exception ex)
                {
                    StrError = ex.Message;
                    return false;
                }
            }
            else
            {
                StrError = "archivo no valido";
                return false;
            }
        }
        #endregion
    }
}
