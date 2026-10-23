// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import java.io.IOException

fun main(args: Array<String>) {
    // Implement main program here

    val data = try {
        readData(args[0])
    }
    catch (error: ArrayIndexOutOfBoundsException) {
        println("ERROR: You didn't provide a filename!")
        exitProcess(1)
    }
    catch (error: IOException) {
        println("ERROR: You didn't enter a valid filename!")
        exitProcess(1)
    }
    catch (error: NumberFormatException) {
        println("ERROR: The file contains invalid numeric data!")
        exitProcess(1)
    }
    catch (error: Exception) {
        println("ERROR: Some sort of error occurred!")
        exitProcess(1)
    }

    val variance = try {
        variance(data)
    }
    catch (error: IllegalArgumentException) {
        println("ERROR: Not enough data to calculate variance!")
        exitProcess(1)
    }
    catch (error: Exception) {
        println("ERROR: Some sort of error occurred!")
        exitProcess(1)
    }

    println("Size of Dataset: ${data.size}")
    println("Variance: %.5f".format(variance))

}
