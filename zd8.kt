fun main(){
    try {
        println("Введите первое число:")
        var num1 = readLine()!!.toDouble()
        println("Введите второе число:")
        var num2 = readLine()!!.toDouble()
        when{
            num1<=num2 -> num1 = 0.0
            else -> num1 = num1
        }
        println("Первое число: $num1, второе число: $num2 ")
    }
    catch(e:Exception)
    {
        println("Некорректный ввод значений")
    }
}