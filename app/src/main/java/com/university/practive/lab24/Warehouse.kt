package com.university.practive.lab24

// Клас Material
data class Material(
  val name: String,
  val code: String,
  val price: Double,
  val manufacturer: String,
  val materialType: String,
  val thermalConductivity: Double
)

// Клас для управління складом
class InsulationMaterialWarehouse {
  private val materials = mutableListOf<Material>()

  // Додавання матеріалу на склад
  fun addMaterial(material: Material) {
    materials.add(material)
  }

  // Видалення матеріалу зі складу
  fun removeMaterial(code: String) {
    materials.removeIf { it.code == code }
  }

  // Пошук матеріалів за видом матеріалу
  fun findMaterialsByType(type: String): List<Material> {
    return materials.filter { it.materialType == type }
  }

  // Виведення інформації про всі матеріали на складі
  fun printMaterialInformation() {
    for (material in materials) {
      println("Назва: '${material.name}'")
      println("Позначення: '${material.code}'")
      println("Ціна: ${material.price}")
      println("Фірма-виробник: '${material.manufacturer}'")
      println("Вид матеріалу: '${material.materialType}'")
      println("Теплопровідність: ${material.thermalConductivity}")
      println()
    }
  }
}

fun main() {
  val warehouse = InsulationMaterialWarehouse()

  val material1 = Material("Mineral Wool", "MW-01", 250.0, "Insulator Co.", "Roll", 0.038)
  val material2 = Material("Foam Board", "FB-02", 150.0, "ThermoBuild", "Sheet", 0.035)
  val material3 = Material("Foil Insulation", "FI-03", 75.0, "FoilTech", "Roll", 0.03)

  warehouse.addMaterial(material1)
  warehouse.addMaterial(material2)
  warehouse.addMaterial(material3)

  println("Інформація про всі матеріали на складі:")
  warehouse.printMaterialInformation()

  val materialType = "Roll"
  val materialsByType = warehouse.findMaterialsByType(materialType)
  println("Матеріали за видом '$materialType':")
  warehouse.printMaterialInformation()
}
