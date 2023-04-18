package src

fun testaCopiasEReferencias() {
    val numeroX = 1000
    var numeroY = numeroX

    numeroY++

    println("número X $numeroX")
    println("número Y $numeroY")

    val contaJoao = ContaCorrente("João", 1003)
    contaJoao.titular = "João"

    var contaMaria = ContaPoupanca("Maria", 1004)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}