package buildings

fun main() {
    val material = Brick()
    val building: Building<Brick> = Building(material)
    building.build()
    material.isSmallBuilding<Brick>(building)
}