package app

/*
KTC.14 - FLATTENING
Flattening adalah operasi transformasi untuk menjadikan nested collection menjadi flat

** Transformations : Flattening Operation
Flattering Operation            | Keterangan
---------------------------------------------------------------
flatten                         | Mengubah nested collection menjadi flat collection
flatMap((T) -> Iterable<R>)     | Mengubah collection T menjadi flat collection R
 */

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Oscar", "Lawson", "Kimi"),
        listOf("MCLaren", "RedBull", "Mercedes")
    )
    println(list)
    val list2: List<String> = list.flatten()
    println(list2)

    val members: List<Member> = listOf(
        Member("Riko", listOf("Fixing something", "Walk somewhere")),
        Member("Jane", listOf("Sleep", "Talk with people"))
    )
    println(members)
//    val list3: List<String> = members.map { it.hobbies }.flatten() // Work but its 2 times process
    val list3: List<String> = members.flatMap { it.hobbies }
    println(list3)
}