package com.vunlph30245.KOT_MD18306.BtOOP


fun main() {
    val theMuonList = mutableListOf<TheMuon>()

    var tiepTuc = true

    while (tiepTuc) {
        println("------------------------")
        println("Menu quan ly TheMuon")
        println("1. Them the muon")
        println("2. Hien thi danh sach the muon")
        println("3. Xoa the muon theo ma phieu muon")
        println("4. Thoat chuong trinh")

        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()

            when (options) {
                1 -> {
                    println("Nhap thong tin the muon:")
                    print("Ma phieu muon: ")
                    val maPhieuMuon = readLine()!!
                    print("Ngay muon: ")
                    val ngayMuon = readLine()!!.toInt()
                    print("Han tra: ")
                    val hanTra = readLine()!!.toInt()
                    print("So hieu sach: ")
                    val soHieuSach = readLine()!!
                    print("Ho ten: ")
                    val hoten = readLine()!!
                    print("Tuoi: ")
                    val tuoi = readLine()!!.toInt()
                    print("Lop: ")
                    val lop = readLine()!!
                    theMuonList.add(TheMuon(maPhieuMuon, ngayMuon, hanTra, soHieuSach, hoten, tuoi, lop))
                    println("Them the muon thanh cong!")
                }

                2 -> {
                    println("Danh sach the muon")
                    println("--------------------------")
                    theMuonList.forEach { theMuon ->
                        println(theMuon.getThongTin())
                    }
                }

                3 -> {
                    println("Xoa the muon theo ma phieu muon")
                    println("--------------------------")
                    print("Nhap ma phieu muon can xoa: ")
                    val maPhieuMuon = readLine()!!
                    val iterator = theMuonList.iterator()
                    var found = false
                    while (iterator.hasNext()) {
                        if (iterator.next().maPhieuMuon == maPhieuMuon) {
                            iterator.remove()
                            found = true
                            println("Xoa the muon thanh cong!")
                        }
                    }
                    if (!found) {
                        println("Khong tim thay the muon voi ma phieu muon: $maPhieuMuon")
                    }
                }

                4 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }

            if (tiepTuc) {
                print("Ban co muon chon tiep lua chon tren menu? (c/k) ")
                val s = readLine()
                tiepTuc = s == "c"
            }

        } catch (e: Exception) {
            when (e) {
                is NumberFormatException -> println("Loi: Vui long nhap mot so hop le.")
                is NullPointerException -> println("Loi: Gia tri khong duoc de trong.")
                else -> println("Loi khong xac dinh: ${e.message}")
            }
        }
    }
}
