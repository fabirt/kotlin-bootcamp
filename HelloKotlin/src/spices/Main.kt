package spices

fun main() {
    val curry = Curry("curry", "korean")
    val curry2 = Curry("curry dulce", "n")
    val curry3 = Curry("curry mexican", "hot")

    val spiceCabinet = listOf<SpiceContainer>(SpiceContainer(curry), SpiceContainer(curry2), SpiceContainer(curry3))

    for (spice in spiceCabinet) {
        println(spice.label)
    }
}