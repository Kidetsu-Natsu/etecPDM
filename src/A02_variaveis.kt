fun main()
{
    //Aula 2 : Variaveis e tipos de dados

    var x = 9

    var y = "9"

    val unByte: Byte = 127 //1 byte ou 8 bits: -128 até 127
    val umShort: Short = 32767 //2 bytes ou 16 bits -32768 até 32767
    val umInt: Int = 214783647//4 bytes ou 32 bits: -214783648 até 214783647
    val umLong: Long = 9223372036854775807 // 8 bytes ou 64 bits: 9223372036854775808 até 9223372036854775807

    val umFloat: Float = 3.343523f //4 Bytes
    val umDouble: Double = 1.39194319403 //8 Bytes


    println("Byte MIN ${Byte.MIN_VALUE} e MAX ${Byte.MAX_VALUE}")
    println("Byte MIN ${Short.MIN_VALUE} e MAX ${Short.MAX_VALUE}")
    println("Byte MIN ${Int.MIN_VALUE} e MAX ${Int.MAX_VALUE}")
    println("Byte MIN ${Long.MIN_VALUE} e MAX ${Long.MAX_VALUE}")
}