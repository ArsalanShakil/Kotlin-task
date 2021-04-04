// Exercise set 4: Kotlin collections etc exercises
// exercise 5
// Arsalan Shakil
// 1910097

fun main() {

    val U1 :Pair<Int, String> = Pair(1, "ایک")
    val U2 :Pair<Int, String> = Pair(2, "دو")
    val U3 :Pair<Int, String> = Pair(3, "تین")
    val U4 :Pair<Int, String> = Pair(4, "چار")
    val U5 :Pair<Int, String> = Pair(5, "پانچ")
    val U6 :Pair<Int, String> = Pair(6, "چھ")
    val U7 :Pair<Int, String> = Pair(7, "سات")
    val U8 :Pair<Int, String> = Pair(8, "آٹھ")
    val U9 :Pair<Int, String> = Pair(9, "نو")
    val U10 :Pair<Int, String> = Pair(10, "دس")

    val F1 :Pair<Int, String> = Pair(1, "yksi")
    val F2 :Pair<Int, String> = Pair(2, "kaksi")
    val F3 :Pair<Int, String> = Pair(3, "kolme")
    val F4 :Pair<Int, String> = Pair(4, "neljä")
    val F5 :Pair<Int, String> = Pair(5, "viisi")
    val F6 :Pair<Int, String> = Pair(6, "kuusi")
    val F7 :Pair<Int, String> = Pair(7, "seitsemän")
    val F8 :Pair<Int, String> = Pair(8, "kahdeksan")
    val F9 :Pair<Int, String> = Pair(9, "yhdeksän")
    val F10 :Pair<Int, String> = Pair(10, "kymmenen")


    val toUrdu = NumberTranslator2(setOf(U1,U2,U3,U4,U5,U6,U7,U8,U9,U10))
    println(toUrdu.translate(1))
    println(toUrdu.translate(6))
    println(toUrdu.translate(10))
    println(toUrdu.translate(11))
    println("-------------------------")
    val toFinnish = NumberTranslator2(setOf(F1,F2,F3,F4,F5,F6,F7,F8,F9,F10))
    println(toFinnish.translate(1))
    println(toFinnish.translate(6))
    println(toFinnish.translate(10))
}

class NumberTranslator2(valSet: Set<Pair<Int,String>>){
    private val translation = valSet.toMap()
    fun translate(valNum : Int):String{
        return translation.getOrDefault(valNum,"unknown")
    }
}