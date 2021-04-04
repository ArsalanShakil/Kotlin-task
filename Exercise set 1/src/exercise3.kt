// Exercise set 1: Kotlin basics exercises
// exercise 3
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    val myListOfWords = mutableListOf<String>()
    val myListOfBannedWords = listOf<String>("offer","rich","money","quick")
    var count = 0
    var sub = 0
    loop@ do {
        val words = readLine().toString()
        if (myListOfBannedWords.contains(words)) {
            count++
        }
        else if("quit"== words){
            break@loop
        }
        else {
            sub++
            myListOfWords.add(words)
        }
    }while("quit"!= words)
    for (i in 0 until myListOfWords.size) {
        println("${myListOfWords[i]}")
    }
    println("number of accepted word : $sub and number of banned words : $count")







}
