/**
Type Bit
Double 64
Float 32
Long 64
Int 32
Short 16
Byte 8
Boolean ?
String ?
Char ?
 */

/**
Lembrando sobre unidades de medida:
1 byte = 8 bits
1 kilobyte (KB)= 1024 bytes
1 megabyte (MB) = 1024 kilobytes
1 gigabyte (GB) = 1024 megabytes
 */

fun calculaBonus(a: Int, b: Int, c: Int) {
    println("O bônus é: ${a + b * c * 2}")
}

fun hello(nome: String) : String {
    return "Olá, $nome"
}

fun main() {

    val a = 10
    val b = 20
    val c = 30

    calculaBonus(a, b, c)

    println(hello("Luis"))

    println("Olá mundo!")

    //Variáveis mutáveis
    var nome = "Luis"
    nome = "Luis Paulo"

    //Variávies imutáveis
    val idade = 10

    val x: Int
    x = 20

    println(nome);
}
