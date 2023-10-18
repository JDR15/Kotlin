package com.harold2307.a2687390

fun sueldoEmpleado(){
    val sueldos: DoubleArray
    sueldos = DoubleArray(5)

    for (i in 0 .. 4){
        println("Ingrese el sueldo del empleado")
        sueldos[i] = readln().toDouble()
    }
    for (i in 0 .. 4){
        sueldos.sortDescending()
        println(sueldos[i])
    }
}

fun main(){
    sueldoEmpleado()
}