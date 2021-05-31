import kotlin.jvm.Throws

fun main() {

    try {
        testeThrown()
    } catch (ex: java.lang.ArithmeticException) {

    }

    try {

        val teste = 2 / 1

        val teste1: String? = null
        teste1?.length ?: run {

        }

        val teste2 = listOf<Int>()
        val item3 = teste2.getOrNull(3)
        println(item3)
    } catch (xpto1: ArithmeticException) {
        println("Not a number")
    } catch (exception: Exception) {
        println(exception.localizedMessage)
    }
}

@Throws(java.lang.ArithmeticException::class)
fun testeThrown() {
    2/0
}