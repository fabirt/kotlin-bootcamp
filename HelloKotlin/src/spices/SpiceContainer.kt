package spices

data class SpiceContainer(val spice: Spice) {
    val label: String = spice.name
}