// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here

    val string = "This is a string to test out the howMany function I created."

    val howManyUppercaseByHowMany = string.howMany { it.isUpperCase() }
    val howManyUppercaseByCount = string.count { it.isUpperCase() }
    println("Uppercase:    howMany = $howManyUppercaseByHowMany  count = $howManyUppercaseByCount ")

    val howManyLowercaseByHowMany = string.howMany { it.isLowerCase() }
    val howManyLowercaseByCount = string.count { it.isLowerCase() }
    println("Lowercase:    howMany = $howManyLowercaseByHowMany  count = $howManyLowercaseByCount ")


    val howManyVowelsByHowMany = string.howMany { it.lowercaseChar() in "aeiou" }
    val howManyVowelsByCount = string.count { it.lowercaseChar() in "aeiou" }
    println("Vowels:    howMany = $howManyVowelsByHowMany  count = $howManyVowelsByCount ")

}
