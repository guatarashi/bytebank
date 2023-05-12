package src.br.com.alura.bytebank

import src.br.com.alura.bytebank.modelo.Endereco

fun main() {

    println("inicio main")
    10/0
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}
