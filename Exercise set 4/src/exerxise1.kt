// Exercise set 4: Kotlin collections etc exercises
// exercise 1
// Arsalan Shakil
// 1910097

class NumberTranslator(valSet:Set<Pair<Int,String>>){
    private val translation = valSet.toMap()
    fun translate(valNum : Int):String{
        return translation.getOrDefault(valNum,"unknown")
    }
}