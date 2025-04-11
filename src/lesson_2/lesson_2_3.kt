package lesson_2

const val TIME_TRANSFER = 60

fun main() {

    val departureTimeInHours = 9
    val departureTimeInMinutes = 39
    val travelTime = 457

    val departureTime = departureTimeInHours * TIME_TRANSFER + departureTimeInMinutes
    //переводим время убытие в минуты
    val totalArrivalTime = departureTime + travelTime
    //общее время прибытия в минутах
    val arrivalInHours = totalArrivalTime / TIME_TRANSFER
    val arrivalInMinutes = totalArrivalTime % TIME_TRANSFER
    println("Прибытие в $arrivalInHours:$arrivalInMinutes")
}