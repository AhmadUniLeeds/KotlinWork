// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {

    val sortedList = list.sorted()
    val listSize = list.size
    val median = listSize / 2

    if (listSize == 0) {
        throw IllegalArgumentException("List is empty!")
    }

    if (listSize % 2 == 1) {
        return sortedList[(median + 0.5).toInt()]
    }
    else {
        return (sortedList[(median - 0.5).toInt()] + sortedList[(median + 0.5).toInt()]) / 2
    }

}