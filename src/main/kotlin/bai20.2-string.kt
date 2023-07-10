import kotlin.text.StringBuilder

fun main(args: Array<String>) {
    var s19 = "    Hoc lap trinh tai f8"
    var s20 = s19.trim() // xoa khoang trang 2 dau chuoi

    //println(s20)

    //1.so sanh 2 chuoi
    var s21 = "abcdef123"
    var s22="abcdef123"
    //println(s21.compareTo(s22))

    var s23 = "Abcdef123"
//    println(s21.compareTo(s23))
//    println(s21.compareTo(s23,ignoreCase = true))

    // noi chuoi
    var s24 = "Hom nay"
    var s25 = "$s24 troi mua "
    //println(s25)
    var s26 = s25.plus("nen em nghi hoc")
    //println(s26)

    // 1. su dung StringBuilder
    // khai bao
    var s27 = StringBuilder("Hello my world")
    // insert
    s27.insert(5," lady")
    //println(s27)
    //append - truyen vao cuoi
    s27.append(", i coming")
    //println(s27)
    //xoa
    var s28 = StringBuilder("0123456789")
    s28.delete(0,4)
    //println(s28)
    // dao nguoc
    var s29 = StringBuilder("0123456789")
    s29.reverse()
    //println(s29)
    //tach chuoi
    var s30 = "hello.jpg.png"
    var arr:List<String> = s30.split(".")
    for(i in arr)
        println(i)
}