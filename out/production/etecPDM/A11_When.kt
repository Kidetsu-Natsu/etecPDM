// Aula 11:  Controle de fluxo "When"
fun main()
{
    val n = 0

    if(n in 1..10)
    {
        println("$n está entre 1 e 10")
    }

    when (n)
    {
        in 1..10 -> println("$n está entre 1 e 10")
    }
    val x = true
    when(x)
    {
        true -> println("é verdade")
        false -> println("é falso")
    }


    val bonus = bonusWhen("Gerente")
    println("Bonus de $bonus")
    println("Bonus de Engenheiro: ${bonusWhen("Engenheiro")}")


}

fun bonusWhen(cargo:  String): Double
{
    var bonus: Double

    when(cargo)
    {
        "Gerente" -> bonus = 2021.15
        "Cordenador" -> bonus = 1057.60
        "Engenheiro" ->  bonus =  8067.22
        else -> bonus = 0.00
    }

}

fun bonusIf(cargo: String): Double
{
    var bonus: Double

    if(cargo == "Gerente"){bonus = 2021.15}
    else if(cargo == "Cordenador"){bonus = 1057.60}
    else if(cargo == "Engenheiro"){bonus = 8067.22}
    else {bonus = 0.00)


}