import java.math.BigDecimal

// one line

/*
 * multiline
 */

/*
/* embedded */
 */

val firstName : String = "Masha"
var lastName = "Ivanova"
var age = 25

const val DEBUG = true

fun main(args : Array<String>)
{
    // firstName = "Dasha"
    age = 26
    // age = "twenty"

    // if
    val temperature = 26
    /*
    val condition = if(temperature < -5 /*|| age < 4*/)
        "Холодно"
    else if(temperature < 5)
        "Около нуля"
    else
        "Жарко как в пустыне"
    */
    val condition = when {
        temperature < -5 /*|| age < 4*/ -> "Холодно"
        temperature < 5 -> "Около нуля"
        else -> "Жарко как в пустыне"
    }
    // try / catch

    println("Hello, world!")

    // nullable
    var position : String? = "programmer"
    position = null
    if(position != null)
        println ("length is " + position.length)

    println ("length is " + position?.length)

    println (position?.length ?: 0)

    // println ("length is " + position!!.length)

    val obj : Any = "15"

    if(obj is String) // smart cast   !is
    {
        println("len is " + obj.length)
    }

    val x: String = obj as String // unsafe cast
    //val z: String = age as String // ClassCastException

    val k: String? = age as? String // safe cast
    println(k)

    // строковые шаблоны
    println("имя: " + firstName + " фамилия: " + lastName + " возраст: " + age)

    println("имя: $firstName фамилия: $lastName возраст: ${age + 1}   \$")

    println("""
        one line
        two line
        three line
    """.trimIndent());

    println("""
        |SELECT * FROM USERS 
        |WHERE age > 24
        |GROUP BY NAME
    """.trimMargin());

    println(greeting(last="Ivanova", first = "Masha"))
    println(greeting(first = "Masha"))

    // while/do-while
    var counter = 0;
    while(counter < 10)
    {
        println("${counter++}")
    }

//    do {
//        val command = readLine();
//        println("command: $command")
//    } while (command != "quit")

    val oneToFive = 1..5
    val letters   = 'a'..'z'
    val words     = "Java".."Yaml"

    if('d' in letters)
    {}
    if("Kotlin" in words)
    {}

    // for
    for(letter in letters)
    {
        println(letter)
    }

    // println(japaneseSalary(-BigDecimal.TEN, 10))

    // val array : Array<Int> = arrayOf<Int>(1, 2, 3, 4)
    val array = arrayOf(1, 2, 3, 4)
    //array = arrayOf(5);
    array[2] = 25

    val list = listOf("One", "Two", "Three");

    val mutableList = mutableListOf("One", "Two", "Three")
    mutableList[0] = "ONE"
    mutableList.add("Four")

    val pair = Pair("one", "two")

    println("first: ${pair.first} second: ${pair.second}")

    val infixPair = 1 to "One"

    val map = mutableMapOf(1 to "one", 2 to "two")

    for((f,s) in map)
    {
        println("f: $f s: $s")
    }

    val (a,b,c) = Triple(32, "Max Katkov", listOf(1,2,3))


}

fun japaneseSalary(base : BigDecimal, years: Int) : BigDecimal {
    require(base > BigDecimal.ZERO) { "Base salary can't be negative" }
    return base + 10_000.toBigDecimal()*years.toBigDecimal()
}


// base + years * 10_000
// 10_000.toBigDecimal()


fun greeting(first:String, last: String = "Ivanova") : String
{
    require(!first.isBlank()) {"Нужно указать имя"}
    require(!last.isBlank())  {"Нужно указать фамилию"}
    // requireNotNull()
    // check()
    // assert()
    return "Hello, $first $last"
}
