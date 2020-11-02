/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */

/* Varargs Harus Disimpan Di Paling Belakang */
fun hitungTotal(vararg values: Int): Int {

    var total = 0
    for (value in values) {
        total += value
    }
    return total

}

fun main() {

    val result = hitungTotal(10, 10, 10, 10)
    println(result)

}