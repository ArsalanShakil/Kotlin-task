// Exercise set 1: Kotlin basics exercises
// exercise 5
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    val row = 4
    val column = 4
    val array = arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(8, 9, 10, 11),
            arrayOf(15, 16, 17, 18),
            arrayOf(22, 23, 24, 25)
    )
    val transpose = Array(column){IntArray(row) }
    for (i in 0 until row-1){
        for(j in 0 until column-1){
            transpose[j][i] = array[i][j]
        }
    }
    transpose.forEach {
        it.forEach { print("$it\t") }
        print("\n")
    }




}