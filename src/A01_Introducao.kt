fun main()
{
    //Aula 1 : Primeiro Contato

    //Coloca uma mensagem no comando
    print("Olá Mundo!")

    //Println cria uma quebra de linha
    println("Eu")

    print("Nós")
    println()

    //essa contra-barra joga a o texto pra linha de baixo
    var nome = "Eu\nme sinto vazio\nnovamente"

    println(nome)

    nome = "nome"

    print(nome + " Calma calabreso" + "\n")

    var sobrenome = "sobrenome"

    //Jeitinho kt para concatenar
    println("Olá, $nome $sobrenome")

    //\n é comando de linha, sempre leva aspas

    //var nome = "Não posso redeclarar meus sentimentos"

    //Variavel
    var variavelEstatica = "oi"
    variavelEstatica = "olá"

    //Variavel estática, não posso sobreescrever
    val  valorEstatico = "oi"
    //valorEstatico = "22"

    var nomeCompleto = nome + "" + sobrenome

    println("\n" + nomeCompleto)


}