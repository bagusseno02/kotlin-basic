/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    val range = 0..1000
    println(range.count())
    println(range.contains(200))
    println(range.step)
    println(range.start)

    val rangeDown = 10000 downTo 0

    /* Range Dengan Step */

    val genap = 1..100 step 2
    println(genap)

}