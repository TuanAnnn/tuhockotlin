class Thamchieuthis {
    var diemToan:Float = 0f
    var diemVan:Float = 0f

    fun TestCucbo(diemToan:Float,diemVan:Float){
        println("diem cuc bo: "+(diemToan + diemVan))
        println("diem cua bien instance var: "+(this.diemVan+this.diemToan))
        this.diemVan = diemVan
        this.diemToan = diemToan
    }
}