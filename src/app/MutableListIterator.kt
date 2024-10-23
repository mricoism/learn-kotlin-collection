package app


/*
KTC.08.b - MUTABLE ListITERATOR
 */
fun <T>displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) {
        println(mutableListIterator.next())
    }
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 == 1) {
            mutableListIterator.remove()
        }
    }
}

fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    removeOddNumber(mutableList.listIterator())
    displayMutableListIterator(mutableList.listIterator())

}