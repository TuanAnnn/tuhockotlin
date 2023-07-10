fun main(args: Array<String>) {
    // khai bao mang
    var M = arrayOf(1,2,3,4)
//    for (k in M){
//        println(k)
//    }
    //println("size of array: "+M.size)

    //gan mang
    M[0] = 50
//    println(M[0])
//    for (k in M){
//        println(k)
//    }

    // tao mot mang clone
//    var M1 = M.clone()
//    for (k in M1){
//        println(k)
//    }

    // dao nguoc mang
//    var M2 = arrayOf(1,2,3,4)
//    M2.reverse()
//    for (k in M2){
//        print("$k\t")
//    }

    // sap xep mang
    var M3 = arrayOf(9,4,8,1,12,13,2)
//    M3.sort()
//    for(k in M3){
//        print("$k\t")
//    }

    // tim mang theo dieu kien loc
    var ds1 = M3.filter { y->y%2 ==0 }
    println(ds1)

    // tim max min
    M3.sort()
    println("so nho nhat ${M3[0]}")
    println("so nho nhat ${M3.first()}")
    println("so lon nhat ${M3[M3.size-1]}")
    println("so lon nhat ${M3.last()}")
}