package app

/*
KTC.12.a - ZIPPING
Zipping adalah transformasi yang digunakan untuk menggabungkan dua buah collection.

** Transformations : Zipping Operations
Mapping Operations                          | Keterangan
---------------------------------------------------------------
zip(collection)                             | Menggabungkan dua collection, sehingga menghasilkan Pair<T1, T2>
zip(collection, transform: (T1, T2) -> R)   | Menggabungkan dua collection dengan lambda transform sehingga menghasilkan collection baru dari result lambda transform
 */
fun main() {
    val list1 = listOf("Oscar", "Russel", "Leclerc", "Lawson")
    val list2 = listOf("MCLaren", "Mercedes", "Ferrari", "RB")
    val list3 = listOf("MCLaren", "Mercedes", "Ferrari")

    val list4 = list1.zip(list2)
    val list5 = list1.zip(list3)
    println(list4)
    println(list5)

    val list6: List<String> = list1.zip(list2) {
        value1, value2 ->
        "$value1 is racing for $value2"
    }
    println(list6)
}