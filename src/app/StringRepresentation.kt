package app

/*
KTC.15 - STRING REPRESENTATION
String Representations adalah operasi transformasi untuk mengubah collection menjadi string

** String Representation Operation
String Representation Operation                             | Keterangan
------------------------------------------------------------------------------------
joinToString(separator, prefix, suffix)                     | Mengubah collection menjadi string dengan separator, prefix dan suffix
joinToString(separator, prefix, suffix, transform)          | Mengubah collection menjadi string dengan separator, prefix dan suffix, namun akan diubah dalam transform terlebih dahulu
joinTo(Appendable, separator, prefix, suffix, transform)    | Sama seperti joinToString, namun string ditambahkan ke Appendable
 */

fun main() {
    val list: List<String> = listOf("Muhammad", "Riko", "Ismail")

    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    val string2: String = list.joinToString(" ", "*", "*") { it.uppercase() }
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder, " ","<", ">")
    list.joinTo(builder, "-", "#", "#")
    list.joinTo(builder, " ", "::", "::")
    val string3 = builder.toString()
    println(string3)

    val numbers: List<Int> = (1..16).toList()
    val string4 = numbers.joinToString()
    println(string4)
}