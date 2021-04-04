// Exercise set 3: Kotlin OOP exercises
// exercise 2
// Arsalan Shakil
// 1910097

fun main() {
    val tv = Television(3)
    tv.channelDown()
    tv.pressOnOff()
    for(i in 0..5) {
        println("channel is ${tv.channel}")
        tv.channelDown()
    }
    for(i in 0..5) {
        println("channel is ${tv.channel}")
        tv.channelUp()
    }

}

class Television(var countChannel: Int = 5) {

    var channel: Int = countChannel-1
    var isOn: Boolean = false

    fun pressOnOff() {
        isOn = true
        channel = 0
    }

    fun channelDown() {
        if (isOn && channel > 0) {
            channel--
        }
        else {
            channel = countChannel - 1
        }
    }
    fun channelUp() {
        if (isOn && channel < countChannel - 1) {
            channel++
        } else {
            channel = 0
        }
    }
}
