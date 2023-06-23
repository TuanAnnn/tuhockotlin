/*
tim x,y biet tong va hieu cua chung
* */
fun main(args: Array<String>) {
    print("Enter sum 2 number: ")
    var sum:String? = readLine()
    print("Enter sub 2 number: ")
    var sub:String?= readLine()

    var s:Int = 0
    var sb:Int = 0
    var x:Int = 0

    if (sum!=null && sub!=null) {
        s = sum.toInt()
        sb = sub.toInt()
    }
    x = (s+sb)/2
    println("x: ${x}")
    println("y: ${s-x}")
}