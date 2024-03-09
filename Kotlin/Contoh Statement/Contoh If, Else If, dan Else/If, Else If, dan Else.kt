import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Menu \n")
    println("Masukan Angka : 1 Contoh If")
    println("Masukan Angka : 2 Contoh Else If")
    println("Masukan Angka Selain 1 dan 2 Untuk Contoh Else\n")
    print("Silahkan Masukan Angka : ")
    var pil = input.nextInt()

    if (pil == 1){
        println("\nini Adalah Contoh If")
    }
    else if (pil == 2){
        println("\nini Adalah Contoh Else If")
    }
    else {
        println("\nini Adalah Contoh Else")
    }
}
