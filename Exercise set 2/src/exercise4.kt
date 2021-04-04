// Exercise set 2: Kotlin functions exercises
// exercise 5
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    println(editDistance("kitten", "sitting"))
}

fun editDistance(string1: String, string2: String): Int {

    if (string1 == string2)  return 0
    if (string1 == "") return string2.length
    if (string2 == "") return string1.length

    val previous = IntArray(string2.length + 1) { it }
    val current = IntArray(string2.length + 1)

    var change: Int
    for (i in string1.indices) {
        current[0] = i + 1
        for (j in string2.indices) {
            change = if (string1[i] == string2[j]) 0 else 1
            current[j + 1] = (current[j] + 1).coerceAtMost((previous[j + 1] + 1).coerceAtMost(previous[j] + change))
        }
        for (j in 0 .. string2.length) {
            previous[j] = current[j]
        }
    }
    return current[string2.length]
}
