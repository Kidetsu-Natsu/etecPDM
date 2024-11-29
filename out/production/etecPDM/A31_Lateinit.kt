// Aula 31 -

fun main()
{
    var prato: Receita = Receita()

    prato.geraReceita()
    prato.imprimirReceita()

    prato.novasInstrucoes = "Tudo bem"
    prato.imprimirReceita()
}

class Receita{
    var instrucoes: String? = null
    lateinit var novasInstrucoes: String

    fun geraReceita()
    {
        instrucoes = "Lave as mãos."
    }

    fun imprimirReceita()
    {
        if(!this::novasInstrucoes.isInitialized)
        {
            novasInstrucoes = "Então, lave as mãos"
        }
        println(instrucoes)
    }
}