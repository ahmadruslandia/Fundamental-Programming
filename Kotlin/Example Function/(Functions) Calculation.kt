import java.util.Scanner

fun main(args: Array<String>) {
        var Input1 = Scanner(System.`in`)
        var Input2 = Scanner(System.`in`)

        println("Menu\n")
        println("1. Addition ")
        println("2. Subtraction ")
        println("3. Multiplication   ")
        println("4. Division   \n")
        print("Enter : ")
        var varchc:Int = Input1.nextInt()

        if(varchc == 1){
                println("\nPlease Enter Number\n")
                print("Number : ")
                var a:Int = Input2.nextInt()
                print("Number : ")
                var b:Int = Input2.nextInt()
                addition(a, b)
        }
        else if(varchc == 2){
                println("\nPlease Enter Number\n");
                print("Number : ")
                var a:Int = Input2.nextInt()
                print("Number : ")
                var b:Int = Input2.nextInt()
                subtraction(a, b)
        }
        else if(varchc == 3){
                println("\nPlease Enter Number\n")
                print("Number : ")
                var a:Int = Input2.nextInt()
                print("Number : ")
                var b:Int = Input2.nextInt()
                multiplication(a, b)
        }
        else if(varchc == 4){
                println("\nPlease Enter Number\n")
                print("Number : ")
                var a:Int = Input2.nextInt()
                print("Number : ")
                var b:Int = Input2.nextInt()
                division(a, b)
        }
        else{
                println("Enter Your Choice (1..4)")
        }
}


fun addition(a: Int, b:Int) {
        println("--------- +")
        println("Result : " + (a+b))
}

fun subtraction(a: Int, b:Int) {
        println("--------- -")
        println("Result : " + (a-b))
}
fun multiplication(a: Int, b:Int) {
        println("--------- *")
        println("Result : " + (a*b))
}
fun division(a: Int, b:Int) {
        println("--------- :")
        println("Result : " + (a/b))
}