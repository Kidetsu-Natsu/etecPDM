fun main()
{

    //Funções
    println("println() é uma função utilitária da função main()")

    //Preciso chamar a função
    bomDia()

    //Passo o parâmetro da função
    hello("Luis")

    //
    var resultado = soma(7, 9)
    println(resultado)

    //double
    println(subtracao(4.2))

    println(divisao(resultado, 7))

    mensagem("Luis", "Henrik")

    //Posso chamar uma mesma função com parâmetros diferentes
    mensagem("Luis", 18)

    //Overload de funções = Funções iguais que mudam apenas seus parâmetros e etc
    //Mesmo nome diferenciado pelos atributos
    mensagem("Luis")
    mensagem("Luis", "Henrik")
    mensagem(Luis, 18)
    mensagem(18, "Luis")



}

fun bomDia()
{
    println("Bom Dia!")
}

//Função que recebe APENAS UMA linha de comando
fun bomDia2() = print("Bom dia 2!")

//Função com parâmetro
fun hello(nome: String)
{
    println("Olá $nome")
}

fun hello2(nome: String) = println("Olá, $nome")

//Numeros
fun soma(a: Int, b: Int): Int
{
    var resultado = a + b
    //Retorna o resultado
    return resultado
}
//ou
fun soma2(a: Int, b: Int): Int = a + b{}

//O 3 serve como referência caso o parâmetro b não seja passado
fun subtracao(a: Double, b: Int = 3) = a - b

fun divisao(a: Int, b: Double) = a / b

fun mensagem(nome: String, sobrenome: String)
{
    println("Bem vindo, $nome $sobrenome !")
}

fun mensagem(nome: String, idade: Int)
{
    println("Bem vindo, $nome $idade !")
}

//Funções com quantidades e tipos de váriaveis diferentes conseguem se diferenciar entre si
fun mensagem(sobrenome: String)
fun mensagem(nome: String, sobrenome: String) = println("sla")
fun mensagem(nome: String, idade: Int) = println("sla $nome, $idade")
fun mensagem(idade: Int, nome: String) = println("Você tem $idade, anos $nome")

//Para jogar no git hub nós vamos no terminal e digitamos:
//Git add .(esse ponto adiciona tudo) ou o nome do arquivo para subir só ele
//Git commit -m "atualização"
//GIt push (para enviar)