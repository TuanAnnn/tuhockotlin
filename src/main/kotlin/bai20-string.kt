fun main(args: Array<String>) {
    var s1:String = "Hello my fen!"
    var s2 = "Hello ?"

    // 1. Them ki tu dac biet
    var s3 = "Co nguoi noi rang: \"Hoc nua hoc mai\""
    //println(s3)

    var s4 = "D:\\ o dia D"
    //println(s4)
    var s5 = "Dong 1\n Dong 2"
    //println(s5)
    var s6 = "Hang 1 \t hang 2"
    //println(s6)

//    println(s4.length)
//    println(s4[0])

    // 2. Kiem tra vi tri xuat hien
    var s9 = "abcdeaf"
    //println(s9.indexOf("a"))

    //println(s9.lastIndexOf("a"))

    var s10 = "file.mp3"
    var s11 = "mp3"
    //println(s10.contains(s11))

    var s12 = "hoc lap trinh tai F8.education"
    var s13 = s12.substring(18,30)
    var s14 = s12.substring(0,13)
//    println(s13)
//    println(s14)

    var s15 = "Hoc hoc nua hoc mai"
    var s16 = s15.replace("hoc","Ngu")
    var s17 = s15.replace("hoc","Ngu",ignoreCase = true) // them ignoreCase de khong phan biet chu thuong chu in hoa
    println(s16)
    println(s17)

    var s18 = s15.replaceFirst("Hoc","Ngu",ignoreCase = true)// thay the phan tu dau tien
    println(s18)

    var s19 = s15.replaceAfter("Hoc","Ngu")
    println(s19)
}