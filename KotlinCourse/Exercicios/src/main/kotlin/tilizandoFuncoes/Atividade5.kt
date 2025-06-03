package tilizandoFuncoes

//1. Faça um programa em "C" que lê dois valores e imprime:
// - se o primeiro valor for menor que o segundo, a lista de valores do primeiro até
//o segundo;
// - se o primeiro valor for menor que o segundo a lista de valores do segundo até
//o primeiro em ordem decrescente;
// - se ambos forem iguais a mensagem "valores iguais"

fun main(){

    println("Insira a base:")
    val base = readln().toDouble()
    print("Insira o expoente:")
    val expoente = readln().toInt()

    val valor = calcularPotencia(base, expoente)
    print("O valor é: $valor")

}

fun calcularPotencia(base: Double, expoente: Int): Double {
    var resultado = 1.0
    for (i in 1..expoente) {
        resultado *= base
    }
    return resultado
}

