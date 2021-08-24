package Lesson_4.Test

import javax.swing.UIDefaults

data class Point(val x: Int, val y: Int)
{
    operator fun plus(other: Point) : Point{
        return  Point(x + other.x, y + other.y)
    }
}

class React(val ul : Point, val lr : Point)

operator fun React.contains(p: Point) : Boolean{
    return p.x in ul.x .. lr.x && p.y in ul.y .. lr.y
}

val LazyValue : String by lazy {
    println("Inti")
    "Hello"
}

class LateInit {
    var name : String = "Misha"
    lateinit var late : String

    fun init(){
        println(this::late.isInitialized)
        late = "Initialized"
    }
}

fun main(){
    val point = Point(3,3)
    val point2 = Point(4,4)
    val react = React(point, point2)

    var lateInit = LateInit()
    println(lateInit.late)

}