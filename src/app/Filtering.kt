package app

/*
KTC.16 - FILTERING
- Filtering adalah salah satu operasi collection yang sangat popular
- Di kotlin, filtering bisa menggunakan predicate berupa lambda yang berisi kondisi filter nya
- Jika return dari predicate tersebut true, maka data di terima, jika false maka data dibuang


** Filtering by Predicate Operation
Filtering Operation                     | Keterangan
---------------------------------------------------------------
filter((T) -> Boolean)                  | Melakukan filtering terhadap collection
filterIndexed((index, T) -> Boolean)    | Melakukan filtering terhadap collection, dengan tambahan informasi index
filterNot((T) -> Boolean)               | Kebalikan dari filter((T) -> Boolean)
filterIsInstance<T>()                   | Mengambil hanya data instant dari T
filterNotNull()                         | Mengambil hanya data yang tidak null
 */
fun main() {
    val list1 = listOf("Muhammad", "Riko", "Ismail")
    val list2 = list1.filter { it.length > 5 }
    val list3 = list1.filterIndexed { index, s ->  index % 2 == 0}
    val list4: List<Any?> = listOf(null, 1, "Muhammad", "Ismail", 2, null)
    val list5 = list4.filterIsInstance<String>()
    val list6 = list4.filterIsInstance<Int>()
    val list7 = list4.filterNotNull()


    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
    println(list6)
    println(list7)
}