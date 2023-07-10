fun main(args: Array<String>) {
    //1. khai bao , khoi tao
    var ds1 = listOf(1,2,3,4) // list read only
    var ds2 = mutableListOf(1,2,3,4,5,6)
    //println(ds1)
    //println(ds1.indices)
//    for(i in ds2.indices){
//        if (ds2[i]%2==0){
//            println("so chia het cho 2 la: ${ds2[i]}")
//        }
//    }

    // 2. su dung cac phuong thuc
    println(ds2.size)
    ds2.add(2)
    println(ds2)
    ds2.remove(2)
    println(ds2)

    var ds3 = mutableListOf(9,2,1,8,7,11,0)
    ds3.sort()
    println(ds3)
    println(ds3.contains(7))
    println(ds3.filter { y->y>7 })
}