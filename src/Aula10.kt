fun main() {

    val ferrariF50 = Ferrari()
    ferrariF50.acelerar()
    ferrariF50.monitorEstilizado()
}

abstract class Automovel {

    abstract val nome: String

    abstract fun acelerar()

    abstract fun frear()

    abstract fun monitorEstilizado()
}

class Ferrari: Automovel() {

    override var nome: String = "hsdds"

    var motor = "530cv"

    val cor = "vermelho"

    override fun acelerar() {
        println("Uma ferrari acelerando")
    }

    override fun frear() {
        println("Uma ferrari freando")
    }

    override fun monitorEstilizado() {
        println("Monitor estilizado")
    }

    override fun equals(other: Any?): Boolean {
        val outraFerrari = other as? Ferrari
        return  when(other) {
            is Ferrari -> {
                this.nome == outraFerrari?.nome
            }
            is Double -> {
                true
            }
            else -> {
                super.equals(other)
            }
        }
    }

    override fun toString(): String {
        return "O meu nome é $nome, eu tenho $motor cavalos de potência e " +
                "minha cor é $cor"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}