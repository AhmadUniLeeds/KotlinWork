// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.useLines
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("ERROR: Please enter the filename!")
        exitProcess(1)
    }

    val filePath = Path(args[0])
    var longestLineNumber = 0
    var longestLine = ""
    var currentLineNumber = 1

    filePath.useLines {
        for (line in it) {
            if (longestLine.length < line.length) {
                longestLine = line
                longestLineNumber = currentLineNumber
            }
            currentLineNumber += 1
        }
    }

    val longestLineLength = longestLine.length

    println("Line $longestLineNumber is the longest (length = $longestLineLength)")

}