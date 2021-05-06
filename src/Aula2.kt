fun main() {
    val fred = Animal(nome = "Fred", tipo = "Cachorro")
    val bichano = Animal(nome = "Bichano", tipo = "gato", reino = "mamífero")
    val perebas = Animal(nome = "Perebas", tipo = "rato", tamanho = 15)
    fred.comer()
    fred.sobre()
}

class Animal(
    val nome: String,
    val tipo: String
) {

    var reino = ""

    constructor(nome: String, tipo: String, reino: String): this(nome, tipo) {
        this.reino = reino
    }

    constructor(nome: String, tipo: String, tamanho: Int): this(nome, tipo)

    constructor(nome: String, tipo: String, reino: String, tamanho: Int): this(nome, tipo)

    val nomeETipo = "$nome - $tipo"

    fun sobre() {
        println(nomeETipo)
    }

    fun comer() {

    }
}