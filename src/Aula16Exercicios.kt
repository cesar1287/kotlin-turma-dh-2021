fun main() {

    val loteriaDosSonhosMap = mapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

    val apelidosMap = mapOf(
        "João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("JuanXpto", "FissuraXpto", "MarombaXpto"),
        "Lucas" to listOf("Juan123", "Fissura123", "Maromba123")
    )

    val nomeApelido = StringBuilder()

    apelidosMap.forEach { entry ->
        nomeApelido.append("${entry.key} - ")
        entry.value.forEach { apelido ->
            nomeApelido.append("$apelido, ")
        }
        nomeApelido.appendLine()
    }

    println(nomeApelido.toString())
}