// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inputDocument: String, textRedacted: String, charRedacted: Char = 'X'): String {

    val replacement = buildString {
        for (n in 1..textRedacted.length) {
            append(charRedacted.toString())
        }
    }

    return inputDocument.replace(textRedacted, replacement)

}
