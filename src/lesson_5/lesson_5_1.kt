package lesson_5
    const val VERIFICATION_RESULT = 10
fun main() {

    println("Напишите результат суммирования чисел 7 и 3:")
    val result = readln().toInt()
    if (VERIFICATION_RESULT == result) {
        println("Добро пожаловать!")}
    else{
        println("Доступ запрещен.")
    }
}

