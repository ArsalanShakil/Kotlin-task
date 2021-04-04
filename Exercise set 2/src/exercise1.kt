// Exercise set 2: Kotlin functions exercises
// exercise 1
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    println(ageDiscriminator(130))
}
fun ageDiscriminator(age : Int) :String {
    return when(age){
        in 0..17 -> "underage"
        in 18..65 -> "adult"
        in 65..130 -> "senior"
        else -> "unknown"

    }
}