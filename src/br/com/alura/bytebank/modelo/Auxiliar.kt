package src.br.com.alura.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            return salario * 0.1 // To change initializer of created properties use file | Settings | File Templates.
        }
}