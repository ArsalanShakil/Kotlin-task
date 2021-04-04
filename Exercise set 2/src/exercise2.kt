// Exercise set 2: Kotlin functions exercises
// exercise 2
// Arsalan Shakil
// 1910097
fun main(args: Array<String>) {
    print(numAdults(listOf(22,33,122,55,41,21)))
}
fun ageDiscriminator2(age : Int) :String {
    return when(age){
        in 0..17 -> "underage"
        in 18..65 -> "adult"
        in 65..130 -> "senior"
        else -> "unknown"

    }
}
fun numAdults(ages: List<Int>) : Int {
    var count = ages.count { ageDiscriminator2(it) == "adult" }
    return count



}