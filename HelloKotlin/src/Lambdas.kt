import kotlin.random.Random

fun main() {
    val rol = rollDice(1)
    println(rol)
}

val rollDice = { n: Int ->
    val numberOfDices = if (n > 0) n else 1
    Random.nextInt(12 * numberOfDices)
}

val rollDice2: (Int) -> Int = { n ->
    val numberOfDices = if (n > 0) n else 1
    Random.nextInt(12 * numberOfDices)
}
