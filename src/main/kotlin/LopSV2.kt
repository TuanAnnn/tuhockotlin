class LopSV2 {
    var ma:Int = 0
    var ten:String = ""
    private var diemToan:Float = 0f
    private var diemVan:Float = 0f

    // dung phuong thuc de can thiep vao bien diemToan
    var DiemToan:Float
        get() {return diemToan}
        set(value) {diemToan=value}
    var DiemVan:Float
        get() {return diemVan}
        set(value) {diemVan=value}

    constructor(){
        ma = 0
        ten="No name"
    }
    constructor(m:Int,t:String){
        ma=m
        ten=t
    }
    fun DTB(diemToan:Float,diemVan:Float):Float{
        return (diemVan+diemToan)/2
    }
    fun XuatThongTin(){
        println("ma:$ma")
        println("ten: $ten")
    }
    // to string
    override fun toString(): String {
        return "Ma sinh vien:$ma, ten sinh vien:$ten"
    }
}