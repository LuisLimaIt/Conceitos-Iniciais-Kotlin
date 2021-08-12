fun main() {

    val frase = "Kotlin é uma linguagem"
    val caracteristica = "show!"

    println("Kotlin é uma linguagem $caracteristica")

    val str = """Para escrever um texto em multiplas linhas
        |você precisa escrever utilizando 3 aspas de cada
        |lado.
    """.trimMargin()

    println(str)
}