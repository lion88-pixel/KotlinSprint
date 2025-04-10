package lesson_5

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Для подтверждения, что вы не бот, решите пример:")
    val number1 = (1..10).random()
    val number2 = (1..10).random()
    println("$number1 + $number2 = ?")

    print("Ваш ответ: ")
    val userAnswer = scanner.nextLine()
    val answer = userAnswer.toInt()
    if (answer == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
    scanner.close()
}
