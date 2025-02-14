
fun main(){
    try{
        println("Введите числа a,b,c,d (a<b,c<d):")
        val a = readLine()!!.toDouble()
        val b = readLine()!!.toDouble()
        val c = readLine()!!.toDouble()
        val d = readLine()!!.toDouble()
        println("Введите x:")
        val x = readLine()!!.toDouble()
        if(a<b && c<d){
            when{
                x in a..b -> println("x принадлежит отрезку [$a, $b]")
                x in c..d -> println("x принадлежит отрезку [$c, $d]")
                x>= a && x<=b && x>= c && x<=d -> println("x принадлежит общей части отрезков [$a, $b] и [$c, $d]")
                else -> println("x не принадлежит ни одному из заданных отрезков")
            }
        }
        else{
            println("Числа не соответствуют условию (a<b,c<d)")
        }
    }
    catch(e:Exception){
        println("Некорректный ввод")
    }
}