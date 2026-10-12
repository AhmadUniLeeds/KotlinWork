// Task 7.7.2: phone book simulator

import kotlin.system.exitProcess
const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)

    val db = createDatabase()
    db.load(CSV_FILENAME)

    while (true) {

        print("Enter a contact name (or press Enter to quit the program): ")
        val name = readln()

        if (name == "") {
            println("Exiting the program...")
            break
            //exitProcess(1)
        }

        if (name in db) {
            println()
            println("Phone number: ${db[name]}")
        }
        else {
            println()
            println("Contact not Found!")
            print("Enter phone number for $name: ")
            val number = readln()
            db[name] = number
            db.save(CSV_FILENAME)
            println()
            println("Contact Saved!")
        }

        println()

    }



}
