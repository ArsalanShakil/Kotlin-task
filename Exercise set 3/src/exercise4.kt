// Exercise set 3: Kotlin OOP exercises
// exercise 4
// Arsalan Shakil
// 1910097


fun main() {
    val setRadio = Radio()

    setRadio.ApplianceOn()
    setRadio.volumeMute()
    setRadio.ApplianceOff()

    val setTV = Television3()
    setTV.ApplianceOn()
    setTV.volumeMute()
    setTV.ApplianceOff()
}


abstract class AudioAppliance {
    var muteOn : Boolean = false

    open fun volumeMute(){
        muteOn = true
    }
}

class Radio(): AudioAppliance(), HomeAppliance2{
    override var isOn: Boolean = false

    override fun ApplianceOff(){
        super.ApplianceOff()
        println("Radio Off")
    }
    override fun ApplianceOn(){
        super.ApplianceOn()
        println("Radio On")
    }
    override fun volumeMute(){
        super.volumeMute()
        if (muteOn){
            println("Radio Muted")
        }
    }


}

class Television3(): AudioAppliance(), HomeAppliance2{

    override var isOn: Boolean = false

    override fun ApplianceOff(){
        super.ApplianceOff()
        println("Television Off")
    }
    override fun ApplianceOn(){
        super.ApplianceOn()
        println("Television On")
    }
    override fun volumeMute(){
        super.volumeMute()
        if (muteOn){
            println("Television Muted")
        }
    }


}

interface HomeAppliance2{
    var isOn : Boolean

    fun ApplianceOff(){
        isOn = false
    }

    fun ApplianceOn(){
        isOn = true
    }
}