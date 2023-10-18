package com.harold2307.a2687390.Ejemplo4

fun main(){
    val articulo1 = Producto(1,"Leche",2000.0)
    val articulo2 = Producto(2,"Carne",150000.0)

    println(articulo1)
    println(articulo2)

    articulo1.precio = 5000.0
    println(articulo1)

    var articulo3 = articulo2.copy()
    println(articulo3)

    articulo3.codigo=3
    articulo3.precio=250000.0
    println(articulo3)
}