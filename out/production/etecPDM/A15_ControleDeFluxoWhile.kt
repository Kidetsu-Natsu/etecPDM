//Aula 15

fun main()
{
    var i = 0

    while(true)
    {
        print("$i")
        i++
        if(i == 10) break
    }
    println

    while(i >= -5)
    {
        print("$i")
        i--
    }

    i = 0
    while(true)
    {
        print("tecle enter")
        var resposta = readln()
        if(resposta == "0")
        {
            println("terminamos")
            break
        }
        printl("Continuando ${i++}")
    }

    val str = "Kotlin"
    val contador = 0
    while (contador < str.length)
    {
        print("${str[contador]}")
        contador++
    }
    println()

    contador = str.length - 1
    while(contador >= 0)
    {
        print("${str[contador]}")
        contador--
    }
}
