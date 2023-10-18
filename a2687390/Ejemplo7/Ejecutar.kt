package com.harold2307.a2687390.Ejemplo7

fun main() {
    val persona = Persona("Johan",20)
    persona.imprimir()

    val aprendiz = Aprendiz("Maria",30,70)
    aprendiz.imprimir()
    aprendiz.aprobacion()

    val aprendiz1 = Aprendiz("Pepe", 20, 50)
    aprendiz1.imprimir()
    aprendiz1.aprobacion()
}