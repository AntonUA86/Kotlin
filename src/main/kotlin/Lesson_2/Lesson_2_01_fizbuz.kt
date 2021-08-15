package Lesson_2

// 4 ->
// делится на 3 -> Fizz
// делится на 5 -> Buzz
// делится и на 3 и на 5 -> FizzBuzz
fun fizbuz(data: Int) =
    when
    {
        data % 3 == 0 && data % 5 == 0 -> "$data: FizzBuzz"
        data % 3 == 0                  -> "$data: Fizz"
        data % 5 == 0                  -> "$data: Buzz"
        else                           -> "$data:"
    }

fun main()
{
    for(i in 1..25)
    {
        println(fizbuz(i))
    }
}