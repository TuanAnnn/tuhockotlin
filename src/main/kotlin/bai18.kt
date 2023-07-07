import kotlin.random.Random

fun main(args: Array<String>) {
    // khoi tao bien random
    var rd = Random
    // random so nguyen
    var rdNguyen = rd.nextInt(3)
    //println(rdNguyen)

    // random trong doan [a,b]
    var rdNguyen2 = rd.nextInt(-2,2)
    //println(rdNguyen2)

    //random so thuc
    var rd3 = rd.nextDouble(0.0,50.0)
    println(rd3)
}