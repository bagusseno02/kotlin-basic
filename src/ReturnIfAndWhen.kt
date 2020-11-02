/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
fun main() {

    /* Return If  */
    fun sayHelloIf(name: String = ""): String {

        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }

    }

    /* Return When */
    fun sayHelloWhen(name: String =""): String{
        return when(name){
            ""-> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(sayHelloIf())
    println(sayHelloIf("Bagus Seno"))

    println(sayHelloWhen())
    println(sayHelloWhen("Bagus Seno"))

}