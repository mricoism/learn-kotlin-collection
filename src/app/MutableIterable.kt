package app


/*
KTC.07.b - MUTABLE ITERABLE
 */
fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
//    for (value in iterable) {}
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
    println()
}

fun main() {
//    displayMutableIterable(listOf("Riko", "Mail", "Korek")) // Error, Bukan turunan dari Mutable Iterator
    val mutableList = mutableListOf("Riko", "Mail", "Korek", "max")
    displayMutableIterable(mutableList)
//    displayMutableIterable(setOf("Riko", "dlignt", "wanted")) // Error, Bukan turunan dari Mutable Iterator
    displayMutableIterable(mutableSetOf("Riko", "dlignt", "wanted", "max"))

}