import java.util.Scanner

fun main(args: Array<String>) {

    val terminalInput = Scanner(System.`in`)
    print("Masukkan Data berupa angka : ")

    var i:Int = terminalInput.nextInt()

    println("Output dari Data yang diinputkan :  $i")
}