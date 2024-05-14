package com.vunlph30245.KOT_MD18306.BtOOP

class CBGV (hoten: String, tuoi: Int?, quequan: String?, var msgv: String, var luongcung : Float, var lThuong: Float?, var lPhat : Float?) : NguoiModel(hoten, tuoi, quequan) {

    var lThucLinh : Float = 0f
        get() = luongcung + (lThuong?:0f) - (lPhat?:0f)

    override fun getThongTin(): String {
        return "CGBV: ${super.getThongTin()} - msgv: $msgv - Luong thuc linh: $lThucLinh"
    }
}