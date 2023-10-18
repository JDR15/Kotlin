package com.harold2307.a2687390.Ejemplo7

class Aprendiz(nombre:String,edad:Int, val nota:Int):Persona(nombre,edad) {
    override fun imprimir() {
        super.imprimir()
        println("Nota: $nota")
    }

    fun aprobacion(){
        if (nota>=70){
            println("El/La aprendiz $nombre aprobo")
        }else{
            println("El/La aprendiz $nombre reprobo")
        }
    }
}