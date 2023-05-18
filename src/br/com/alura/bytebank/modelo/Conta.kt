package src.br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }



    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
){

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}