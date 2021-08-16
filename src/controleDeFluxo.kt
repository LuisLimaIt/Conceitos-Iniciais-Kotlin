fun calcularBonus(cargo: String, salario: Float) : Float {
    // Gerente Júnior, Gerente Sênior, Coordenador

    val bonus: Float
    if(cargo == "Coordenador") {
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Júnior") {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }
    return bonus
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
    maiorDeIdade(23)
    maiorDeIdade(10)
    maiorDeIdade(74)

    maiorDeIdade2(17)
    maiorDeIdade2(27)

    println(calcularBonus("Coordenador", 1500f))
    println(calcularBonus("Gerente Júnior", 2000f))
    println(calcularBonus("Gerente Sênior", 3000f))

}
