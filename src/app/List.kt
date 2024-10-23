package app


/*
KTC.02.a - IMMUTABLE LIST
- List, adalah collection yang datanya seperti Array dan memiliki akses data menggunakan index
- Data di List boleh duplicate, artinya kita boleh memasukkan data yang sama berkali-kali ke dalam sebuah List yang sama
 */

fun main() {
    val names: List<String> = listOf("Riko", "Irham", "Adi")
    println(names[0])
    println(names.get(2))
    println(names.isEmpty())
    println(names.isNotEmpty())
    println(names.indexOf("Adi"))
    println(names.indexOf("Irham"))
    println(names.indexOf("MAIL"))
    println(names.contains("Riko"))
    println(names.contains("MAIL"))
    println(names.containsAll(listOf("Riko", "Adi")))
    println(names)
}