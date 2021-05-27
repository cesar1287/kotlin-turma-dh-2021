fun main() {
    val foto = Foto("Rosto", "Pessoa")
    val documento = Documento("CNH", "CNH")
    val contrato = Contrato("Contrato de compra e venda", "xpto")
    val impressora = Impressora()
    impressora.inserirImprimivel(foto)
    impressora.inserirImprimivel(documento)
    impressora.inserirImprimivel(contrato)
    impressora.imprimirTodos()
}

interface ImprimivelAula15 {

    val nome: String

    val tipoDocumento: String

    fun imprimir()
}

class Foto(
    override val nome: String,
    override val tipoDocumento: String
) : ImprimivelAula15 {

    override fun imprimir() {
        println("Eu sou uma selfie - $nome - $tipoDocumento")
    }
}

class Documento(
    override val nome: String,
    override val tipoDocumento: String
): ImprimivelAula15 {

    override fun imprimir() {
        println("Eu sou um documento word - $nome - $tipoDocumento")
    }
}

class Contrato(
    override val nome: String,
    override val tipoDocumento: String
): ImprimivelAula15 {

    override fun imprimir() {
        println("Sou um contrato muito legal - $nome - $tipoDocumento")
    }
}

class Impressora(
    val listaImprimivel: MutableList<ImprimivelAula15> = mutableListOf()
) {

    fun imprimirTodos() {
        listaImprimivel.forEach {
            it.imprimir()
        }
    }
}

fun Impressora.inserirImprimivel(imprimivelAula15: ImprimivelAula15) =
    this.listaImprimivel.add(imprimivelAula15)
