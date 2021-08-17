fun calcularBonus(cargo: String, salario: Float) : Float {
    // Gerente Júnior, Gerente Sênior, Coordenador

    return if(cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Júnior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

// if - else

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("MAIOR8 de idade, essa pessoa tem $idade anos")
    } else {
        println("MENOR de idade, essa pessoa tem $idade anos")
    }
}

fun maiorDeIdade2(idade: Int): Boolean {
    return idade >= 18
}

fun main() {

    val valor = 10
    /// Operador Ternário no Java
    // String str = valor == 10 ? "Sim" : "Não";

    // "Operador Ternário" no Kotlin
    val str = if (valor == 10) "Sim" else "Não"

    maiorDeIdade(23)
    maiorDeIdade(10)
    maiorDeIdade(74)

    maiorDeIdade2(17)
    maiorDeIdade2(27)

    println(calcularBonus("Coordenador", 1500f))
    println(calcularBonus("Gerente Júnior", 2000f))
    println(calcularBonus("Gerente Sênior", 3000f))
}
