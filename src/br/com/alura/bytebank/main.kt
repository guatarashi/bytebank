package src.br.com.alura.bytebank

import src.br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco()

    println(endereco)
//    println(Cliente())

    val objeto: Any = Any()

    imprime(endereco)

    val teste: Any = imprime(endereco)
    println(teste)
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}