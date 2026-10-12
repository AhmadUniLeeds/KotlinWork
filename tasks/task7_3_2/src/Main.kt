// Task 7.3.2: list element access

fun main() {

    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0] = 5
    println(numbers)
    numbers.add(1)
    println(numbers)
    numbers.removeAll{it == 5}
    println(numbers)
    numbers.addAll(listOf(5,6))
    println(numbers)

}