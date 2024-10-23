package app

/*
KTC.09 - CONVERSION
- Di kotlin kita bisa melakukan konversi collection ke jenis collection lain secara mudah
- Misal kita ingin mengubah dari array ke list, atau dari range ke set, atau dari set ke list, bisa dilakukan dengan mudah
- Semua function dimulai dengan kata “to”, misal toList, toSet, toMutableList, dan lain-lain
 */
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    val range = 1..100
    val driverNumber = arrayOf(44, 63, 55, 16, 81)

    val list = array.toList()
    val set = array.toSet()

    val mutableList = range.toMutableSet()
    val mutableSet = range.toMutableSet()

    val listTomutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = driverNumber.toSortedSet()


    println(list)
    println(set)
    println(mutableList)
    println(mutableSet)
    println(sortedSet)
}