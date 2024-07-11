fun main() {
    val celsius = 27.0
    val kelvin = 350.0
    val fahrenheit = 10.0

    displayFinalTemperature(celsius, "Celsius", "Fahrenheit", ::celsiusToFahrenheit)
    displayFinalTemperature(kelvin, "Kelvin", "Celsius", ::kelvinToCelsius)
    displayFinalTemperature(fahrenheit, "Fahrenheit", "Kelvin", ::fahrenheitToKelvin)
}

fun displayFinalTemperature(
    initialTemperature: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFunction: (Double) -> Double
) {
    val finalTemperature = String.format("%.2f", conversionFunction(initialTemperature))
    println("$initialTemperature degrees $initialUnit is $finalTemperature degrees $finalUnit.")
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9.0 / 5 + 32
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9 + 273.15
}
