
// la vi ham nhap la ham readLine - ham nay chi nhan kieu String nen phai doi tu String sang kieu du lieu minh mong muon
fun main(args: Array<String>) {
    var a:Boolean = "true".toBoolean()
    println(a)
    println("kieu cua a: ${a::class.java.typeName}")


    var b:Byte = "2".toByte()
    println(b)
    println("kieu cua b: ${b::class.java.typeName}")

    var c:Float = "2.5f".toFloat()
    println(c)
    println("kieu cua c: ${c::class.java.typeName}")
}