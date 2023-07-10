class Overloading {
    private var maSP:Int = 0
    private var tenSP:String = ""
    private var giaSP:Float = 0f

    constructor(maSP:Int,tenSP:String,giaSP:Float){
        this.maSP = maSP
        this.tenSP = tenSP
        this.giaSP = giaSP
    }
    constructor(maSP:Int,tenSP:String){
        this.maSP = maSP
        this.tenSP = tenSP
    }
    constructor(maSP:Int){
        this.maSP = maSP
    }
    fun Chietkhau():Double{
        return this.giaSP*0.95
    }
    fun Chietkhau(Sinhnhat:Boolean): Double {
        if(Sinhnhat)
            return this.giaSP*0.9
        else
            return this.giaSP*0.95
    }
}