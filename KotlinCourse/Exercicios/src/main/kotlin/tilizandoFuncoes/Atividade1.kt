package tilizandoFuncoes

fun main() {

    //Fazer um programa em C que pergunta um valor em metros e imprime o
    //correspondente em decímetros, centímetros e milímetros.

    println("Insira um valor em metros: ")
    val metros = readln().toDoubleOrNull()

    if (metros != null){
        conversao(metros)
    }

    else{
        println("Valor inválido. Tente novamente.")
    }

}

fun conversao(metros : Double){

        val decimetros = metros * 10
        val centimetros = metros * 10
        val milimetros = metros * 10

        println("$metros metros equivalem a:")
        println("$decimetros decímetros")
        println("$centimetros centímetros")
        println("$milimetros milímetros")

}