// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {

    val (a, b, c) = triangle

    if (a < 0.0 || b < 0.0 || c < 0.0) {
        return false
    }
    else if ((a < b + c) && (b < c + a) && (c < a + b)) {
        return true
    }
    else {
        return false
    }
}

fun triangleArea(triangle: Triangle): Double {

    val (a, b, c) = triangle

    val s = 0.5 * (a + b + c)
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    return area

}
