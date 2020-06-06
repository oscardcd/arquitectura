window.addEventListener("load",cambio);

function cambio()
  {
    document.getElementById("cambiartexto").addEventListener("click",cambiartext);
    document.getElementById("cambiarclase").addEventListener("click",cambiarclase);
    document.getElementById("quitarclase").addEventListener("click",quitarclase);
  }

  function cambiartext()
  {
    document.getElementById("p1").innerHTML="primer parrafo cambiardo";
    document.getElementsByTagName("p")[1].innerHTML="segundo parrafo cambiado";
    document.getElementsByClassName("miClase")[0].innerHTML="tercer parrafo cambiado";
  }

  function cambiarclase()
  {
    document.getElementById("p1").setAttribute("class","");
    document.getElementById("p2").className="miClase1";
    document.getElementById("p3").className="miClase1";

  }

  function quitarclase()
  {
    document.getElementById("p1").setAttribute("class","");
    document.getElementById("p2").className="";
    document.getElementById("p3").className="";

  }