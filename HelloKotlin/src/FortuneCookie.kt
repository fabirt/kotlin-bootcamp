fun main() {
    val fortune = getFortuneCookie(getBirthday())
    println("Your fortune is: $fortune")
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes: List<String> = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    val index: Int = when (birthday) {
        in 28..31 -> 0
        in 1..8 -> 4
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun getBirthday(): Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}