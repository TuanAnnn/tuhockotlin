import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    println(cal)

    //get date
    var nam = cal.get(Calendar.YEAR)
    var ngay = cal.get(Calendar.DATE)
    var thang = cal.get(Calendar.MONTH)
    //println("ngay ${ngay}/${thang+1}/${nam}")


    // dat ngay thang nam/
      cal.set(Calendar.YEAR,1990)
     cal.set(Calendar.DATE,19)
     cal.set(Calendar.MONTH,11)

    var nam2 = cal.get(Calendar.YEAR)
    var thang2 = cal.get(Calendar.MONTH)
    var ngay2 = cal.get(Calendar.DATE)
    //println("ngay $ngay2/$thang2/$nam2")

    // xuat ngay thang nam
    var date = cal.time
    var dateFormat = SimpleDateFormat("dd/MM/yyyy").format(date)
    //println(dateFormat)

    // xuat dinh dang loai 2
    var dateFormat2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").format(date)
    println(dateFormat2)
}