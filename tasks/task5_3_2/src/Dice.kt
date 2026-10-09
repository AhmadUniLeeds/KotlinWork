// Task 5.3.2: rollDice() function

import kotlin.random.Random

fun rollDie(sides: Int = 6, numberOfDice: Int = 1) {

    var sumOfDice = 0
    var result = 0
    println("Rolling a d$sides $numberOfDice times...")

    repeat(numberOfDice) {
        if (sides in setOf(4, 6, 8, 10, 12, 20)) {
            result = Random.nextInt(1, sides + 1)
            sumOfDice += result
        }
        else {
            println("Error: cannot have a $sides-sided die")
        }
    }

    println("You rolled $sumOfDice")
}