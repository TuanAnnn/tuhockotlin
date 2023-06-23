
/*
nhap vao diem TB, in ra xep loai hoc sinh
- gioi: neu diem tb >= 8
- kha: neu diem tb <8 va >=6.5
- trung binh: neu diem tb <6.5 va =>5
- yeu: neu diem trung binh <5
* */
fun main(args: Array<String>) {
    print("Please enter math: ")
    var diemtoan:String?= readLine()
    print("Please enter chemistry: ")
    var diemhoa:String?= readLine()
    print("Please enter lititure: ")
    var diemvan:String?= readLine()

    var dt:Int = 0
    var dh:Int = 0
    var dv:Int = 0
    var diemtb = 0.0f

    if (diemtoan!=null&& diemhoa!=null&& diemvan!=null) {
        dt = diemtoan.toInt()
        dh = diemhoa.toInt()
        dv = diemvan.toInt()
    }
    diemtb = (dt+dh+dv)/3f
    println("diem trung binh cua ban la: ${diemtb}")
    if(diemtb >= 8) {
        println("Ban duoc hoc sinh gioi!")
    } else if (diemtb >= 6.5) {
        println("Ban duoc hoc sinh kha!")
    } else if (diemtb >= 5) {
        println("ban duoc hoc sinh trung binh!")
    }else (
        println("Ban duoc hoc sinh yeu")
    )
}