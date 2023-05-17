package src.br.com.alura.bytebank

import java.lang.ArithmeticException
import java.lang.ClassCastException
import src.br.com.alura.bytebank.modelo.Endereco

fun main() {

    println("inicio main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw ArithmeticException()
    }
    println("fim funcao2")
}
