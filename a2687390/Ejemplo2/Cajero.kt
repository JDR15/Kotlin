package com.harold2307.a2687390.Ejemplo2

class Cajero {

    val Cliente1: Cliente= Cliente("Jaider", 100000f)
    val Cliente2: Cliente=Cliente("Checho", 10000f)
    val Cliente3: Cliente=Cliente("Johan", 300000f)

    fun transacciones(){
        Cliente1.consignar(5000f)
        Cliente2.consignar(10000f)
        Cliente3.consignar(3000f)
        Cliente3.retirar(150000f)
    }

    fun saldoTotal(){
        val total = Cliente1.saldoCuenta + Cliente2.saldoCuenta + Cliente3.saldoCuenta
        println("El cajero tiene un saldo de: $total")
        Cliente1.consultarSaldo()
        Cliente2.consultarSaldo()
        Cliente3.consultarSaldo()
    }
}