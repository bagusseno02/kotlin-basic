/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 02/11/20
 * Project kotlin-basic
 */
infix fun String.to(type:String): String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main() {

    val result = "Bagus Seno Prasetyo Diwiryo" to "UP"
    println(result)

}