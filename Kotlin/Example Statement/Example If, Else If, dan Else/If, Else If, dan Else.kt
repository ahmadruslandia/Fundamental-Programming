import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Menu \n")
    println("Enter Number : 1 for Example If")
    println("Enter Number : 2 for Example Else If")
    println("Enter Number other 1 and 2 for Example Else\n")
    print("Please Enter Number : ")
    var varchc = input.nextInt()

    if (varchc == 1){
        println("\nExample If")
    }
    else if (varchc == 2){
        println("\nExample Else If")
    }
    else {
        println("\nExample Else")
    }
}
