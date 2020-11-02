/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 01/11/20
 * Project kotlin-basic
 */
fun main() {

    hello("Bagus Seno", "Prasetyo Diwiryo")
    hello("Dwi", "Kurnianto")
    hello("Joko", null)

}

fun hello(firstname: String, lastname: String?) {

    if (lastname == null) {
        println("Hallo, $firstname")
    } else {
        println("Hallo, $firstname $lastname")
    }

}
