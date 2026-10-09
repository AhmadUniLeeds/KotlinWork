// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("ERROR: Please enter the upper limit!")
        exitProcess(1)
    }

    var sum = 0L

    for (n in 1..args[0].toInt() step 2) {
        sum += n
    }

    println(sum)
}
