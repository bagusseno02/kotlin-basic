/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */

fun factorialLoop(value : Int):Int{

    var result = 1;
    for(i in value downTo 1){
        result *= i
    }
    return result

}

fun factorialRecursive(value : Int): Int{

    return when(value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }

}

fun main() {

    println(factorialLoop(10))
    println(factorialRecursive(10))

}