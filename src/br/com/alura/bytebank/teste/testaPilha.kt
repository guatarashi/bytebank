package src.br.com.alura.bytebank.teste

fun testaPilha() {

    println("inicio main")
    testaComportamentosConta()
    println("fim main")
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
        throw ArithmeticException()
    }
    println("fim funcao2")
}
