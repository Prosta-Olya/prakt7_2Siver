fun main(){
    try {
        println("Введите числа a,b,c,d,e,f:")
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()
        val d = readLine()!!.toDouble()
        val e = readLine()!!.toDouble()
        val f = readLine()!!.toDouble()
        val D = a * e - b * d
        val Dx = c * e - b * f
        val Dy = a * f - c * d
        when {
            D != 0.0 -> {
                val x = Dx / D
                val y = Dy / D
                println("Система уравнений имеет 1 решение: x = $x, y = $y")
            }

            D == 0.0 && (Dx == 0.0 && Dy == 0.0) -> {
                println("Система уравнений имеет бесконечное множество решений")
            }

            else -> {
                println("Система уравнений не имеет решений")
            }
        }
    }
    catch (e:Exception){
        println("Некорректный ввод значений")
    }
}