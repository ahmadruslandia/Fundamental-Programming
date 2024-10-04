import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Menu \n")
    println("Masukan Angka : 1 Contoh Statement When 1")
    println("Masukan Angka : 2 Contoh Statement When 2")
    println("Masukan Angka : 3 Contoh Statement When 3")
    println("Masukan Angka : 4 Contoh Statement When 4")
    println("Masukan Angka Selain 1, 2, 3 dan 4 Untuk Contoh Invalid Statement\n")
    print("Silahkan Masukan Angka : ")
    var number = input.nextInt()


    val result = when (number) {
        1 -> "\nini Adalah Contoh Statement 1"
        2 -> "\nini Adalah Contoh Statement 2"
        3 -> "\nini Adalah Contoh Statement 3"
        4 -> "\nini Adalah Contoh Statement 4"
        else -> "\nini Adalah Contoh Invalid Statement"
    }

    println(result)
}
