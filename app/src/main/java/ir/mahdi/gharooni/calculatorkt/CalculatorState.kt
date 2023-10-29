package ir.mahdi.gharooni.calculatorkt

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)