fun main() {
    nomeEIdadeComDefaultArguments(
        sobrenome = "De Tal",
        ultimoNome = "Xpto"
    )
    var nomeCompleto = nomeEIdadeComRetorno("Cesar", "Rodrigues")

    testeLambda(2.0) { xpto, edsdf ->

        return@testeLambda "teste funcao"
    }

    testeLambda2({
        return@testeLambda2 "teste teste"
    }, 2.0)

    val number: () -> Double = {
        2.0
    }

    println(number())

    val animais = listOf("Peixe", "Cachorro", "Gato")
    animais.forEach { animal ->

    }

    val b: String? = "2312312"
//    println(b?.length ?: 0)
//
//    if (b != null) {
//        println(b.length)
//    } else {
//        println(0)
//    }

//    b?.length ?: run {
//        val soma = 2 + 2
//        println(soma)
//    }
}

fun nomeEIdade(nome: String, idade: String) {
}

fun nomeEIdadeComRetorno(nome: String, idade: String): String {
    return "O nome é $nome e a idade é $idade"
}

fun nomeEIdadeComDefaultArguments(
    nome: String = "Fulano",
    sobrenome: String,
    ultimoNome: String
) {

}

fun testeLambda(number: Double, xpto: (number1: String, nome: String) -> String) {
    val sum = 2 + 2
    println("A string da minha função anônima é" +
            " ${xpto(number.toString(), number.toString())}")
}

fun testeLambda2(xpto: () -> String, number: Double) {
    val sum = 2 + 2
    println("A string da minha função anônima é ${xpto()}")
}

class NullSafety(
    val nome: String? = null,
    val sobrenome: String = "Rodrigues"
)