package Lesson_4.Test.`object`

import javax.print.attribute.standard.MediaSize

object Singleton{
    var name : String = "Dima"
    fun hello() = println("hello")
}

class Outer{
    private constructor()
    companion object Loader{
        fun hello() = println("hello from companion object")
    }
}

interface ClickListener{
    fun click()
}

class View{
    fun setOnClickListener(listener: ClickListener){
        // Todo: Click
    }
}

fun main(){
    println(Singleton.name)
    Singleton.hello()

    Outer.hello()

    val view = View()

    view.setOnClickListener(object : ClickListener {
        override fun click() {
            TODO("Not yet implemented")
        }
    })
}