package Lesson_4.Test

import Lesson_3.isValidId
import Lesson_4.Test.java.JavaClickListener
import Lesson_4.Test.java.JavaView
import age

data class Person(val name: String, val age : Int)

val people = listOf(
    Person("Alice", 29),
    Person("Bob", 20),
    Person("Hurane", 220),
)

fun Person.isAdult() : Boolean = age >= 18

fun main(){
/*    val javaView = JavaView()
    javaView.setOnClickListener(object : JavaClickListener{
        override fun onClick(view: JavaView?) {
            TODO("Not yet implemented")
        }
    });

    javaView.setOnClickListener { println("hello") };*/

    println(people.minByOrNull({ p: Person -> p.age }))
    println(people.minByOrNull { person -> person.age })
    println(people.minByOrNull { it.age })
    println(people.minByOrNull(Person::age))

    var counter = 0
    people.forEach{
        counter++
    }
    println(counter)

    val create = ::Person
    val max = (create("Max", 23))
    val adult = Person::isAdult
    val maxAge = max:: age
}