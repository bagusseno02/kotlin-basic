/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun sayHello(firstname: () -> String, noinline lastname: () -> String): String {
    return "Hello ${firstname()} ${lastname()}"
}

fun main() {

    for(i in 0..10) {
        println(hello { "Bagus Seno" })
        println(sayHello({ "Bagus Seno" }, { "Prasetyo Diwiryo" }))
    }

}