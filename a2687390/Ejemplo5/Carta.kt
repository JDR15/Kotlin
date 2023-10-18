package com.harold2307.a2687390.Ejemplo5

class Carta (val tipo:TipoCarta, val numero:Int) {
    fun imprimir(){
        println("Carta: $tipo Valor: $numero")
    }
}


fun main(){
    val carta = Carta(TipoCarta.DIAMANTE,10)
    carta.imprimir()

    val cart = TipoCarta.values()
    val  ram = cart.random()

    val carta2 = Carta(ram,Matematicas.aleatorio(1,10))
    carta2.imprimir()
}