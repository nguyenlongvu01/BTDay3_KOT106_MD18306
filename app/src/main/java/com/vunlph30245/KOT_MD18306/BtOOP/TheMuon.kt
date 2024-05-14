package com.vunlph30245.KOT_MD18306.BtOOP

class TheMuon(
    var maPhieuMuon: String,
    var ngayMuon: Int,
    var hanTra: Int,
    var soHieuSach: String,
    hoten: String,
    tuoi: Int,
    lop: String
) : SinhVienModels(hoten, tuoi, lop) {

    override fun getThongTin(): String {
        return "TheMuon: Ma phieu muon: $maPhieuMuon - Ngay muon: $ngayMuon - Han tra: $hanTra - So hieu sach: $soHieuSach - ${super.getThongTin()}"
    }
}