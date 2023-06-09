fun main() {
    // Fill in the code.
    val fToK: (Double) -> Double = {5.0 / 9.0 * ( it - 32.0 ) + 273.15}
    printFinalTemperature(27.0, "Celsius", "Fahrenheit"){9.0 / 5.0 * it + 32.0}
    printFinalTemperature(350.0, "Kelvin", "Celcius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fToK)
}
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
/*
27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
*/