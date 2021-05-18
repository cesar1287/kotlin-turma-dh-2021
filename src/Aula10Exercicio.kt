import java.util.*

fun main() {
    println("Digite 1 para Ingresso Normal e 2 para VIP")
    val scanner = Scanner(System.`in`)
    val ingressoUm = scanner.nextInt()

    when (ingressoUm) {
        1 -> {
            println("Você escolheu o ingresso Normal")
        }
        2 -> {
            println(
                "Que legal, agora escolha o tipo do VIP, 1 para" +
                        " Camarote Superior e 2 para Camarote Inferior"
            )
            val tipoVip = scanner.nextInt()
            if (tipoVip == 1) {
                val superior = CamaroteSuperior(100.0, 50.0)
                println(
                    "Tudo OK, o valor do ingresso no " +
                            "camarote superior é ${superior.valorIngresso()} reais"
                )
            } else {
                val inferior = CamaroteInferior(100.0, 2)
                println(
                    "Tudo OK, o valor do ingresso no " +
                            "camarote inferior é ${inferior.valorIngresso()} reais"
                )
            }
        }
        else -> {
            println("Você digitou um valor inválido")
        }
    }
}

abstract class Ingresso {

    abstract val valorReais: Double

    fun imprimeValor() {
        println("O valor do ingresso é $valorReais")
    }
}

open class Vip(
    override val valorReais: Double,
    val valorAdicional: Double = 0.0
) : Ingresso() {

    fun valorIngresso(): Double {
        return valorReais + valorAdicional
    }
}

class Normal(
    override val valorReais: Double
) : Ingresso() {

    fun imprimeIngresso() {
        println("Ingresso Normal")
    }
}

class CamaroteInferior(
    valorReais: Double,
    val localizacao: Int
) : Vip(valorReais) {

    fun localizacaoIngresso() {
        println("A localização do ingresso é $localizacao")
    }
}

class CamaroteSuperior(
    valorReais: Double,
    valorAdicional: Double
) : Vip(valorReais, valorAdicional)