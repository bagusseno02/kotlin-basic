/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 01/11/20
 * Project kotlin-basic
 */
fun main() {

    hello("Bagus Seno")
    hello("Bagus Seno", "Prasetyo Diwiryo")

}

fun hello(firstname : String, lastname : String = "") {

    println("Hallo, $firstname $lastname")

}