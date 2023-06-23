// ep kieu du lieu

fun main(args: Array<String>) {
    var A:Int = 35
    var B:Long = A.toLong()
    //test kieu
    println(B::class.java.typeName)
    println("gia tri cua B: "+B)

    // doi kieu float sang int
    var C:Float = 9.5f
    var D = C.toInt()
    println(D::class.java.typeName)
    println("D= $D")
    println("E= ${D+C}")
}