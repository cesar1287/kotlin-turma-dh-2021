fun main() {

    //val - imutável - não consigo alterar
    //var - mutável - consigo alterar
    val inteiro: Int = 1
    val inteiro2 = 2
    val numeroUltraGrande: Long = 3242342342342342343
    val texto = "César"
    val ehMaior = true
    val decimalMenor: Float = 2.0f
    val decimalMenor1 = 2.0f
    var decimalMaior = 2.28347238472398

    //5 / 2
    //println(2 == 1)

    /* E      OU
    v v v    v v v
    v f f    v f v
    f v f    f v v
    f f f    f f f
     */

    //println(!false)

    //println("Hello world!")
    decimalMaior = 2.0
    var pets = listOf("Cachorro", "Gato", "Tartaruga", "Ramster")
    val petsMutavel = mutableListOf("Cachorro", "Gato", "Tartaruga", "Peixe")
    petsMutavel.add("Ramster")
    //println(petsMutavel.last())
    pets = listOf("Cobra", "Leão", "Onça", "Zebra")

    //isdfjidsjfs
    /*
    dsijcisdf
    sdufhsduhf
    dsufhdsuf
    sduhfhusdfhsd
    sidfjsdfi
     */

    val numero = 3

//    when {
//        numero < 3 -> println("Menor que 3")
//        numero > 3 -> println("Maior que 3")
//        else -> println("Caiu no else")
//    }

//    for (num in 1..100) {
//        println(num)
//    }
//    petsMutavel.forEach { pet ->
//        println(pet)
//    }
//    var x = 0
//    while (x <= 2) {
//        println(x)
//        x++
//    }
    /*
     0 x < 2 - 0
     1 x < 2 - 1
     2 x < 2
     */

//    meuNome()
//    meuNomeCompleto("Cesar", "Rodrigues")
//    val nome = meuNomeCompletoComRetorno("Eduardo", "Misina")
//    println(nome)
    println(questao3(5))
    questao4()
}

fun questao3(numero: Int): Boolean {
    return numero % 2 == 0
}

fun questao4() {
    var cont = 0
    var numero = 1
    while (cont < 100) {
        if (numero % 2 != 0) {
            println(numero)
            cont++
        }

        numero++
    }
}

fun meuNome() {
    meuNomeCompleto("Victor", "Motta")
    println("Cesar Rodrigues")
}

fun meuNomeCompleto(nome: String, sobrenome: String) {
    println("$nome $sobrenome")
}

fun meuNomeCompletoComRetorno(nome: String, sobrenome: String): String {
    return "$nome $sobrenome"
}