package tilizandoFuncoes

fun main() {

    val converter = TemperatureConverter()

    print("Enter the temperature in Fahrenheit: ")
    val fahrenheit = readln().toDoubleOrNull()

    if (fahrenheit != null) {
        converter.displayValues(fahrenheit)
    } else {
        println("Invalid value. Please enter a valid number.")
    }
}

class TemperatureConverter {

    private fun convertToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32.0) * (5.0 / 9.0)
    }

    private fun convertToKelvin(fahrenheit: Double): Double {
        return (fahrenheit - 32.0) * (5.0 / 9.0) + 273.15
    }

    fun displayValues(fahrenheit: Double) {
        val displayCelsius = convertToCelsius(fahrenheit)
        val displayKelvin = convertToKelvin(fahrenheit)

        println("Temperature in Fahrenheit: $fahrenheit ºF")
        println("Temperature in Celsius: $displayCelsius ºC")
        println("Temperature in Kelvin: $displayKelvin K")

    }
}