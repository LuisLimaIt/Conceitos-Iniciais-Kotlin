fun main() {
    // Operador Elvis ?:
    /*Adicionamos o ponto de interrogação após o Int
    para informar ao Kotlin que a variável pode ser
    nula v */

    /*NullPointerException é um dos erros mais comuns em Java,
     (Significa que você está tentando utilizar uma váriavel
     nula, ou seja, sem valor
     */

    val test: Int? = null
    val op: Int = test ?: 100

    println(op)

    /*O operador Elvis diz que se a variável for nula, ela deve
    usar o valor informado (A val op por exemplo, se for nula,
    utilizará o valor 100 / Também dá certo com strings)
     */
}