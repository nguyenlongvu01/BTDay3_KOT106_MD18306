package com.vunlph30245.KOT_MD18306.BtOOP

open class SinhVienModels(var hoten: String, var tuoi: Int, var lop: String) {
    open fun getThongTin(): String {
        return "Ho ten: $hoten - Tuoi: $tuoi - Lop: $lop"
    }
}