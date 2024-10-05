/*Aula 13: Exercícios

1. Escreva uma rotina capaz de ler dois número inteiros maiores que zero que representam os lados de uma
figura geométrica quadrada ou retangular. Informar se é um quadrado ou retangulo.

2 Escreva uma função capaz de ler três números inteiros maiores que zero que representam os lados de um trângulo
Informar se é um triângulo equilátero(todos os lados iguais), isóceles(apenas dois lados iguais) ou
escaleno(os três lados diferentes)
 */

fun main()
{
    //ex1()
    //ex2()
}

//Ex1
fun ex1()
{
    print("Digite o 1° Número: ")
    var n1 = readln().toInt()
    print("Digite o 2° Número: ")
    var n2 = readln().toInt()

    if(n1 == n2){println("Ao multiplicar $n1 por $n2 resultará em um quadrado")}
    else if(n2 != n2){println("Ao multiplicar $n1 por $n2 resultará em um retângulo")}

}

//Ex2
fun ex2()
{
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()

    if(num1 == num2 && num1 == num3){println("Equilátero")}
    else if((num1 != num3 || num1 != num2) && (num1 == num2 || num1 == num3)){println("Isóceles")}
    else if(num1 != num2 && num1 != num3 && num2 != num3){println("Escaleno")}

}
