package app

/*
KTC.06.b - MUTABLE COLLECTION
 */
fun <T>displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
    println()
}

fun main() {
//    displayMutableCollection(listOf("Riko", "Adi", "Irham")) // ERROR, Bukan turunan Mutable Collection
    displayMutableCollection(mutableListOf("Riko", "Adi", "Irham"))
//    displayMutableCollection(setOf("Riko", "Adi", "Irham"))
    displayMutableCollection(mutableSetOf("Riko", "Adi", "Irham")) // ERROR, Bukan turunan Mutable Collection
//    displayMutableCollection(mapOf("Riko" to "Kudus", "Adi" to "Wonosari", "Irham" to "Klaten").entries) // ERROR, Bukan turunan Mutable Collection
    displayMutableCollection(mutableMapOf("Riko" to "Kudus", "Adi" to "Wonosari", "Irham" to "Klaten").entries)
//    displayCollection(mapOf("Riko" to "Kudus", "Adi" to "Wonosari", "Irham" to "Klaten")) // ERROR, Map Bukan turunan dari collection
}