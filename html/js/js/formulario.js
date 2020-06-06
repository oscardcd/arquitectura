function leer_click()
{
    document.getElementById("enviar").addEventListener("click",mostrardatos)

}

window.addEventListener("load",leer_click);

function mostrardatos()
{
var nombre= document.getElementById("nombre").value;
var apellido= document.getElementById("apellido").value;
alert("hola "+nombre+" "+apellido+" gracias por llenar el formulario");
}

 





