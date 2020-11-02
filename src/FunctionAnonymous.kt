/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
fun main() {

    fun hello(value: String, transformer: (String) -> String): String = "Hello, ${transformer(value)}"

    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.toUpperCase()
    }

    val result = hello("Bagus Seno Prasetyo", anonymousUpper)
    println(result)

    println(hello("Seno", fun(value: String): String {
        return value.toUpperCase()
    }))

}