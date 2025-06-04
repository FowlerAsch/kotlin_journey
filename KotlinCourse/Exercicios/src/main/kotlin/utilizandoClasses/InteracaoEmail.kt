package utilizandoClasses
import java.time.LocalTime

// 15) Crie um programa que receba como entrada a hora e os minutos do dia, o nome do cliente e seu
//sexo. A partir desses dados, gere na saída do programa (tela) uma saudação que diga:
// "Bom dia", "Boa tarde" ou "Boa noite", dependendo da hora do dia, seguido de vírgula.
// "senhor" ou "senhora", dependendo do sexo do(a) cliente.
// O nome do(a) cliente, seguido de exclamação.
// A frase "Em que posso ajudar?"
//Obs: A manhã se inicia as 00:00 e vai até 11:59.
//A tarde se inicia às 12:00 e vai até 17:59
//A noite se inicia às 18:00 e vai até 23:59



fun main() {
    println("Digite seu nome: ")
    val nome = readln()

    println("Digite seu sexo (M/F): ")
    var sexo = readln().uppercase()

    while(sexo!= "M" && sexo != "F"){
        println("Digite seu sexo (M/F: ")
        sexo = readln().uppercase()
    }
    val hora = LocalTime.now().hour

    val saudacao = periodoDia(hora)
    val saudacaoSexo = verificarSexo(sexo)

    println("$saudacao, $saudacaoSexo $nome! Em que posso ajudar? ")

}

fun periodoDia(hora: Int): String {

    return if (hora < 12) {
        "Bom dia"
    } else if (hora in 12..17) {
        "Boa tarde"
    } else if (hora in 18..23) {
        "Boa noite"
    } else {
        "Olá"
    }
}

fun verificarSexo(sexo : String): String{
    return if (sexo == "M"){
         "Senhor"
    }
    else{
        "Senhora"
    }
}
