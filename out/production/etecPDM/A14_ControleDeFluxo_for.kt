fun main()
{
    var i = 0
    for(i in 1..10)
    {
        print("$i")
    }

    println()

    var str = "Kotlin é uma"
    for(caractere in strc)
    {
        print("$caractere")
    }

    println()

    for(i in 0..20 step 2) print("$i")
    //step 2 pede que pule de 2 em dois

    for(valor in 20 downTo 0) print("$valor")
    //Vai indo na regressiva

}