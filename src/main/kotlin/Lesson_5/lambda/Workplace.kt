package Lesson_5.lambda


data class Emp(
    val name: String,
    val age : Int,
    val position: String
)

fun main()
{
    val employees = listOf(
        Emp("Max Petrov", 22, "programmer"),
        Emp("Ivan Shapovalov", 33, "analyst"),
        Emp("Semen Deznev", 55, "manager"),
        Emp("Oleg Petrov", 19, "intern"),
        Emp("Katerina Drogova", 31, "programmer"),
        Emp("Nikolay Spivakov", 23, "analyst"),
        Emp("Boris Moiseev", 48, "manager"),
        Emp("Petr Sveshnikov", 37, "programmer"),
        Emp("Maria Kasatonova", 33, "analyst"),
        Emp("Olga Filimonova", 27, "programmer")
    )

    // самый молодой
    println( employees.minByOrNull { it.age })

    // количество программистов
    println(employees.count { it.position == "programmer" })

    // распечатать все имена программистов
    println(employees.filter { it.position == "programmer" }.map { it.name.substringBefore( " ") })

    // средний возраст
    println(employees.map { it -> it.age.toFloat() }.average())

    // разделить на две группы - старше 40 и младше
    employees.partition { it.age > 40 }.second

    // найти профессию самого старого из молодых
    employees.partition { it.age > 40 }.second.maxByOrNull { it.age }

    // сгруппировать по профессии и распечатать профессию и количевство работников в ней
    println(employees.groupBy { it.position }.mapValues { it.value.count() })

    // вернуть в виде пары средний возраст женщин и мужчин
    println(employees)

    // распечатать работников с самым часто встречающимся возростом
    println(employees.groupBy { it.age }.maxByOrNull { it.value.count() })

    // пару из работников с самой большой разницей в возрасте
    println(employees.flatMap { emp -> employees.map { it -> Pair(it, emp) } }.maxByOrNull { it.first.age - it.second.age })

}