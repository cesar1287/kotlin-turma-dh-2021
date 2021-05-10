fun main() {
    val cesar = Cliente("Cesar", "Rodrigues")
    val cesarItau = Conta(1234, 0.0, cesar)
}

class Conta(
    val numero: Int,
    var saldo: Double,
    val titular: Cliente
)

class Cliente(
    val nome: String,
    val sobrenome: String
)