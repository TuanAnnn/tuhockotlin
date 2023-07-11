open abstract class Nhanvien {
    //instance value

    protected var ten:String=""
    protected var cccd:String=""
    protected var que:String=""
    val luongCoBan:Double = 1200.0 //1200 USD


    // ham truu tuong
    public abstract fun Tinhluong():Double
    constructor(ten:String,cccd:String,que:String){
        this.ten = ten
        this.cccd = cccd
        this.que
    }
    constructor(ten:String,cccd:String){
        this.ten = ten
        this.cccd = cccd
        this.que
    }
}