import kotlin.math.PI
import kotlin.math.pow

//BT van dung
fun main(args: Array<String>) {
    var r:Double = 0.0
    //a.tinh chu vi hinh tron
    print("Please to enter r= ")
    var bankinh:String? = readLine()
    if(bankinh!=null){
        r = bankinh.toDouble()
    }
//    println(r)
    println("perimeter: 2 x pi x r = ${2* PI*r}")
    println("acreage: pi x r x r = ${PI*r.pow(2)}")
}