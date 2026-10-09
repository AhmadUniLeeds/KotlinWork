// Task 5.1.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 2) {
        println("ERROR: Please enter 2 words!")
        exitProcess(1)
    }

    if (args[0] anagramsOf args[1]) {
        println("Both words are the same!")
    }
    else {
        println("Both words aren't the same!")

    }

}