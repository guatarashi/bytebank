package src.br.com.alura.bytebank.teste

fun testaExpressao() {

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
}

fun valorComTaxa(valorRecebido: Double?): Double? {
    if(valorRecebido != null) {
        return valorRecebido + 0.1
    }
    return null
}