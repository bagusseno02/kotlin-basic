/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */

fun main(){

    /* Variable Mutable (Bisa Di Ubah Dengan Tipe Data Yang Sama) */
    var name : String = "Bagus Seno Prasetyo"
    name = "Bagus Seno Prasetyo Diwiryo"
    println(name)

    /* Variable Immutable (Tidak Bisa Di UBah) */
    val firstname = "Bagus Seno Prasetyo Diwiryo"
    val age = 26
    println(firstname)
    println(age)

    /* Nullable (Tidak Direkomendasikan) */
    var lastname: String? = null
    lastname = "Prasetyo Diwiryo"
    println(lastname)
    println(lastname?.length)

    /* Variable Constant */
    println("$APP version $VERSION")

}
