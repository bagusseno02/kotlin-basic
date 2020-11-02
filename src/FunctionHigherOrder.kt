/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
fun main() {

    /* Lambda Expression Harus Paling Akhir */
    fun hello(value: String, transformer: (String) -> String): String = "Hello, ${transformer(value)}"

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Bagus Seno Prasetyo", lambdaUpper))
    println(hello("Bagus Seno", { value: String -> value.toLowerCase() }))

    /* Trailing Lambda */
    val result = hello("Bagus Seno") { value: String -> value.toUpperCase() }
    println(result)

}