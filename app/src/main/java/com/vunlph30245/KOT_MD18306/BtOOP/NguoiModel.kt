package com.vunlph30245.KOT_MD18306.BtOOP

open class NguoiModel(var hoten: String, var tuoi: Int?, var quequan: String?) {

    open fun getThongTin () : String {
        return "$hoten - Tuoi: $tuoi - Que: $quequan"
    }
}