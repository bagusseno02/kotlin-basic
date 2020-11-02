/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */

fun String.hello() : String = "Hello $this"

fun String.printHello() : Unit = println("Hello $this")

fun main() {

    val name = "Bagus Seno Prasetyo Diwiryo"
    println(name.hello())
    name.printHello()

}