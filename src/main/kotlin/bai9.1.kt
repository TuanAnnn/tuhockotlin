// nhap vao 2 so va kiem tra max
fun main(args: Array<String>) {
    print("please enter a: ")
    var sa:String? = readLine()
    print("please enter b: ")
    var sb:String? = readLine()
    var a:Int = 0
    var b:Int = 0

    if (sa!= null && sb!= null){
        a = sa.toInt()
        b= sb.toInt()
    }
    print(a)
//    if(a>b) {
//        println("a la so lon nhat")
//    } else {
//        println("b la so lon nhat")
//    }
}