
fun main() {
    try {
        println("Введите номер дня недели:")
        val num = readLine()!!.toInt()
        when (num) {
            1 -> println("Понедельник - рабочий день")
            2 -> println("Вторник - рабочий день")
            3 -> println("Среда - рабочий день")
            4 -> println("Четверг - рабочий день")
            5 -> println("Пятница - рабочий день")
            6 -> println("Суббота - выходной день")
            7 -> println("Воскресенье - выходной день")
            else -> println("Некорректный ввод")
        }
    } catch (e: Exception) {
        println("Некорректный ввод")
    }
}