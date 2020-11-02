/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 01/11/20
 * Project kotlin-basic
 */
fun main() {

    println(sum(10, 20))
    println(sum(10, 200))

    val result = sum(20,20)
    println(result)

    println(bagi(100, 10))
    println(bagi(50, 0))

}

fun sum(nilai1 : Int, nilai2 : Int):Int {

    val total = nilai1 + nilai2
    return total


}

fun bagi(nilai1: Int, nilai2: Int):Int{

    if (nilai2 == 0){
        return 0
    }else {
        val total = nilai1 / nilai2
        return total
    }

}