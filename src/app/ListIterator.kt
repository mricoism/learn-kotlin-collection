package app

/*
KTC.08.a - ListITERATOR
- Sebelumnya kita sudah bahas tentang Iterator di Iterable dan MutableIterator di MutableIterable
- Iterator juga memiliki child interface, yaitu ListIterator dan MutableListIterator
- ListIterator digunakan oleh List, dan MutableListIterator digunakan oleh MutableList
- Set tetap menggunakan Iterator
- Sedangkan Map tidak mendukung Iterator
 */

fun <T>displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
    println()
}

fun main() {
    displayListIterator(listOf("Muhammad", "Riko", "Ismail").listIterator())
}