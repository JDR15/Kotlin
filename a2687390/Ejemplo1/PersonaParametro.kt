package com.harold2307.a2687390.Ejemplo1

class PersonaParametro (var nombre: String, var apellido:String, var edad:Int) {

    fun imprimir(){
        println("Nombre: $nombre $apellido, tiene $edad años")
    }

    fun ingresar(){
        if (edad >= 18){
            println("¡Bienvenido!")
        }else{
            println("No puede ingresar")
        }
    }
}