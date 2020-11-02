/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L

    /* Floating Point */
    var value: Float = 98.98F
    var radius: Double = 100000.00

    /* Literals */
    var decimalLoteral: Int = 100
    var hexadecimal: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    /* underscore in number */
    var age2: Byte = 3_0
    val amount2: Long = 10_000_000L
    println(amount2)

    /* Convertion */
//    var byte: Byte = number.toByte()
    val price: Int = amount2.toInt()
    println("Sample Convertion Number " + price)

}