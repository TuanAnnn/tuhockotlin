fun main(args: Array<String>) {
    var thunhap:Int = 0
    var s:String?= readLine()
    if (s!= null){
        thunhap = s.toInt()
    }
    when (thunhap){
        in 1.. 3 -> println("very poor")
        in 4.. 7 -> println("poor")
        in 8.. 19 -> println("normal")
        in 20..50 -> println("rich")
        in 51.. 100 -> println("very rich")
        else -> println("???")
    }
}