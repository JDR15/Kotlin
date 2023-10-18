package com.harold2307.a2687390.Ejemplo3

class Persona {
    var nombre:String = ""
        get() {
            return field
        }
        set(valor) {
            field = valor.toUpperCase()
        }

    var edad:Int = 0
        get() {
            return field
        }
        set(valor) {
            if (valor>=0){
                field = valor
            }else{
                field = 0
            }
        }
}