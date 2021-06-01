import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException
import kotlin.jvm.Throws

fun main() {

    val exercicio1: MutableList<String> = mutableListOf()
    exercicio1.add("Pato")
    exercicio1.add("Cachorro")
    exercicio1.add("Gato")
    try {
        //println(exercicio1[1000])
    } catch (index: IndexOutOfBoundsException) {
        //println(index.stackTraceToString())
    }

    val exercicio2: MutableList<String> = mutableListOf()
    exercicio2.add("Pato")
    exercicio2.add("Cachorro")
    exercicio2.add("Gato")

    try {
        //println(exercicio2[2])
    } catch (ex: NullPointerException) {
        //println(ex.stackTraceToString())
    } catch (ex: IndexOutOfBoundsException) {
        //println(ex.stackTraceToString())
    }

    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }
}

class CalculoMatematico {

    @Throws(ArithmeticException::class)
    fun divisao(x: Int, y: Int): Int {
        return if (y == 0) {
            throw ArithmeticException("Divisão por zero")
        } else {
            x / y
        }
    }
}