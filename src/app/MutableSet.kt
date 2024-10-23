package app

import data.Person

/*
KTC.03.b - MUTABLE SET
 */
fun main() {
    val personMutableSet: MutableSet<Person> = mutableSetOf()
    personMutableSet.add(Person("Riko"))
    personMutableSet.add(Person("Adi"))
    personMutableSet.add(Person("Riko"))
    personMutableSet.add(Person("Irham"))
    println(personMutableSet)
    println(personMutableSet.size)
}