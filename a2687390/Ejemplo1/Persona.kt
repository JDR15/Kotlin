package com.harold2307.a2687390.Ejemplo1

class Persona {
    var nombre: String=""
    var apellido: String=""
    var edad: Int=0


    fun inicializar(nombre:String,apellido:String,edad:Int){
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }

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


