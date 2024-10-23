package app

/*
KTC.11.a - MAPPING
- Transformasi mapping digunakan untuk mengubah data ke data lain.
- Mapping akan membutuhkan lambda function sebagai parameter, dan akan mengembalikan collection hasil result lambda nya
- Urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya.

** Transformations : Mapping Operations
Mapping Operations                                  | Keterangan
---------------------------------------------------------------------
map(transform: (T) -> R)                            | Mengubah collection menjadi collection baru sesuai lambda transform
mapIndexed(transform: (index, T) -> R)              | Mengubah collection menjadi collection baru, dengan tambahan parameter index
mapNotNull(transform : (T) -> R)                    | Sama seperti map(), namun menghiraukan hasil null
mapIndexedNotNull( transform : (index, T) -> R)     | Sama seperti mapIndexed(), namun menghiraukan nilai null
 */

fun main() {
    val list: List<String> = listOf("Muhammad", "Riko", "Ismail")

//    var temp = mutableListOf<String>()
//    for (value in list) {
//        temp.add(value)
//    }
//    val list2 = temp.toList()

//    val list2 = list.map { value -> value.uppercase() }
    val list2 = list.map { it.uppercase() }
    println(list2)

    val set1: Set<String> = setOf("Muhammad", "Riko", "Ismail")
    val set2 = set1.map { it.lowercase() }
    println(set2)

    val players = listOf("Silva", "Aguero", "Yaya", "Nasri", "Hart", "Kompany")
    val playersGanjil = players.mapIndexedNotNull{
        index, name ->
        if (index % 2 == 0) null
        else name
    }
    println(playersGanjil)

    val numbers = (1..100).toList()
    val numbersGanjil = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(numbersGanjil)
}