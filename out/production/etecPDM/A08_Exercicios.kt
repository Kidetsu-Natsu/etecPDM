fun main()
{
	recebeAnos(4)
	recebePalavra("material")
	retornaCubo(2)
	milhasParaKm(5)
	recebeStringParaConverter("Não sei dizer, o que mudou, mas nada está igual")
	funcaoEx2("material")
	funcaoEx3(2)
	funcaoEx4(5)

	/*1. Escreva uma função que seja capaz de receber a quantidade de anos e tranformar em meses, dias, hras, minutos e segundos. Sída desejada:
    		2 anos equivalem a:
        	24 meses
        	730 dias
        	17520 horas
        	1051200 minutos
        	63072000 segundos*/

// 2. Escreva uma função capaz de receber um string e retornar a quantidade de carcteres

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)

// 4. Escreva uma função capaz de receber uma medida em milhas e converter em km (1 milha = 1.6 km)

/* 5. Escreva um programa que seja capaz de receber uma string e fazer a troca todas as letras "a" ou "A" por "x". Observando que:
    a. Não deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras maiúsculas
    Exemplo: Entrada = "Programação em Kotlin" - Saída = "PROGRxMxÇxO EM KOTLIN"
 */

// 6. Sobre as funções criadas nos exercícios 2, 3 e 4, é possível transfomá-las em fuções de uma única linha? Se sim, trasforme-as.

}

// EX 1
fun recebeAnos(ano: Int)
{
	var meses: Int
	var dias: Int
	var horas: Int
	var minutos: Int
	var segundos: Int
	println("$ano equivalem a: ")
	println("${ano * 12} meses")
	println("${ano * 365} dias")
	println("${ano * 8766} horas")
	println("${ano * 525960} minutos")
	println("${ano * 31536000} segundos")

}

// EX 2
fun recebePalavra(palavra: String)
{
	var tamanho: String

	tamanho = "A palavra $palavra tem  ${palavra.Length} caracteres"
	println(tamanho)
}

// EX 3
fun retornaCubo(numero: Int)
{
	println("$numero elevado ao cubo equivale a ${numero * numero * numero}")

}

// EX 4
fun milhasParaKm(milhas: Float)
{
	var conversao: Int = milhas * 1.6

	println(conversão)
}

// EX 5
fun recebeStringParaConverter(textoParaConverter: String)
{
	var textoFinal: String = textoParaConverter.uppercase()

	textoFinal = textoParaConverter.replace("A", "X")
}

// EX 6
fun funcaoEx2(palavra2: String) = {println("A palavra $palavra2 tem ${palavra.Length} caracteres")}

fun funcaoEx3(numero2: Int) = {println("$numero2 elevado ao cubo equivale a ${numero2 * numero2 * numero2}")}

fun funcaoEx4(milhas2: Float) = {pintln(milhas2 * 1.6)}