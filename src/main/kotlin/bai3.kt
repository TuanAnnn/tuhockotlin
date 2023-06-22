
// Bien va cac kieu du lieu trong kotlin
fun main(args: Array<String>){
    // khoi tao bien
    var soA:Int = 65
    var soB:Double = 6.5

    println("gia tri cua so A la: " + soA)
    println("gia tri cua so A la: " + soB)

    //dat ten bien
    var soC:Int
    var soD:Byte
    var isDelete:Boolean

    //khai bao so thuc
    var y:Double=8.5
    var z = 10.45
    var h = 10
    var e:Float = 7.5F

    println("kieu cua y la : " + (y::class.java.typeName))
    println("kieu cua z la : " + (z::class.java.typeName))
    println("kieu cua h la : " + (h::class.java.typeName))
    println("kieu cua e la : " + (e::class.java.typeName))

    //khai bao ky tu
    var kytu = 'c'
    println("kytu: "+kytu)

    //kieu String
    var str1:String = "hom nay troi dep"
    var str2:String = "hom nay khong dep"
    var str3 = "hello you"
    println("kieu cua str3 la : " + (str3::class.java.typeName))

    //khai bao mang
    var mangSoThuc:FloatArray = floatArrayOf(0.5f,1.5F)
    var mangkitu:CharArray = charArrayOf('a','b')

    // khai bao hang so
    val nhietDoiSo:Int = 100
    val nhietDoDong:Int = 0
    val nhietDoNongChay:Int = 1000
}