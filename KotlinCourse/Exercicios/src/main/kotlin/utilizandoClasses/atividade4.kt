package utilizandoClasses

import kotlin.math.*

fun main() {

    val classObjectOperations = Operations()

    println("Enter the first number: ")
    val number1 = readln().toDoubleOrNull()

    println("Enter the second number: ")
    val number2 = readln().toDoubleOrNull()

    if (number1 != null && number2 != null) {
        var option: Int

        do {
            println("\n===== MENU =====")
            println("1 - Sum")
            println("2 - Product of first by square of second")
            println("3 - Square of the first number")
            println("4 - Square root of the sum of squares")
            println("5 - Sine of the difference (first - second)")
            println("6 - Absolute value (module) of the first number")
            println("7 - Show all operations")
            println("0 - Exit")
            print("Choose an option: ")

            option = readln().toIntOrNull() ?: -1

            when (option) {
                1 -> println("Sum: %.2f".format(classObjectOperations.sum(number1, number2)))
                2 -> println("Product of first by square of second: %.2f".format(
                    classObjectOperations.productWithSquare(number1, number2)))
                3 -> println("Square of the first number: %.2f".format(
                    classObjectOperations.squareOfFirst(number1)))
                4 -> println("Square root of the sum of squares: %.2f".format(
                    classObjectOperations.sqrtOfSumOfSquares(number1, number2)))
                5 -> println("Sine of the difference: %.2f".format(
                    classObjectOperations.sineOfDifference(number1, number2)))
                6 -> println("Absolute value of the first number: %.2f".format(
                    classObjectOperations.absoluteOfFirst(number1)))
                7 -> classObjectOperations.displayResults(number1, number2)
                0 -> println("Exiting the program...")
                else -> println("Invalid option. Please try again.")
            }

        } while (option != 0)

    }

}

class Operations {

    fun sum(number1: Double, number2: Double): Double {
        return number1 + number2
    }

    fun productWithSquare(number1: Double, number2: Double): Double {
        return number1 * number2.pow(2)
    }

    fun squareOfFirst(number1: Double): Double {
        return number1.pow(2)
    }

    fun sqrtOfSumOfSquares(number1: Double, number2: Double): Double {
        return sqrt(number1.pow(2) + number2.pow(2))
    }

    fun sineOfDifference(number1: Double, number2: Double): Double {
        return sin(number1 - number2)
    }

    fun absoluteOfFirst(number1: Double): Double {
        return abs(number1)
    }

    fun displayResults(number1: Double, number2: Double) {
        println("Sum: %.2f".format(sum(number1, number2)))
        println("Product of first by square of second: %.2f".format(productWithSquare(number1, number2)))
        println("Square of the first number: %.2f".format(squareOfFirst(number1)))
        println("Square root of the sum of squares: %.2f".format(sqrtOfSumOfSquares(number1, number2)))
        println("Sine of the difference: %.2f".format(sineOfDifference(number1, number2)))
        println("Absolute value of the first number: %.2f".format(absoluteOfFirst(number1)))
    }
}