// nhap 1 so diem va cho biet la minh da do hay chua
fun main(args: Array<String>) {
    print("please enter a: ")
    var a:String?= readLine()
//    print(a)
    var b = 0
    if(a != null){
        b = a.toInt()
    }
    if (b >= 5) {
        println("ban da dau!")
    }else {
        println("ban da rot!")
    }
}