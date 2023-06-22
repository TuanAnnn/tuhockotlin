// cac phep toan co ban
fun main(args: Array<String>) {
    var a = 10
    var b = 3
    println(a::class.java.typeName)
    println(b::class.java.typeName)

    // phep cong
    println("cach 1: a+b= "+ (a+b))
    println("cach 2: a+b= "+ a.plus(b))

    //phep tru
    println("cach 1: a-b= "+(a-b))
    println("cach 2: a-b="+a.minus(b))

    //phep nhan
    println("cach 1: axb= "+(a*b))
    println("cach 2: axb= "+a.times(b))

    //phep chia
    println("cach 1: a:b= "+(a/b))
    println("cach 2: a:b= "+a.div(b))
    var kq:Float = a.toFloat()/b
    println("a/b = " + kq)

    //phep chia lay du
    println("cach 1: a:b = "+ (a%b))
    println("cach 2: a:b = "+a.rem(b))

    var x:Float = 9.2f
    // tru mot ngoi
    var y=x.unaryMinus()
    println("x="+x)
    println("x="+y)

    //cong mot ngoi
    var z = y.unaryPlus()
    println("z= "+z)
}