// Exercise set 3: Kotlin OOP exercises
// exercise 1
// Arsalan Shakil
// 1910097

fun main(){
    val myArtist = Artist()
    myArtist.draw()
}

class Artist {
    fun draw(){
        val tools = listOf<DrawingTool>(Pen(), Marker("red",5),Pencil(),PaintBrush())
        for (tool in tools) {
            var set: DrawingTool = tool
            if ((set is Cappable) && set.capOn) {
                set.toogleCap()
                set.draw()
            }
            else{
                set.draw()
            }
        }

    }
}

abstract class DrawingTool(val color:String) {
   open fun draw(){}
}

class Marker(color: String, var inkLevel: Int):DrawingTool(color),Cappable {
    override fun draw() {
        if (inkLevel>0) {
            inkLevel--
            println("Marker draw")
        }

    }

    override var capOn: Boolean = true
}

class Pen(): DrawingTool("black"){
    override fun draw() {
        println("Pen draw")
    }
}

class Pencil (): DrawingTool("black"){
    override fun draw() {
        println("Pencil draw")
    }
}

class PaintBrush(): DrawingTool("black"){
    override fun draw() {
        println("PaintBrush draw")
    }
}

interface Cappable{
    var capOn:Boolean
    fun toogleCap(){
        capOn = !capOn
    }
}
