class Tuoi {
    private var namsinh:Int = 0
    constructor(y:Int){
        namsinh=y
    }
    var Namsinh:Int
        get() {return namsinh}
        set(value) {namsinh=value}

    // ham support
    private fun checkTuoi(): Boolean {
        var tuoi=2023-Namsinh
        return tuoi>=18
    }
    fun KiemTra(){
        if(checkTuoi()){
            println("ban du duoi")
        }else{
            println("Ban k du tuoi")
        }
    }
}