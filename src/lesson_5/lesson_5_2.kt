package lesson_5
    const val CURRENT_YEAR = 2025
    const val COMING_OF_AGE = 18
fun main() {

    println("Введите год своего рождения:")
    val yearOfBirth = readln().toInt()
    val result = CURRENT_YEAR - yearOfBirth
    if (result >= COMING_OF_AGE) {
        println("Показать экран со скрытым контентом")}
    else{
        println("Доступ запрещен.")
    }
}

