// Exercise set 2: Kotlin functions exercises
// exercise 3
// Arsalan Shakil
// 1910097

fun main(args: Array<String>) {
    print(genPasswd(12, ::genChar))
}
fun genPasswd(len: Int = 8, genChar: () -> Char): String{
    var passWord : String = ""
    for (i in 0 until len){
        passWord += genChar().toString()
    }
    return passWord
}

fun genChar(): Char {
    var value = 'a'..'z'
    return value.random()
}


