import java.util.Scanner

fun main(args: Array<String>) {
        var Input1 = Scanner(System.`in`)
        var Input2 = Scanner(System.`in`)

        println("Menu\n")
        println("1. Pertambahan ")
        println("2. Pengurangan ")
        println("3. Perkalian   ")
        println("4. Pembagian   \n")
        print("Masukkan Pilihan : ")
        var pilihan:Int = Input1.nextInt()

        if(pilihan == 1){
                println("\nSilahkan Masukkan Angka\n")
                print("Angka : ")
                var a:Int = Input2.nextInt()
                print("Angka : ")
                var b:Int = Input2.nextInt()
                pertambahan(a, b)
        }
        else if(pilihan == 2){
                println("\nSilahkan Masukkan Angka\n");
                print("Angka : ")
                var a:Int = Input2.nextInt()
                print("Angka : ")
                var b:Int = Input2.nextInt()
                pengurangan(a, b)
        }
        else if(pilihan == 3){
                println("\nSilahkan Masukkan Angka\n")
                print("Angka : ")
                var a:Int = Input2.nextInt()
                print("Angka : ")
                var b:Int = Input2.nextInt()
                perkalian(a, b)
        }
        else if(pilihan == 4){
                println("\nSilahkan Masukkan Angka\n")
                print("Angka : ")
                var a:Int = Input2.nextInt()
                print("Angka : ")
                var b:Int = Input2.nextInt()
                pembagian(a, b)
        }
        else{
                println("Masukkan pilihan (1..4)")
        }
}


fun pertambahan(a: Int, b:Int) {
        println("--------- +")
        println("Hasil : " + (a+b))
}

fun pengurangan(a: Int, b:Int) {
        println("--------- -")
        println("Hasil : " + (a-b))
}
fun perkalian(a: Int, b:Int) {
        println("--------- *")
        println("Hasil : " + (a*b))
}
fun pembagian(a: Int, b:Int) {
        println("--------- :")
        println("Hasil : " + (a/b))
}