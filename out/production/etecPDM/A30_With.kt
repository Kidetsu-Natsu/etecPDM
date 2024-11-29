//Aula 30 - With

import  b_poo.livro //(importei uma classe)

fun main()
{
    val meuLivro = Livro("Blade Runner", "Philip K Dick", 1980, 300)
    meuLivro.marcarPagina(27)
    meuLivro.abrirPagina(meuLivro.marcador)

    //Só tem no Kot
    with(meuLivro)
    {
        marcarPagina(72)
        abirPagina(marcador)
        println()
        println(this.autor)
        println(this.ano)
        println(paginas)
    }

}