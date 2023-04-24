package src.br.com.alura.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}