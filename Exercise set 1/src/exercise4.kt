// Exercise set 1: Kotlin basics exercises
// exercise 4
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    val array = arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(8, 9, 10, 11),
            arrayOf(15, 16, 17, 18),
            arrayOf(22, 23, 24, 25)
    )
    array.forEach {
        it.forEach { print("$it\t") }
        print("\n")
    }

}
