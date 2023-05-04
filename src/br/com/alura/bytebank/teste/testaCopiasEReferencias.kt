package src.br.com.alura.bytebank.teste

import src.br.com.alura.bytebank.modelo.Cliente
import src.br.com.alura.bytebank.modelo.ContaCorrente
import src.br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 1000
    var numeroY = numeroX

    numeroY++

    println("número X $numeroX")
    println("número Y $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)
    val contaJoao = ContaCorrente(joao, 1003)

    var contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 1
    ), 1004)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}