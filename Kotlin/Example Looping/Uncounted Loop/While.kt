import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var ulang = true
    var i = 0
    
    while (ulang) {
        println(" ")
        println("Masukkan huruf y untuk contoh perulangan")
        println(" ")
        print("Masukkan huruf : ")
        var jawab = input.next()

        if( jawab.equals("y") ){
            ulang = true
        }
        else{
            ulang = false
        }
        i++
    }
    println(" ")
    println("Selesai")

}
