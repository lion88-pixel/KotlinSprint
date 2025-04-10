package lesson_5

fun main() {
    val userName = "Zaphod"
    val password = "PanGalactic"
    println("Введите имя пользователя:")
    val userNameNew = readln()
    if (userName == userNameNew) {
        println("Введите пароль:")
    } else if (userName != userNameNew) {
        println("Пользователь пройдите регистрацию")
    }

    val passwordNew = readln()
    if (password == passwordNew && userName == userNameNew) {
        println("Пользователь $userName, вам разрешено входить на борт корабля \"Heart of Gold\"")
    } else {
        println("Пароль неверный, в доступе отказано!")
    }
}


