/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    val members: Array<String> = arrayOf("Bagus", "Seno", "Prasetyo", "Diwiryo")
    val values: Array<Byte> = arrayOf(100, 90, 80)
    val amounts: Array<Int> = arrayOf(10_000, 2_000, 150_000)

    println("Banyaknya data " + members.size)
    println(members.set(0, "Roni"))
    println(members[0])
    println(members.get(1))
    println(amounts)

    /* Array Nullable */
    val names: Array<String?>

}