package src.br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)

            return true
        }

        return false
    }
}