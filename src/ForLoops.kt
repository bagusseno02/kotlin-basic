/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    val names = arrayOf("Bagus", "Seno", "Prasetyo")
    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Total Perulangan Data = $total")

    /* Perulangan Range */
    for (value in 1..100) {
        println(value)
    }

    for (value2 in 1000 downTo 0 step 5) {
        println(value2)
    }

    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${names.get(i)}")
    }

}