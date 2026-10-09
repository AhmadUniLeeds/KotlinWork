// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess
import kotlin.math.round

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here

    if (args.size != 3) {
        println("ERROR: Please enter all three values!")
        exitProcess(1)
    }

    var initialTemperatureCelcius = args[0].toFloat()
    val maximumTemperatureCelcius = args[1].toFloat()
    val temperatureIncrement = args[2].toFloat()

    val terminal = Terminal()

    terminal.println(table {
        header { row("Celcius", "Fahrenheit") }
        body {
            align = TextAlign.RIGHT
            while (initialTemperatureCelcius < maximumTemperatureCelcius) {
                row(initialTemperatureCelcius.toString(), ("%.1f").format(initialTemperatureCelcius * 1.8).toString())
                initialTemperatureCelcius += temperatureIncrement
            }
        }
    })

}
