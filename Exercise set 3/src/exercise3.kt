// Exercise set 3: Kotlin OOP exercises
// exercise 3
// Arsalan Shakil
// 1910097

fun main(){

    val sets = listOf(Television2(),Television2(),Television2(),VacuumCleaner(),VacuumCleaner())
    for (set in sets){
        set.ApplianceOn()
        set.ApplianceOff()
    }

}

class VacuumCleaner(): HomeAppliance{
    private fun makeTerribleNoise() :Boolean{
        println("Make terrible noise")
        return isOn
    }

    override var isOn: Boolean = false
    override fun ApplianceOff(){
        super.ApplianceOff()
        println("Vacuum Off")
    }
    override fun ApplianceOn(){
        super.ApplianceOn()
        println("Vacuum On")
        makeTerribleNoise()

    }


}


class Television2(): HomeAppliance{

    override var isOn: Boolean = false

    override fun ApplianceOff(){
        super.ApplianceOff()
        println("Television Off")
    }
    override fun ApplianceOn(){
        super.ApplianceOn()
        println("Television On")
    }


}

interface HomeAppliance{
    var isOn : Boolean

    fun ApplianceOff(){
        isOn = false
    }

    fun ApplianceOn(){
        isOn = true
    }
}