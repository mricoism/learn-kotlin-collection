package app

/*
KTC.12.b - UNZIP OPERATION

** Transformations : Unzip Operations
Mapping Operations  | Keterangan
---------------------------------------------------------------
unzip()             | Mengubah collection Pair<T1, T2> menjadi dua collection, collection T1 dan collection T2
 */

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Honda" to "Civic",
        "Toyota" to "Supra",
        "Mazda" to "RX 7",
        "Nissan" to "Skyline",
        "Mitsubishi" to "Evo 9"
    )
    println(list)

    val pair:Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    val (brand, name) = list.unzip()

}