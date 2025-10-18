import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var vartry = true
    var i = 0
    
    while (vartry) {
        println(" ")
        println("Enter y for Example")
        println(" ")
        print("Enter : ")
        var varchc = input.next()

        if( varchc.equals("y") ){
            vartry = true
        }
        else{
            vartry = false
        }
        i++
    }
    println(" ")
    println("Done")

}
