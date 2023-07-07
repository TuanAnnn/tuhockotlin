// viet ten Tuan An
fun main(args: Array<String>) {
    var h:Int = 7

//    //T
//    for(i in 1..h){
//        for (j in 1 ..h) {
//            if (i == 1 || j == 4)
//                print("*")
//                print("\t")
//        }
//        println()
//    }

//    // U
//    for(i in 1..h){
//        for (j in 1 ..h) {
//            if (j == 1 || i == 7 || j ==7)
//                print("*")
//                print("\t")
//        }
//        println()
//    }

    // A
    for(i in 1..h){
        for (j in 1 ..h) {
            if (j == 1 || i == 7 || j ==7)
                print("*")
            print("\t")
        }
        println()
    }

}