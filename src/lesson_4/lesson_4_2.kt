package lesson_4
    const val CARGO_WEIGH_MIN = 35
    const val CARGO_WEIGH_MAX = 100
    const val CARGO_VOLUME_MAX = 100
fun main() {
    var weightOfTheCargo: Int
    var cargoVolume: Int

    weightOfTheCargo = 20
    cargoVolume = 80
    println("Груз с весом $weightOfTheCargo кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${(CARGO_WEIGH_MIN < weightOfTheCargo) && (CARGO_WEIGH_MAX >= weightOfTheCargo) && (cargoVolume < CARGO_VOLUME_MAX)}")

    weightOfTheCargo = 50
    cargoVolume = 100
    println("Груз с весом $weightOfTheCargo кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${(CARGO_WEIGH_MIN < weightOfTheCargo) && (CARGO_WEIGH_MAX >= weightOfTheCargo) && (cargoVolume < CARGO_VOLUME_MAX)}")
}
