import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var vartry = true
    var i = 0
    
    do {
        println(" ")
        println("Enter y for Example")
        println(" ")
        print("Enter :  ")
        var varchc = input.next()

        if( varchc.equals("y") ){
            vartry = true
        }
        else{
            vartry = false
        }
        i++
    }while (vartry)
    println(" ")
    println("Done")

}
