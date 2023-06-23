fun main(args: Array<String>) {
    // nhap chuoi tu ban phim
//    println("Please enter a text: ")
//    var text:String? = readLine()
//    println("Current Text: ${text}")

    // test phep cong
    print("Please enter a: ")
    var a:String? = readLine()
    print("Please enter b: ")
    var b:String? = readLine()
    var c:Int = 0
    var d:Int = 0
    if(a!=null && b!=null){
        c = a.toInt()
        d = b.toInt()
    }
    println("a+b = ${c+d}")
}