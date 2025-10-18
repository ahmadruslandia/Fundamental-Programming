import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Menu \n")
    println("Enter 1 : to Statement When First Example  ")
    println("Enter 2 : to Statement When Second Example ")
    println("Enter 3 : to Statement When Third Example  ")
    println("Enter 4 : to Statement When Fourth Example ")
    println("Enter Number other 1, 2, 3 and 4 for Example Invalid Statement\n")
    print("Enter your Choice : ")
    var number = input.nextInt()


    val result = when (number) {
        1 -> "\nExample 1st Statement Succeed"
        2 -> "\nExample 2nd Statement Succeed"
        3 -> "\nExample 3rd Statement Succeed"
        4 -> "\nExample 4th Statement Succeed"
        else -> "\nExample Invalid Statement"
    }

    println(result)
}
