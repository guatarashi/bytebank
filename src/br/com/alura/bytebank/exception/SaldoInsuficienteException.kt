package src.br.com.alura.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
): Exception(mensagem)