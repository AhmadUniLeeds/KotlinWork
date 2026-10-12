// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.useLines
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {

    Path(filename).forEachLine {
        // Add code here to read names and numbers from the file
        line -> val parts = line.split(",")
        // and insert them as keys and values into the map
        if (parts.size == 2) {
            val key = parts[0]
            val value = parts[1]
            this[key] = value
        }
    }

}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line

    Path(filename).writer().use {
        for ((key, value) in this) {
            it.write("$key,$value\n")
        }
    }

}
