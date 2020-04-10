package spices

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 4
                "hot" -> 5
                "very hot" -> 6
                "korean" -> 7
                else -> 1
            }
        }

    init {
        println("Name: $name")
        println("Spiciness: $spiciness")
        println("Heat: $heat")
    }

    abstract fun prepareSpice()
}