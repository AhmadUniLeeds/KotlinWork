// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("ERROR: Please enter the dice specification!")
        exitProcess(1)
    }
    else {
        rollDie(args[0][2].digitToInt(),args[0][0].digitToInt())
    }

}