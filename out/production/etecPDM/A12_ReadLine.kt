//Aula Doce: readLine() comando de Input do usuário(Linha de entrada)

fun main()
{
    var nome: String
    print("Digite seu nome: ")
    nome = readln()
    println("Seja Bem vindo $nome")

    print("Digite sua idade:")
    var idade = readln()
    println("$nome tem $idade anos")

    var numero: Int
    print("Digite um número inteiro: ")
    numero = readln().toInt()
    var outroNumero = readln()

    print("A soma de $numero e $outroNumero é ${numero + outroNumero.toInt()}")



}