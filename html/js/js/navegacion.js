
  $(document).ready( function() {
    $("#ejemplo").on("click", function() {
        $("#contenido").load("ejemplo.html");
   
  })
});

  $(document).ready( function() {
    $("#figuras").on("click", function() {
        $("#contenido").load("figuras.html");
    })
  });

  $(document).ready( function() {
   $("#formulario").on("click",function(){
    $("#contenido").load("formulario.html");
   })
  });

 
