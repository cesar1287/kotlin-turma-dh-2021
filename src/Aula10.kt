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

    override fun acelerar() {
        println("Uma ferrari acelerando")
    }

    override fun frear() {
        println("Uma ferrari freando")
    }

    override fun monitorEstilizado() {
        println("Monitor estilizado")
    }
}