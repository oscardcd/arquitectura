'use strict'
//npm install nodemon --save-dev
//npm install express --save

//declaracion de librerias a usar en el servidor:
const express =  require('express');
//definimos el uso de app como interprete de express
const app=express();
//declaramos el puerto del servicio:
const port = 3800;

//mensaje de bienvenida desde el servidor:
app.listen(port, ()=>{
    console.log('bienvenidos a mi servidor Nodejs');
    console.log('puedes ingresar a la url: localhost:3800//');
    console.log('prueba1')
  
});
