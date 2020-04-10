fun main() {
    println(whatShouldIDoToday("sad"))
}

/**
 * Returns some advice.
 * @param [temperature] in Celsius
 */
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isRainy(weather) && isSad(mood) -> "Stay home and read :D"
        !isRainy(weather) -> "go for a walk"
        isHot(temperature) -> "Have an ice cream!"
        else -> "Love yourself"
    }
}

fun isHot(temperature: Int): Boolean = temperature > 25

fun isRainy(weather: String): Boolean = weather == "rainy"

fun isSad(mood: String): Boolean = mood == "sad"