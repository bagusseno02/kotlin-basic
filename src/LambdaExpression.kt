/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
fun toUpper(value :String): String = value.toUpperCase()

fun main() {

    val lambdaName: (String, String) -> String = { firstname: String, lastname: String ->
        val result = "$firstname $lastname"
        result.toUpperCase()
    }

    println(lambdaName("Bagus Seno", "Prasetyo Diwiyro"))

    /* Jika 1 Parameter */
    val sayHello: (String) -> String = { "Hello $it"}
    println(sayHello("Bagus Seno"))

    /* Method Reference */
    val lambdaReference : (String) -> String = ::toUpper
    println(lambdaReference("Bagus Seno Prasetyo"))

}