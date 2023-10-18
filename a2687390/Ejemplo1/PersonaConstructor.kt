package com.harold2307.a2687390.Ejemplo1

class PersonaConstructor constructor(nombre:String, apellido:String, edad:Int) {
    var nombre :String = nombre
    var apellido: String = apellido
    var edad :Int = edad

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