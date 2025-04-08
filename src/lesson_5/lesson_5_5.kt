package lesson_5

import kotlin.random.Random

fun generator(): List<Int> {
    return (0..42).shuffled(Random.Default).take(3)
}

fun main() {
    println("Введите три числа от 0 до 42:")
    val enterTheFirstNumber = readln().toInt()
    val enterTheSecondNumber = readln().toInt()
    val enterTheThirdNumber = readln().toInt()
    val result = generator()
    val set1 = setOf(enterTheFirstNumber, enterTheSecondNumber, enterTheThirdNumber)
    val intersection = result.intersect(set1.toSet()).size
    when (intersection) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Отлично! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число. Получите утешительный приз!")
        else -> println("К сожалению, Вы не угадали ни одного числа.")
    }
    println("Выигрышные числа: $result")
}


