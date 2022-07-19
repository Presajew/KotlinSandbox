import java.math.BigInteger

// TODO: Move this to math library
fun factorial(number: Int) : BigInteger {
    var output: BigInteger = 1.toBigInteger()

    for (i in 2..number) {
        output *= i.toBigInteger()
    }

    return output
}

// TODO: Move this to math library
fun sumOfDigits(number: BigInteger) : BigInteger {
    var output : BigInteger = BigInteger.ZERO
    var tempRemainder : BigInteger
    var tempNumber : BigInteger = number

    while (tempNumber > BigInteger.ZERO) {
        tempRemainder = tempNumber % BigInteger.TEN
        tempNumber = tempNumber / BigInteger.TEN
        output += tempRemainder
    }

    return output
}

fun main() {
    val testVal : Int = 100
    val testFactorial : BigInteger = factorial(testVal)
    val testSumOfDigits : BigInteger = sumOfDigits(testFactorial)
    println(testSumOfDigits)
}