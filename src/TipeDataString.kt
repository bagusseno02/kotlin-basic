/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    var firstname: String = "Bagus Seno"

    val lastname: String = "Prasetyo Diwiryo"

    val address: String = """
        Jln. Bojongwaru No.22 RT.004/014,
        Kec, Pameungpeuk,
        Kab. Bandung. Jawa Barat,
        Indonesia
    """.trimIndent()

    val address2: String = """
        Jln. Bojongwaru No.22 RT.004/014,
        |Kec, Pameungpeuk,
        |Kab. Bandung. Jawa Barat,
        |Indonesia
    """.trimIndent().trimMargin("|")

    /* Menggabungkan String */
    firstname = "Seno";
    val fullname: String = firstname + " " + lastname
    println(firstname)
    println(lastname)
    println(fullname)
    println(address)
    println(address2)

    /* String Template */
    val fullname2: String = "$firstname $lastname"
    val descName: String = "total $fullname2 char = ${fullname2.length}"
    println(descName)

}