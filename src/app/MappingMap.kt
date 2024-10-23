package app

/*
KTC.11.b - MAPPING MAP

** Mapping Operations For Map
Mapping Operations                          | Keterangan
---------------------------------------------------------------------
mapKeys(transform: (Entry<K,V>) -> R)       | Mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda transform
mapValues(transform: (Entry<K,V>) -> R)     | Mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda transform
 */
fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Muhammad",
        2 to "Riko",
        3 to "Ismail"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues {
        it.value.uppercase()
    }
    println(mapValues)
}