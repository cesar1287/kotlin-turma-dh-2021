fun main() {
    val fred = Animal()
    val fredPreenchido = Animal(tipo = "Cachorro")
    val bichano = Animal(nome = "Bichano", tipo = "gato", reino = "mamífero")
    val perebas = Animal(nome = "Perebas", tipo = "rato", tamanho = 15)

    fred.nome = "Fred"
    fred.tipo = "gato"

    println("O nome é ${fred.nome} e meu tipo é ${fred.tipo}")
    fred.comer()
    fred.sobre()
}

class Animal(
    var nome: String = "Sem nome",
    var tipo: String = "Sem tipo"
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