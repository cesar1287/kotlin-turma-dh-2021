fun main() {

    val listaImutavel = listOf(1, "siufhsd", 1.0, 10.0f)
    val listaMutavel = mutableListOf(1, 2, 3, 4)
    listaMutavel.add(5)

    val setImutavel = setOf(1, 2, 3, 4, 2)
    val setImutavel1 = setOf("A", "a", "b", "c")
//    println(setImutavel.last())
//    println(setImutavel1)

    val setMutavel = mutableSetOf(4, 3, 2, 1, 4, 2)
    println(setMutavel)
    val teste = setMutavel.add(5)
    if (teste) {
        //println(setMutavel)
    } else {
        //println("Item já existe no set")
    }

    val cesarContaCorrente = ContaCorrente(1234, taxaDeOperacao = 10.0)
    val eduContaPoupanca = ContaPoupanca(4321, limite = 100.0)
    val cesarContaCorrente2 = ContaCorrente(1234, taxaDeOperacao = 10.0)
    val listConta = listOf(cesarContaCorrente, eduContaPoupanca)
    val setConta = setOf(cesarContaCorrente, eduContaPoupanca, cesarContaCorrente2)
    //println(setConta)

    val mapImutavel = mapOf(
        123 to listConta,
        321 to eduContaPoupanca,
        1234 to "String"
    )

    mapImutavel.forEach {
        println("A minha key é ${it.key} e meu value é ${it.value}")
    }

    val mapMutavel = mutableMapOf(
        123 to cesarContaCorrente,
        1234 to eduContaPoupanca
    )

    mapMutavel[4321] = cesarContaCorrente2

    mapMutavel.remove(4321)

    println(mapMutavel)
}