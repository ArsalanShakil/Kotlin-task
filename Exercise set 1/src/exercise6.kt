// Exercise set 1: Kotlin basics exercises
// exercise 6
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    var int = 0
    loop@while(int < 50000){
        val float = int.toFloat()
        if((int*int).toFloat() != float * float){
            println("$int")
            break@loop
        }
        else{
            int++
        }
    }
}
