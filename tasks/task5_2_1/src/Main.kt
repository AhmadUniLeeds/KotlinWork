// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("ERROR: Please enter the radius!")
        exitProcess(1)
    }

    println(String.format("%.4f", circleArea(args[0].toDouble())))
    println(String.format("%.4f", circlePerimeter(args[0].toDouble())))

}