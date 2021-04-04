// Exercise set 2: Kotlin functions exercises
// exercise 6
// Arsalan Shakil
// 1910097

import java.util.*



fun main(args: Array<String>) {
    startGame()
}

fun randNumGenerator(): Int {
    return Random().nextInt(100)
}

fun startGame(){
    println("Welcome to the Guessing Game!\n")
    val secretNum = randNumGenerator()
    var guess: Int
    var tries=0

    while (true) {
        print("Enter your guess (1-100): ")
        guess = readLine()?.toIntOrNull()?: 0

        when (guess.compareTo(secretNum)) {
            -1 -> { println("Too small!"); tries++ }
            0 -> { tries++; println("You win! You took $tries guesses!"); return }
            1 -> { println("Too big!"); tries++ }
        }
    }
}