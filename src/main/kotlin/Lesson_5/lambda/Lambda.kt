package Lesson_5.lambda

data class Person(val name: String, val age: Int)

val people = listOf(
    Person("Alica", 32),
    Person("Fas", 24),
    Person("Boba", 25)
)

val list = listOf(1,2,3,4,5,6,7)
val nullableList : List<Int?> = listOf(1,2,3,4,5,null,7,6)

val ListOfList = listOf(
    listOf("abc", "kgb", "cie"),
    listOf("imb", "kpmg"),
)

val map = mapOf(1 to "One", 2 to "two", 3 to "three")

fun main(){
    val sum : (Int,Int) -> Int = {x:Int, y:Int -> x + y}
    val some : () -> Unit
    val result = sum( 1, 2 )

    list.filter { it % 3 == 0 }
    println(people.filter { it.age > 30 })
    println(nullableList.filter {x -> x != null && x % 3 == 0 })
    people.first{ it.age == 31 } /// NoSuchException
    people.firstOrNull(){ it.age == 31 } /// null LastOrNull
    people.maxByOrNull { it.age } // minBy
    list.distinct()
    list.distinctBy { it > 4 }
    people.map { it.name }
    people.filter { it.age > 30  }.map { it.name }
    println(list.map { it * 2 })

    map.mapValues { it.value.toUpperCase() }
    // any none all
    people.any { it.age == 29 }
    people.count { it.age == 31 }
    people.map { it -> it.age.toFloat() }.average()
    // fold reduce
    list.fold(1) { acc: Int, elem: Int -> acc * elem }
    people.groupBy { it.age }.keys
    people.associateBy { it.age }.values
    ListOfList.flatten().flatMap { it.toList() }
    people.zip(list)
}