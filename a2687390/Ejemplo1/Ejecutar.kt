package com.harold2307.a2687390.Ejemplo1

import com.harold2307.a2687390.Ejemplo1.PersonaConstructor

fun main(){
    /*val Persona1: Persona
    Persona1 = Persona()

    Persona1.inicializar("Johan", "Rodriguez", 20)
    Persona1.imprimir()
    Persona1.ingresar()*/

    val persona1 = PersonaConstructor("Johan","Rodriguez",18)
    persona1.imprimir()
    persona1.ingresar()
}