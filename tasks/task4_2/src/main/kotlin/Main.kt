// Task 4.2: use of if and ranges

fun main() {

    println("PIZZA MENU")
    println()
    println("(a) Margherita")
    println("(b) Chicken")
    println("(c) Tuna")
    println("(d) Four Cheese")
    println()

    val selection = readln().lowercase()
    if (selection.length == 1) {
        if (selection in "a".."d") {
            println()
            println("Order accepted")
        }
        else {
            println()
            println("Invalid Choice")
        }
    }
    else {
        println()
        println("Invalid Choice")
    }
}
