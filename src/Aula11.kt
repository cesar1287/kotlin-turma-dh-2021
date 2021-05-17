fun main() {
    val saoPaulo = SaoPaulo()
    saoPaulo.impostoXpto()
}

class SaoPaulo: RegraDeOuro {

    override val icms: Double = 9.0

    override fun colherEstadoXpto(): Double {
        TODO("Not yet implemented")
    }

    override fun colherEstadoXyz(): String {
        TODO("Not yet implemented")
    }

    override fun colherEstadoX() {
        TODO("Not yet implemented")
    }


}

interface RegraDeOuro {

    val icms: Double

    fun colherEstadoXpto(): Double

    fun colherEstadoXyz(): String

    fun colherEstadoX()
    
    fun impostoXpto() {
        println("wowe9riuwe")
    }
}

abstract class RegraDePrata {

    val icms = 7.0

    abstract fun colherEstadoXpto1(): Double

    abstract fun colherEstadoXyz1(): String

    abstract fun colherEstadoX1()
}