package utilizandoClasses

//4. Exercício: fazer um programa em "C" que solicita o total gasto pelo cliente de
//uma loja, imprime as opções de pagamento, solicita a opção desejada e
//imprime o valor total das prestações (se houverem).
// 1) Opção: a vista com 10% de desconto
// 2) Opção: em duas vezes (preço da etiqueta)
// 3) Opção: de 3 até 10 vezes com 3% de juros ao mês (somente para compras
//acima de R$ 100,00).
//OBS: fazer uma função que imprime as opções solicita a opção desejada e retorna
//a opção escolhida. No programa principal, testar a opção escolhida e ativar a
//função correspondente (uma função para cada opção).


class Pagamento(private val preco: Double) {

    fun aVista(): Double {
        return preco - (preco * 0.1)
    }

    fun duasParcelas(): Double {
        return preco
    }

    fun tresOuMaisParcelas() {

        if (preco <= 100) {
            println("\nOpção inválida. Parcelamento de 3 a 10 vezes é permitido apenas para compras acima de R\$ 100,00.")
            return
        }

        print("Digite a quantidade de parcelas: ")
        val parcelas = readLine()!!.toInt()

        if (parcelas in 3..10) {
            val valorFinal = preco * (1 + 0.03 * parcelas)
            val valorParcela = valorFinal / parcelas
            println("\nPagamento em $parcelas vezes com 3% de juros ao mês.")
            println("$parcelas parcelas de R$ %.2f".format(valorParcela))
            println("Valor total: R$ %.2f".format(valorFinal))
        } else {
            println("\nQuantidade de parcelas inválida.")
        }

    }

    fun escolherOpcao(): Int {

        println("\nFormas de Pagamento: ")
        println("1- À Vista - Desconto de 10%")
        println("2- Parcelado em duas vezes - Valor da Etiqueta")
        println("3- Parcelado de 3 até 10 vezes - Juros de 3% por parcela")
        print("Escolha uma opção: ")
        return readln().toInt()

    }

}

fun main() {

    print("Digite o valor de Compra: ")
    val preco = readln().toDoubleOrNull()

    if (preco == null) {
        println("Valor inválido.")
        return
    }

    val pagamento = Pagamento(preco)

    val opcao = pagamento.escolherOpcao()

    when (opcao) {
        1 -> {
            val valor = pagamento.aVista()
            println("\nValor à vista com desconto: R$ $valor")
        }
        2 -> {
            val valor = pagamento.duasParcelas()
            val parcela = valor / 2
            println("\nPagamento em 2x sem juros de R$ $parcela")
            println("Valor total: R$ $valor")
        }
        3 -> pagamento.tresOuMaisParcelas()
        else -> println("\nOpção inválida.")
    }

}

