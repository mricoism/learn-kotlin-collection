package app

/*
KTC.04 - PAIR
- Sebelum kita bahas collection Map, ada baiknya kita mengenal Pair
- Pair adalah representasi dari data yang berpasangan
- Di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat
 */
fun main() {
    val pair1: Pair<String, String> = Pair("Riko", "Islam")
    println(pair1)
    println(pair1.first)
    println(pair1.second)
    println()

    val pair2: Pair<String, Int> = "Riko" to 6
    println(pair2)
    println(pair2.first)
    println(pair2.second)
}