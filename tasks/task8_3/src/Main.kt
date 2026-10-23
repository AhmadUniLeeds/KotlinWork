// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here

    if (args.size != 1) {
        println("ERROR: Please enter the filename!")
        exitProcess(1)
    }

    val data = fetchData(args[0])

    val lowestTemperature = data.minBy {it.second}
    val highestTemperature = data.maxBy {it.second}

    println("The station with the lowest temperature is ${lowestTemperature.first}, with the temperature of ${lowestTemperature.second} degrees.")
    println("The station with the highest temperature is ${highestTemperature.first}, with the temperature of ${highestTemperature.second} degreees.")

    val averageTemperatureFromFunction = averageTemp(data)
    println("The average station temperature is %.2f degrees.".format(averageTemperatureFromFunction))

    val averageTemperature = data.sumOf {it.second} / data.size
    println("The average station temperature is %.2f degrees.".format(averageTemperature))


}
