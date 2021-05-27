import java.text.NumberFormat
import java.util.*

fun main() {
    val nome = "Cesar Rodrigues"
    println(nome.colocarSobrenome(lastName = "Nascimento"))

    val cesarItau = ContaCorrente(1234, taxaDeOperacao = 2.0)
    cesarItau.depositar(102.0)
    cesarItau.printarOSaldoAtual()

    println("Digite o valor em reais:")
    val scanner = Scanner(System.`in`)
    val real = readLine()?.toDouble()
    println(real?.formatarParaReal())
}

fun String.colocarSobrenome(lastName: String) = "$this $lastName"

fun ContaCorrente.printarOSaldoAtual() = println("O meu saldo é ${this.saldo}")

fun Double.formatarParaReal(): String {
    val numberFormat = NumberFormat
        .getCurrencyInstance(Locale("pt", "BR"))
    return numberFormat.format(this)
}

fun Int.formatarInteiro() {
    println(this)
}

