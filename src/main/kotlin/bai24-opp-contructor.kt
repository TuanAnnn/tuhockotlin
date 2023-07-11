fun main(args: Array<String>) {
    // test class SInh vien
    //var sv1 = Sinhvien(1,"Minh Chau",19140312)
    //println(sv1)

    // test class San pham
    //var sp1 = Sanpham()
    //var sp2 = Sanpham(2,"Dua hau",300)

    // test class sv2
    var sv2 = LopSV2()
    var sv3 = LopSV2(3,"An")
    //println("lop sinh vien 2 la : ${sv3.ma} - ${sv3.ten}")
    sv3.DiemToan = 9f
    sv3.DiemVan = 8f
    //println(sv3.DiemVan)
    var dtbsv2 = sv3.DTB(sv3.DiemToan,sv3.DiemVan)
    //println(dtbsv2)
    //println(sv3)

    // test tuoi xem co du tuoi xem phim khong
    var kh1 = Tuoi(2012)
    var check = kh1.KiemTra()

    // tham chieu this
    println("--------")
    var tc1 = Thamchieuthis()
    tc1.diemVan = 9f
    tc1.diemToan = 8f
    tc1.TestCucbo(7f,8f)

    //overloading
    println("--------")
    var sp3 = Overloading(1,"dua leo",1000f)
    var sp4 = Overloading(2,"banh mi")

    var total = sp3.Chietkhau(true)
    println(total)

    // hoc parameter (khi k biet bao nhieu doi so truyen vao)
    println("-----")
    var dt1 = HocParameter()
    var kq = dt1.Tinhtong(1,5,6,7,7,8,8)
    var kq1 = dt1.Tinhtong(1,2,3)
    println(kq)
    println(kq1)

    // abtract
    var nvhc1 = NhanvienHanhchinh("An","1111","Hn");
    var nvdc1 = NhanVienDiCA("Chau","1211","KH")



    println(nvhc1.Tinhluong())
    println(nvdc1.Tinhluong())
}