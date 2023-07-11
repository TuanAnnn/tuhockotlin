class NhanvienHanhchinh:Nhanvien {
    constructor(ten:String,cccd:String,que:String):super(ten, cccd, que)
    override fun Tinhluong(): Double {
        return luongCoBan
    }

}