package app

/*
KTC.06.a - COLLECTION
- Semua data collection adalah turunan dari interface Collection
- Collection digunakan sebagai general operation terhadap struktur data collection, seperti membaca dan menulis data di collection
 */

fun <T>displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
    println()
}


fun main() {
    displayCollection(listOf("Riko", "Adi", "Irham"))
    displayCollection(mutableListOf("Riko", "Adi", "Irham"))
    displayCollection(setOf("Riko", "Adi", "Irham"))
    displayCollection(mutableSetOf("Riko", "Adi", "Irham"))
    displayCollection(mapOf("Riko" to "Kudus", "Adi" to "Wonosari", "Irham" to "Klaten").entries)
//    displayCollection(mapOf("Riko" to "Kudus", "Adi" to "Wonosari", "Irham" to "Klaten")) // ERROR, Map Bukan turunan dari collection
}