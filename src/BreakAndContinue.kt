/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 01/11/20
 * Project kotlin-basic
 */
fun main() {

    /* Break */
    var i = 0
    while (true) {
        println("Break Me $i")
        i++
        if (i > 1000)
            break
    }

    /* Continue */
    for (index in 1..1000) {
        println("Index Ke - $index")

        if (index % 2 == 0) {
            continue
        }
        println("Bilangan Ganjil $index")
    }

}