// cac phep so sanh
fun main(args: Array<String>) {
    var A = 3
    var B = 3
    var C = 1

    //so sanh bang
    println("A=B: ${A==B}")
    println("A=B: ${A==C}")
    println("----")
    // so sanh hon
    println("A>B: ${A>B}")
    println("A>C: ${A>C}")
    println("----")
    //so sanh dung phuong thuc
    println("A=B: ${A.equals(B)}")
    println(A.compareTo(B)) // bang nhau thi tra ket qua la 0
    println(C.compareTo(A)) //C>A thi tra ket qua -1
    println(A.compareTo(C))  // A>C thi tra ket qua la 1
}