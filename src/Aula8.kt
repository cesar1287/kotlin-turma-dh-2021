fun main() {
    val bichano = Bichano()
    bichano.come()
    bichano.minhaRaca()
    println(bichano.sexo)

    /*
    Bichano -> Gato -> Animal

    Gato -> Animal
     */

    val gato = Gato()
    gato.minhaRaca()
    println(gato.sexo)
}

class Bichano: Gato() {

    override val sexo: String = "M"

    init {
        raca = "Gato"
    }

    override fun come() {
        super.come()
        println("Come do jeito bichano de ser")
    }
}

class Cachorro: Animal(
    sexo = "M"
) {

}

open class Gato: Animal(
    sexo = "F",
    cor = "Preto"
) {

}

class Leao: Animal() {

}

open class Animal(
    open val sexo: String = "O"
) {

    private var cor = ""
    protected var raca = "Nenhuma"

    constructor(sexo: String, cor: String): this(sexo) {
        this.cor = cor
    }

    open fun come() {
        println("Como do jeito default")
    }

    fun minhaRaca() {
        println("Minha raça é $raca")
    }
}

class Cliente1

open class Conta1(
    cliente1: Cliente1
)

class Poupanca(cliente1: Cliente1): Conta1(cliente1) {

}