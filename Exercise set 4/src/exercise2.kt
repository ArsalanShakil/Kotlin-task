// Exercise set 4: Kotlin collections etc exercises
// exercise 2
// Arsalan Shakil
// 1910097

class Lotto(){
    private val values = mutableSetOf<Int>()
    fun draw(){
        var numDraw = 1..40
        while (values.size < 7){
            values.add(numDraw.random())

        }
    }
}

