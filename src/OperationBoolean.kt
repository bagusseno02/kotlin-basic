/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    val finalExam = 80
    val attendant = 75

    val passFinalExam = finalExam >= 80
    val passAttendant = attendant >= 75

    val pass = passFinalExam && passAttendant

    println(pass)

}