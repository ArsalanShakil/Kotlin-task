// Exercise set 1: Kotlin basics exercises
// exercise 2
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {

    val originalStr = readLine().toString()
    var reverseStr = ""
    var length = originalStr.length

    for (i in (length - 1) downTo 0) {
        reverseStr = reverseStr + originalStr[i]
    }

    if (originalStr.equals(reverseStr,  ignoreCase= true)) {
        println("Yes")
    } else {
        println("No")
    }
}