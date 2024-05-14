package com.vunlph30245.KOT_MD18306.BtOOP


    fun main () {
        val gvList = mutableListOf<CBGV>()
        gvList.add(CBGV("Nguyen Long Vu", 30, "HN", "003468", 500f, 50f, 10f))


        //println(gv1.getThongTin())

        println("------------------------")
        println("Menu quan ly GV")
        println("1. Them giao vien")
        println("2. Hien thi danh sach GV")
        println("3. Xoa GV")
        println("4. Cap nhat thong tin GV")
        println("5. Thoat chuong trinh")

        var tiepTuc: Boolean
        do {
            try {
                print("Nhap lua chon cua ban: ")
                val options: Int = readLine()!!.toInt()
                when (options) {
                    1 -> {
                        println("Nhap thong tin giao vien:")
                        print("Ten: ")
                        val name = readLine()!!
                        print("Tuoi: ")
                        val age = readLine()!!.toInt()
                        print("Dia chi: ")
                        val address = readLine()!!
                        print("MSGV: ")
                        val msgv = readLine()!!
                        print("Luong co ban: ")
                        val salary = readLine()!!.toFloat()
                        print("Thuong: ")
                        val bonus = readLine()!!.toFloat()
                        print("Phat: ")
                        val fine = readLine()!!.toFloat()
                        gvList.add(CBGV(name, age, address, msgv, salary, bonus, fine))
                        println("Them giao vien thanh cong!")

                    }


                    2 -> {
                        println("Danh sach giao vien")
                        println("--------------------------")

                        gvList.forEach { gv ->
                            println(gv.getThongTin())
                        }
                    }

                    3 -> {
                        println("Xoa giao vien")
                        println("--------------------------")
                        println("Nhap msgv can xoa: ")
                        val msgv = readLine()!!
                        val iterator = gvList.iterator()
                        var found = false
                        while (iterator.hasNext()) {
                            if (iterator.next().msgv == msgv) {
                                iterator.remove()
                                found = true
                                println("Xoa giao vien thanh cong!")
                            }
                        }
                        if (!found) {
                            println("Khong tim thay giao vien voi MSGV: $msgv")
                        }
                    }

                    4 -> {
                        println("Cap nhat thong tin gv")
                        println("Nhap msgv can cap nhat: ")
                        val msgv = readLine()!!
                        val gv = gvList.find { it.msgv == msgv }
                        if (gv != null) {
                            print("Nhap ten moi (hien tai: ${gv.hoten}): ")
                            val name = readLine()!!
                            print("Nhap tuoi moi (hien tai: ${gv.tuoi}): ")
                            val age = readLine()!!.toInt()
                            print("Nhap dia chi moi (hien tai: ${gv.quequan}): ")
                            val address = readLine()!!
                            print("Nhap luong co ban moi (hien tai: ${gv.luongcung}): ")
                            val salary = readLine()!!.toFloat()
                            print("Nhap thuong moi (hien tai: ${gv.lThuong}): ")
                            val bonus = readLine()!!.toFloat()
                            print("Nhap phat moi (hien tai: ${gv.lPhat}): ")
                            val fine = readLine()!!.toFloat()
                            gvList[gvList.indexOf(gv)] = CBGV(name, age, address, msgv, salary, bonus, fine)
                            println("Cap nhat thong tin giao vien thanh cong!")
                        } else {
                            println("Khong tim thay giao vien voi MSGV: $msgv")
                        }
                    }

                    5 -> {
                        println("Ket thuc chuong trinh")
                        tiepTuc = false

                    }

                    else -> {
                        println("Nhap sai, vui long nhap lai")
                    }
                }
                println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
                val s = readLine()
                tiepTuc = s == "c"
            } catch (e: Exception) {
                println("Nhap sai, vui long nhap lai")
                tiepTuc = true
            }

        } while (tiepTuc)
    }
