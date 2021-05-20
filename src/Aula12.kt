fun main() {
    val ferrariF50 = Ferrari() // 1234
    val ferrariF70 = Ferrari()
    val ferrariF40 = Ferrari() // 4321
    val ferrariF60 = ferrariF40 // 4321

    //println(ferrariF40.toString())

    val nome1 = "Cesar Rodrigues"
    val nome2 = "cesar rodrigues"

//    val listaTeste = listOf("cesar", "Cesar", "Pedro", "Edu")
//    println(listaTeste.asReversed())

//    if (nome1 == nome2) {
//        println("Sao iguais")
//    } else {
//        println("Sao diferentes")
//    }

//    println(ferrariF40.nome)
//    println(ferrariF60.nome)

//    ferrariF60.nome = "Ferrari Fiat"
//    ferrariF60.motor = "730cv"
//
//    println(ferrariF60.toString())

//    println(ferrariF40.nome)
//    println(ferrariF60.nome)

//    if (ferrariF50.equals(21.0)) {
//        println("Sao iguais")
//    } else {
//        println("Sao diferentes")
//    }

    if (ferrariF40 == ferrariF60) {
        println("Sao iguais")
    } else {
        println("Sao diferentes")
    }

    println(ferrariF40.hashCode())
    println(ferrariF60.hashCode())

    val animal = Animal()
    println(animal.hashCode())
    println(animal.toString())
}

