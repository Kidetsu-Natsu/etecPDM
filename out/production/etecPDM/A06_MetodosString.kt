fun main()
{
    //A06_Metodos e Propriedades de String

    val str = "Programação Kotlin"
    var msg: String

    //Imprime a quantidade de caracteres da variavel str
    msg = "Tamanho da String: ${str.length} caracteres"

    msg = "Posição (índice) 0 da string: ${str[9]}"

    msg = str.startsWith("Pro").ToString()
    //Método booleano que ao usar .ToString vira uma string

    msg = str.endsWith("abc").ToString()
    //Método igual ao de cima, mas pega no final

    msg = str.substring(2,4)
    //Retorna um trecho de uma string dentro do alcance pré-colocado

    msg = str.replace("Kotlin", "com Kotlin.")
    //Subtitue a primeira parte pela segunda

    msg = str.lowercase()
    //Converte tudo para minúsculo

    msg = str.uppercase()
    //Faz o contrário

    val str2 = "            usada no Android Studio!        "

    msg = str2.trim()
    //tira os espaços vazios

    msg = str + str2.trim() + str

    println(msg)






}