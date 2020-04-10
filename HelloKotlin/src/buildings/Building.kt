package buildings

class Building<T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}