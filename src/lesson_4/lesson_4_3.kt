package lesson_4
    const val WEATHER_SUNNY: Boolean = true
    const val AWNING_OPEN: Boolean = true
    const val AIR_HUMIDITY: Int = 20
    const val SEASON: String = "It's not winter"
fun main() {


    val weatherSunny: Boolean = true
    val awningOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "winter"

    val result: Boolean = (WEATHER_SUNNY == weatherSunny) && (AWNING_OPEN == awningOpen) && (AIR_HUMIDITY == airHumidity) && (SEASON == season)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}
