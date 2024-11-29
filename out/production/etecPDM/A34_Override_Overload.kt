//Aula 34 - Override

fun main()
{
    fun save(){
        println("Arquivos salvos")
    }

    //Overload
    fun save(parametro: Int)
    {
        println("O arquivo n° $parametro, foi salvo")
    }

    fun save(parametro: Double)
    {

    }
    fun save(p: String){}
    fun save(p: String, p2: String){}
    fun save(p: String, p2: Int)

    save()
    save(9)

    var  samsung: Celular = Celular("Samsung")
    samsung.ligar()
}

/*class Celular(marca: String) : Eletronico(marca)
{
    //preciso colocar open no método
    override fun ligar(){}

}*/

class Celular(marca: String) : Computador(marca)
{
    override fun ligar(){println("Estou ligado!")}
}