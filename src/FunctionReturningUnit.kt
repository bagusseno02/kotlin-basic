/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 01/11/20
 * Project kotlin-basic
 */
fun main() {

    printHello("Seno")

}

/* Tidak Wajib Kembalikan Data*/
fun printHello(name: String?): Unit {

    if (name == null) {
        println("Hello, Bro")
    } else {
        println("Hello, Bro $name")
    }

}