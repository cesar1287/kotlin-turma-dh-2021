fun main() {
    val cesar = Cliente(1234, "Rodrigues", "23123", 2343242)
    val contaPoupancaCaixa = ContaPoupanca(cliente = cesar)
    contaPoupancaCaixa.deposito(200.0)
    contaPoupancaCaixa.recolherJuros()

    val contaCorrentItau = ContaCorrente(cliente = cesar)
    contaCorrentItau.sacar()
}

class Cliente(
    numeroCliente: Int,
    sobrenome: String,
    rg: String,
    cpf: Int
)

open class Conta(
    cliente: Cliente,
) {

    var saldo: Double = 0.0

    fun deposito(valor: Double) {
        saldo += valor
        println("O novo saldo é $saldo")
    }

    open fun sacar() {
        //fazer saque
    }

    fun consultarSaldo() {
        //consultar saldo
    }
}

class ContaPoupanca(
    cliente: Cliente,
    var taxaJuros: Double = 3.5
): Conta(cliente = cliente) {

    fun recolherJuros() {
        val juros = saldo * (taxaJuros / 100)
        saldo += juros
        println("Meu novo saldo é $saldo")
    }
}

class ContaCorrente(
    cliente: Cliente
): Conta(cliente = cliente) {

    fun depositarCheque() {
        //depositar um novo cheque
    }

    override fun sacar() {
        //sacar conta corrente
    }
}