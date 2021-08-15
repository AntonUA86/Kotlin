package Lesson_3

interface Clickable
{
    fun click()
}

open class RichButton : Clickable {  // open - октрыт для наследования
    override fun click() {}          // override - можно прооверрайдить в подклассах
    // final override fun click() {} // final - нельзя прооверрайдить в подклассах
    open fun disable() {}            // есть open - можно прооверрайдить в подклассах
    fun focus() {}                   // нет open -  нельзя прооверрайдить в подклассах
}

class AnimatedButton : RichButton()
{
    override fun click() {}
    override fun disable() {}
}


abstract class Animated {    // abstract - октрыт для наследования
    abstract fun animate()   // abstract - нужно прооверрайдить в подклассах
    fun startAnimate() {}    // нет open но есть реализация -  нельзя прооверрайдить в подклассах
    open fun stopAnim() {}   // есть open - можно прооверрайдить в подклассах
}

class Animator : Animated()
{
    override fun animate() {}
    override fun stopAnim() {}
}

class Outer // Внешний
{
    class Nested { // Вложенный

    }
    inner class Internal { // Внутренний
        fun getOuter() : Outer = this@Outer
    }
}

class User (val name:String) : Base() {
    init {
        println("user init block")
    }
}



class User2 (_name : String)
{
    val name: String = _name
}

open class Base {
    init {
        println("Base init block")
    }
}

class User1  {
    val name : String

    init {
        println("init block")
    }

    constructor(name: String = "Max")
    {
        println("constructor")
        this.name = name
    }
}

class Secret {
    private constructor()
}

data class Client(val name: String , val index : Int,val isMarried : Boolean = false)
//{
//    override fun toString(): String {
//        return "name: $name, index: $index"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if(other == null || other !is Client) return false
//        return name == other.name && index == other.index
//    }
//
//    override fun hashCode(): Int = name.hashCode()*37 + index
//
//      copy
//      component1 ... componentN
//}

fun main()
{

    val misha = Client("Misha", 112112)
    val masha = Client("Misha", 112112)

    val vasya = masha.copy(name = "Vasya")

    val(index, name) = vasya


    println(misha)
    println (misha == masha)
    val set = hashSetOf(misha)
    println(set.contains(masha))




    val outer    = Outer()
    val nested   = Outer.Nested()
    val internal = outer.Internal()
}


