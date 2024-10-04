import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Login \n")
    print("username : ")
    var data1 = input.nextLine()
    print("password : ")
    var data2 = input.nextLine()

    if (data1.equals("user1")){
        if (data2.equals("psw123")){
            println("\nanda berhasil mencoba")
        }
        else{
            println("\npassword salah")
        }
    }
    else {
        println("\niusername anda salah")
    }
}
