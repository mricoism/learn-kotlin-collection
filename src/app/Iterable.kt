package app

/*
KTC.07.a - ITERABLE
- Iterable adalah superclass dari Collection interface
- Iterable adalah general operation untuk melakukan iterasi seluruh data di collection, atau menghapus data di collection
 */
fun <T> displayIterable(iterable: Iterable<T>) {
//    for (value in iterable) {}
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
    println()
}

fun main() {
    displayCollection(listOf("Riko", "Mail", "Korek"))
    displayCollection(setOf("Riko", "dlignt", "wanted"))

}