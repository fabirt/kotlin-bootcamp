import java.util.*

fun main() {
    dayOfWeek()
    println(greetings(11))
}

fun dayOfWeek() {
    println("What day is it today?")
    val dow = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    printDayOfWeek(dow)
}

fun printDayOfWeek(dayOfWeek: Int) {
    when (dayOfWeek) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Nothing")
    }
}

fun greetings(arg: Int): String {
    val beforeMidday = arg < 12
    return if (beforeMidday) "Good morning, Kotlin" else "Good night, Kotlin"
}

