fun main(args: Array<String>) {
    println("nhap vao thang: ")
    var s:String?= readLine()

    var month:Int = 0
    if (s!= null) {
        month = s.toInt()
    }
    if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 ||month == 12 ) {
        println("thang nay co 31 ngay")
    } else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
        println("thang nay co 30 ngay")
    } else {
        println("vui long nhap nam: ")
        var ss:String?= readLine()
        var year:Int = 0

        if (ss != null) {
            year = ss.toInt()
        }
        if (year%4 == 0) {
            println("nam nay co 29 ngay")
        } else {
            println("nam nay co 28 ngay")
        }
    }
}