package Lesson_4.Test

fun String?.isEmptyOrNull() : Boolean {
    return when{
        this == "" -> true
        this == null -> true
        this == "hello" -> false
        else -> true;
    }
}

/* fun String?.isEmptyOrNull() : Boolean = this?.isEmpty() ?: true; */

// "" true
// null true
// "hello" false

fun main(){
    println("".isEmptyOrNull()) // true
    println(null.isEmptyOrNull()) // true
    println("hello".isEmptyOrNull()) //false
 }