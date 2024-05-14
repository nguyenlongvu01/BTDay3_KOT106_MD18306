package com.vunlph30245.KOT_MD18306

fun main() {

    val soA = 5
    var soB = 10

    with(soB) {
       soB = this.inc()

        println("So B : $soB")
    }


    val luyThuaBac3CuaA = soA.let {
        val kq = it * it * it
        kq
    }
    //let
//    val title: String? = "Day3 - Android Kotlin"
//    val length = title.let {
//        if (it == null){
//            0
//        }else{
//            it.length
//        }
//    }

    //run
    val title: String? = "Day3 - Android Kotlin"
    val length = title?.run {
        if (isEmpty()){
            0
        }else{
            length
        }
    }


    println("do dai chuoi $title = $length")

    println("Tong hai so $soA va $soB = ${tinhTong(soA, soB)}")
    println("Tich hai so $soA va $soB = ${phepNhan(soA, soB)}")
    println("Thuong hai so $soA va $soB = ${phepChia(soA.toFloat(), soB.toFloat())()}")
    println("Luy thua cua $soA = ${luyThua(soA)}")
}

val tinhTong = {soA: Int, soB: Int -> (soA + soB)}

val phepNhan : (Int, Int) -> Int =
    {soA: Int, soB: Int -> soA * soB}
val phepChia = {soA: Float, soB: Float -> {
    if (soB !== 0f) {
        "so bi chia phai khac 0"
        }else{
            val kq = soA / soB
            kq
        }
    }
}

val luyThua : (Int) -> Int  = {it * it}