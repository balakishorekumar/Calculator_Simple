/**
 * Simple Calculator
 *
 * Program Statement
 * This program accepts one of the following statements
 * + "+"
 * - "-"
 * * "*"
 * / "/"
 *
 * If the first argument of the program matches one of the above strings [1a], execute the appropriate
 * mathematical function [2a]. Display this result in the console [3a].
 *
 * If the first argument of the program does not match any of the above strings [1b], display an error
 * message in the console [2b].
 *
 */

// Let us make a string with a name we can use to refer it.

const val ADD: String = "+"
const val SUBRACT: String = "-"
const val MULTIPLY: String = "*"
const val DIVIDE: String = "/"

const val ERROR_MESSAGE = "An Error has occurred"

// Create two test operands to see if our program works properly
const val testoperand1 = 5.0
const val testoperand2 = 4.0

fun main(args: Array<String>){
    val operatorSymbol = args[0]

    start(operatorSymbol)


}

fun start(operatorSymbol: String){
    if (checkArguments(operatorSymbol)){
        displayResult(
                evaluateBinomial(testoperand1,testoperand2,operatorSymbol)
        )

    } else {
        displayResult(
                ERROR_MESSAGE
        )
    }

}

// This function displays the result.package
// Single expression syntax (for single line code snippets)
fun displayResult(result: String) = println(result)

fun evaluateBinomial(opOne: Double, opTwo: Double, sym: String): String
{
    return when (sym){

        ADD -> (opOne+opTwo).toString()
        SUBRACT -> (opOne-opTwo).toString()
        MULTIPLY -> (opOne*opTwo).toString()
        DIVIDE -> (opOne/opTwo).toString()

        else -> ERROR_MESSAGE
    }

}

// returns true or false(Boolean),based on if the operator matches our constants
fun checkArguments(operatorSymbol: String): Boolean {
    return when (operatorSymbol) {
        //equals
        ADD -> true
        SUBRACT -> true
        MULTIPLY -> true
        DIVIDE -> true
        //OTHERWISE
        else -> false
    }
}
