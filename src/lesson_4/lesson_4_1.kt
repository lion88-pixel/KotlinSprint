package lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9
    val availableToday = NUMBER_OF_TABLES - bookedToday > 0
    val availableTomorrow = NUMBER_OF_TABLES - bookedTomorrow > 0

    println("[Доступность столиков на сегодня: $availableToday],\n" +
    "[Доступность столиков на завтра: $availableTomorrow].")
}