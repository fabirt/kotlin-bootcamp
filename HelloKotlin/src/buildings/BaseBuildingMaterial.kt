package buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1

    fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) : Boolean {
        return if (building.actualMaterialsNeeded < 500) {
            println("small building")
            true
        } else {
            println("large building")
            false
        }
    }
}