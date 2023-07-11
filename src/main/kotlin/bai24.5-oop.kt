fun main(args: Array<String>) {
    var nv1:Nhansu = PhoPhong()
    //println(nv1.TinhTong(100))
    nv1 = TruongPhong()
    println(nv1.TinhTong(100))

    println("------")
    //var t1 = TinhTong()
    //println(t1.Tinh(7,5))
    var t1 = TinhHieu()
    t1.Tinh(7,5)
//    t1 = TinhTong()
}