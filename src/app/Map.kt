package app


/*
KTC.05.a - IMMUTABLE MAP
- Map (atau dictionary), adalah collection yang berbentuk key-value, dimana key berperan sebagai index.
- Key harus unik, jika kita menggunakan Key yang sama, maka data sebelumnya akan di replace oleh data yang baru
- Tipe data key bisa menggunakan tipe data apapun sesuai yang kita inginkan
 */
fun main() {
    val drivers: Map<String, String> = mapOf("Lewis" to "Britain", Pair("Oscar", "Australia"),"Leclerc" to "Monaco", "Sainz" to "Spain")

    println(drivers.size)
    println(drivers)
    println(drivers["Lewis"])

    for ((key, value) in drivers) {
        println("$key is born in $value")
    }
}