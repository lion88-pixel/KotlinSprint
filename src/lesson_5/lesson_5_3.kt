package lesson_5


fun main() {
    val firstNumber = 18
    val secondNumber = 20

    println("Введите два числа от 0 до 42:")
    val enteringTheFirstNumber = readln().toInt()
    val enteringTheSecondNumber = readln().toInt()


    if (firstNumber == enteringTheFirstNumber && secondNumber == enteringTheSecondNumber
       || firstNumber == enteringTheSecondNumber || secondNumber == enteringTheFirstNumber)
       {println("Поздравляем! Вы выиграли главный приз!")
    }

    else if (firstNumber == enteringTheFirstNumber || firstNumber == enteringTheSecondNumber
        || secondNumber == enteringTheFirstNumber || secondNumber == enteringTheSecondNumber)
        {println("Вы выиграли утешительный приз!")}
    else {println("Неудача!")
    }
    println("Победные числа 18 и 20")
}


