package lesson_2

fun main() {

    val numberOfEmployees = 50
    val employeeSalaries = 30000
    val numberOfInterns = 30
    val salaryOfInterns = 20000

    val employeeExpenses = numberOfEmployees * employeeSalaries
    // расход на постоянных сотрудников в руб.
    val totalConsumption = (numberOfEmployees * employeeSalaries) + (numberOfInterns * salaryOfInterns)
    // общий расход по ЗП на всех в руб.
    val averageSalary =
        (numberOfEmployees * employeeSalaries + numberOfInterns * salaryOfInterns) / (numberOfEmployees + numberOfInterns)
    // средняя ЗП в руб.
    print(employeeExpenses)
    println(" руб.")
    print(totalConsumption)
    println(" руб.")
    print(averageSalary)
    println(" руб.")
}