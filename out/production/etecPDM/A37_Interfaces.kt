//Aula 37 - Interface

interface Animais{
    //Interface não aceita corpo - "{}"
    fun ataque(){
        println("Caçador")
    }
    fun rosnar()
}

open class Selvagem() : Animais
{
    fun predar()
    {

    }
    override fun rosnar(){}

}

class Bicho() : Selvagem()
{
    fun comer(){}

}

fun main()
{
    var gato: Bicho = Bicho()
    var leopardo: Selvagem = Selvagem()

    gato.predar()
    gato.comer()

    leopardo.predar()
}