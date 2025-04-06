package lesson_4
    const val numberOfTables = 13
fun main() {
    var tableReservations: Int
    val availabilityOfTables1: Boolean
    val availabilityOfTables2: Boolean

    tableReservations = 13
    availabilityOfTables1 = (numberOfTables) > (tableReservations)
    tableReservations = 9
    availabilityOfTables2 = (numberOfTables > tableReservations)
    println("[Доступность столиков на сегодня: $availabilityOfTables1]," +
    "[Доступность столиков на завтра: $availabilityOfTables2].")
}