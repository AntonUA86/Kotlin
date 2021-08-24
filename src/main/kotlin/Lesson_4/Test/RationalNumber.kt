package Lesson_4.Test

data class RationalNumber(val numerator: Int, val  denominator: Int)

fun Int.r() : RationalNumber = RationalNumber(this, 1)
fun Pair<Int,Int>.r() : RationalNumber = RationalNumber(first,second)

open class Base

class Child : Base()

fun Base.hello() : String = "hello base"

fun Child.hello() : String = "hello child"



fun main(){
    println(34.r())
    println((25 to 45).r())

    val  child : Base = Child()
    println(child.hello())
}