package app

import data.Person

/*
KTC.03.a - IMMUTABLE SET
- Set, adalah collection yang datanya harus unik dan tidak pasti berurut
- Saat kita memasukkan data duplicate ke Set, maka data hanya akan disimpan satu, data duplicatenya tidak akan ditambahkan ke dalam Set
- Set sangat cocok untuk menyimpan data yang emang unik, tidak boleh sama
- Set menggunakan function hashCode() dan equals() untuk membandingkan apakah sebuah object sama atau tidak, jika hashCode() dan equals() nya sama, maka diangkap data tersebut duplicate, dan tidak akan diterima oleh Set
 */

fun main() {
    val personSet: Set<Person> = setOf(Person("Riko"), Person("Adi"), Person("Irham"), Person("Riko"))
    println(personSet)
    println(personSet.size)
    println(personSet.contains(Person("Riko")))

    for (person in personSet) {
        println(person)
    }
}