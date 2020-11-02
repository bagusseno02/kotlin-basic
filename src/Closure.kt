/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
fun main() {

    var counter: Int = 0
    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun (){
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function Increment")
        counter++
    }

    anonymousIncrement()
    lambdaIncrement()
    functionIncrement()

}