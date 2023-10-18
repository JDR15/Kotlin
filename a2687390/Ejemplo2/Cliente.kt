package com.harold2307.a2687390.Ejemplo2

class Cliente(var nombre:String, var saldoCuenta:Float) {

    fun consignar(valor:Float){
        this.saldoCuenta += valor
    }

    fun retirar(valor: Float){
        this.saldoCuenta -= valor
    }

    fun consultarSaldo(){
        println("$nombre - Este es su saldo: $saldoCuenta")
    }
}