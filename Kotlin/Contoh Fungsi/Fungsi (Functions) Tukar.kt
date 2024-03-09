fun tukar(a: Int, b: Int) {
        var temp: Int
        temp = a
        var a = b
        var b = temp
        println("a = " + a)
        println("b = " + b)
}

fun main(args: Array<String>) {
        var a = 1
        var b = 2
        tukar(a, b)
}
