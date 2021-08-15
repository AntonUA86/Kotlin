package Lesson_2

class Person(
    val name: String,
    var isMarried : Boolean = false
)

interface View {
    fun click()
    fun whoAmI() = println("I'm a view!")
}

interface  Shape {
    fun whoAmI() = println("I'm a shape!")
}
class Button : View, Shape {
    override fun click() = println("Button click")
    // override fun whoAmI() = println("I'm a button!")
    override fun whoAmI() {
        super<View>.whoAmI()
        super<Shape>.whoAmI()
    }
}

class TextView : View {
    override fun click() = println("TextView click")
    override fun whoAmI() = println("I'm a textview!")
}

fun String.lastCharOf() : Char = get(length - 1)

// вернуть все совпадения с шаблоном в строке в виде листа
fun String.allMatchesOf(pattern: String) : List<String>
{
    val ret = mutableListOf<String>()
    //val html = "<html><head>hello</head><h1>heading</h1><p>Greet!<br></html>"
    //val regexp = """<[^>/]+>""" // ???
    val found = pattern.toRegex().findAll(this)
    for(result in found)
    {
        ret.add(result.value)
    }
    return ret;
}
fun List<String>.firstElementOf() : String = get(0)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

    val area : Int
        get() = height*width

    var depth: Int = 0
        set(value)  {
            println("Old value $field new value $value")
            field = value
        }
}

fun main()
{
    //    val button = Button()
//    button.click()
//    button.whoAmI()
    val list : List<View> = mutableListOf();
    val v1 : View = Button()
    val v2 : View = TextView()
    v1.whoAmI()
    v2.whoAmI()

    val max = Person("Max")
    println("${max.name} ${max.isMarried}")

    val html = "<html><head>hello</head><h1>heading</h1><p>Greet!<br></html>"
    val regexp = """<[^>/]+>""" // ???
    html.allMatchesOf(regexp).forEach { println(it) }

    //println("Java".lastCharOf())
    //println(listOf("one", "two").firstElementOf())

    val r = Rectangle(12,20)
    r.depth = 12


}