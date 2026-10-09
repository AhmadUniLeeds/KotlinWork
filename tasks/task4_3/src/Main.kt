// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("ERROR: Please enter the marks for all 3 modules!")
        exitProcess(1)
    }

    when ((((args[0]).toDouble() + (args[1]).toDouble() + (args[2]).toDouble()) / 3).roundToInt()) {
        in 0..39   -> println("Fail")
        in 40..69  -> println("Pass")
        in 70..100 -> println("Distinction")
    }

}