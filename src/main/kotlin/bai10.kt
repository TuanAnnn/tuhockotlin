fun main(args: Array<String>) {
    println("please to enter a month: ")
    var s:String?= readLine()
    var month:Int = 0
    if (s!=null){
        month = s.toInt()
    }
//    println(month)
    when(month)
    {
        1,2,3 -> println("thang $month trong quy 1")
        4,5,6 -> println("thang $month trong quy 2")
        7,8,9 -> println("thang $month trong quy 3")
        10,11,12 -> println("thang $month trong quy 4")
        else -> println("k co thang nay")
    }
}