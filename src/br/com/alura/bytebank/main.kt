package src.br.com.alura.bytebank

import src.br.com.alura.bytebank.modelo.Endereco

fun main() {

    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
    }
}