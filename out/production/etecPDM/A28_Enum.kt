enum class AnimalEnum{
    Cachorro,
    Gato,
    Passaro,
    Tartaruga
}

enum class Prioridade{
    Baixa, Media, Alta, Maxima
}

enum class Nivel(val valor: Int)
{
    Basico(1), Intermediario(5), Avancado(15)
}

class Veterinario{
    fun imprimir(var animal: String)
    {
        return "Paciente a ser atendido $animal"
    }
}

class Veterinario2(var animal: AnimalEnum){
    fun imprimir(): String{
        return "Paciente a ser atendido: $animal"
    }

}

fun main()
{
    val paciente: Veterinario = Veterinario("Elefante")
    println(paciente.imprimir())

    val paciente2: Veterinario2 = Veterinario2(AnimalEnum.Tartaruga)
    println(paciente2.imprimir())

    for (valor in Nivel.values())
    {
        print(valor.valor)
        print( " - ")
        println(valor)
    }

}

