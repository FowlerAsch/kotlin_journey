package tilizandoFuncoes

fun main(){

    // Fazer um programa que solicita um número decimal e imprime o
    //correspondente em hexa e octal.

    println("Insira um valor decimal: ")
    var valorDecimal = readln().toIntOrNull()

    if (valorDecimal != null){
        ImprimirValores(valorDecimal)
    }
    else{
        println("Valor Incorreto!")
    }

}

fun CalculoHexadecimal(valorDecimal : Int): String{

    return valorDecimal.toString(16)

}

fun CalculoOcta(valorDecimal : Int): String{

    return valorDecimal.toString(8)

}

fun ImprimirValores(valorDecimal: Int){

    val ExibirValorHexadecimal= CalculoHexadecimal(valorDecimal)
    val ExibirValorOctal = CalculoOcta(valorDecimal)

    println("Número decimal: $valorDecimal")
    println("Hexadecimal: $ExibirValorHexadecimal")
    println("Octal: $ExibirValorOctal")



}