// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("ERROR: Please enter the filename!")
        exitProcess(1)
    }

    val data = readData(args[0])
    val median = median(data)

    println("The median of ${args[0]} is $median")

}