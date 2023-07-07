import java.lang.Exception

fun main(args: Array<String>) {
    var a:Int = 5
    var b:Int = 0
    try {
        var c=a/b
        println(c)
    }
    catch(e:Exception){
        e.message
    }
    println("Doan code phia sau")
}