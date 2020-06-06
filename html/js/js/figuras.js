
window.addEventListener("load",mi_inicio);
  


  function mi_inicio()
  {
  document.getElementById("cuadrado").addEventListener("click",ccuadrado);
  document.getElementById("circulo").addEventListener("click",ccirculo);
  document.getElementById("limpiar").addEventListener("click",limpiar);

  }

  function ccirculo()
  {
    document.getElementById("circulof").innerHTML="<div id='lcir' class='fcir'><p>CIRCULO</p></div>";
  }
  function ccuadrado(){
    document.getElementById("cuadradof").innerHTML="<div id='lcua' class='fcua'><p>CUADRADO</p></div>";
 }

 function limpiar()
 {
   document.getElementById("lcir").className="";
   document.getElementById("lcir").innerHTML="";
   document.getElementById("lcua").className="";
   document.getElementById("lcua").innerHTML="";
 }

