import java.text.SimpleDateFormat
import java.util.Calendar

//
fun main(args: Array<String>) {
    println("Enter Day of birth: ")
    var s = readLine();
    if(s==null) return;
    //ep kieu
    var dateinput = SimpleDateFormat("dd/MM/yyyy").parse(s);
    // khoi tao bien
    var timenamsinh = Calendar.getInstance()
    //println(timenamsinh)
    // set timenamsinh = thoi gian nhap vao
    timenamsinh.time = dateinput
    var namSinh = timenamsinh.get(Calendar.YEAR)
    var thangSinh = timenamsinh.get(Calendar.MONTH)
    var ngaySinh = timenamsinh.get(Calendar.DATE)
    println("ngay thang nam sinh: $ngaySinh/${thangSinh+1}/$namSinh")

    //khoi tao bien data time
    var timeHienTai = Calendar.getInstance()
    //lay nam hien tai
    var namHientai = timeHienTai.get(Calendar.YEAR)
    // tinh tuoi
    var tuoi = namHientai - namSinh
    println("Ban sinh nam ${namSinh} ,tuoi cua ban la ${tuoi}")
}