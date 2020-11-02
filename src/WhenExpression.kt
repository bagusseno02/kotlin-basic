/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 30/10/20
 * Project kotlin-basic
 */
fun main() {

    val finalExam = 'C'
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        else -> println("Try Again Next Years")
    }

    /* Multiple Option */
    when (finalExam) {
        'A', 'B', 'C' -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf Anda Tidak Lulus")
        }
    }

    /* When Expression In */
    val passValues = arrayOf('A', 'B')
    when (finalExam) {
        in passValues -> println("Selamat Anda Lulus")
        !in passValues -> println("Coba Tahun Depan")
    }

    /* When Expression Is */
    val name = "Bagus Seno Prasetyo"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    /* When Expression If Else */
    val nilaiUjian = 90
    when {
        nilaiUjian > 90 -> {
            println("Amazing")
        }
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 70 -> println("Good")
        else -> println("Ngulang Tahun Depan")
    }

}