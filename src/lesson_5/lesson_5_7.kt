package lesson_5

fun main() {
    println("Введите расстояние поездки (в километрах):")
    val distance: Double = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption: Double = readln().toDouble()
    println("Введите текущую цену за литр топлива (в руб.):")
    val fuelPrice: Double = readln().toDouble()

    val weNeedFuel = (distance * fuelConsumption) / 100
    val fuelCost = weNeedFuel * fuelPrice
    val formatImt = String.format("%.2f", fuelCost)
    println("Общее количество топлива, которое потребуется для поездки: $weNeedFuel л")
    println("Стоимость поедки: $formatImt руб.")
}


