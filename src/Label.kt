/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
fun labelBreak() {

    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..20) {
            if (i > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }

}

fun labelContinue() {

    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..20) {
            if (j == 5) {
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }

}

fun main() {

    labelBreak()
    labelContinue()

    fun test(name: String, param: (String) -> Unit): Unit = param(name)
    test("Bagus Seno") test@{
        if (it == "") {
            return@test
        } else {
            println("Bagus Seno")
        }
    }

}