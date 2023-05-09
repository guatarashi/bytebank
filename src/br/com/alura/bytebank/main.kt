package src.br.com.alura.bytebank

import src.br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "000000-0700"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep = "000000-0700"
    )

    println(endereco.equals(endereco))
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    imprime(endereco)
    imprime(enderecoNovo)

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}