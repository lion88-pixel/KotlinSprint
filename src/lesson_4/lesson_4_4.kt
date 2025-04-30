package lesson_4

fun main() {

    val trainingDay = 5
    val forHandsAndAbs = (trainingDay - 1) % 2 == 0
    val forLegsAndBack = !forHandsAndAbs

    val result = """
        Упражнение для рук: $forHandsAndAbs
        Упражнение для ног: $forLegsAndBack
        Упражнение для спины: $forLegsAndBack
        Упражнение для пресса: $forHandsAndAbs
    """.trimIndent()
    println(result)
}