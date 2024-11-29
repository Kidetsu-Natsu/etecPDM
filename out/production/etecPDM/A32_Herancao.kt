//Aula 32 - Herança

fun main()
{
    var dell: Computador = Computador("DELL")
    var acer: Eletronico = Eletronico("Acer")

    dell.processar()
    dell.armazenarDados()
    dell.ligar()
    dell.desligar()

    acer.ligar()
    acer.desligar()

}

open Computador(marca: String) : Eletronico(marca)
{
    fun processar(){}
    fun armazenarDados(){}
}


open class Eletronico(val marca: String)
{
    open fun ligar(){}
    fun desligar(){}

}