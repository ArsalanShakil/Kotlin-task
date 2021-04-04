// Exercise set 4: Kotlin collections etc exercises
// exercise 3
// Arsalan Shakil
// 1910097


class Lotto2() {
    private val values = mutableSetOf<Int>()

    fun draw(){
        var numDraw = 1..40
        while (values.size < 7){
            values.add(numDraw.random())

        }
    }
    fun check(saveNum : MutableSet<Int>):Int{
        var check = false
        for (i in 0 until saveNum.size){
            check = saveNum.size == values.size
            if (!check){
                println("set saveNum is not equal to set values")
                break
            }
            check = saveNum.elementAt(i) in 1..40
            if (!check){
                println("set saveNum has out of range values")
                break
            }
        }
        return if (!check){
            0
        }
        else{
            val same = values.filter { saveNum.contains(it) }
            same.size
        }
    }

}
