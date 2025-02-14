
fun main(){
    try {
        println("Введите размеры прямоугольного отверстия:")
        val A = readLine()!!.toInt()
        val B = readLine()!!.toInt()
        println("Введите размеры кирпича:")
        val x = readLine()!!.toInt()
        val y = readLine()!!.toInt()
        val z = readLine()!!.toInt()
        if(A>0 && B>0 && x>0 && y>0 && z>0){
            val pass = when{
                (x<=A && y<= B)|| (y<=A && x<=B) -> true
                (x<=A && z<= B)|| (z<=A && x<=B) -> true
                (z<=A && y<= B)|| (y<=A && z<=B) -> true
                else -> false
            }
            if(pass){
                println("Кирпич проходит в прямоугольное отверстие")
            }
            else{
                println("Кирпич не проходит в прямоугольное отверстие")
            }
        }
        else{
            println("Размеры не могут быть отрицательными или равными нулю")
        }
    }
    catch(e:Exception)
    {
        println("Некорректный ввод значений")
    }
}