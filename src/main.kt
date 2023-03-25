package src

fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.setSaldo(200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.setSaldo(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo())

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.getSaldo())

    println("depositando na conta do Fran")
    contaFran.deposita(70.0)
    println(contaFran.getSaldo())

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.getSaldo())

    println("sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.getSaldo())

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.getSaldo())

    println("Saque em excesso na conta do Fran")
    contaFran.saca(500.0)
    println(contaFran.getSaldo())

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(300.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.getSaldo())
    println(contaFran.getSaldo())
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo -= valor

            return true
        }

        return false
    }

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(saldo: Double) {
        if (saldo > 0) {
            this.saldo = saldo
        }
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 1000
    var numeroY = numeroX

    numeroY++

    println("número X $numeroX")
    println("número Y $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joão: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

fun testaLaco() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 1 until 5) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)
}