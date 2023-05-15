package src.br.com.alura.bytebank

import java.lang.ClassCastException
import src.br.com.alura.bytebank.modelo.Endereco

fun main() {

    println("inicio main")

    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    // early return
//    val valorComTaxa: Double? = valorComTaxa(100.0)

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }

    funcao1()
    println("fim main")
}

fun valorComTaxa(valorRecebido: Double?): Double? {
    if(valorRecebido != null) {
        return valorRecebido + 0.1
    }
    return null
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
        endereco as Endereco
    }
    println("fim funcao2")
}
