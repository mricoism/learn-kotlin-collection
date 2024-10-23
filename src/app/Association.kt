package app

/*
KTC.13 - ASSOCIATION
- Association adalah operasi transformasi dari collection menjadi map
- Dalam beberapa operasi association, element hasil bisa menjadi key atau value

** Transformations : Association Operation
Association Operations          | Keterangan
---------------------------------------------------------------
associate((T) -> Pair<K, V>)    | Merubah collection T menjadi Map<K, V>
associateWith(T -> V)           | Merubah collection T menjadi Map<T, V>
associateBy(T -> K)             | Merubah collection T menjadi Map<K, T>
 */

fun main() {
    val list = listOf("Muhammad", "Riko", "Ismail")

    val map1: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map1)

    val map2: Map<String, Int> = list.associateWith { it.length + 10}
    println(map2)

    val map3: Map<Int, String> = list.associateBy { it.length * 5 }
    println(map3)
}