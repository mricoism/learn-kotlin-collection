package app

/*
KTC.05.b - MUTABLE MAP
 */
fun main() {
    val drivers: MutableMap<String, String> = mutableMapOf()
    drivers.set("Oscar", "Australia")
    drivers["Yuki"] = "Japan"
    drivers.put("Albon", "Thailand")

    println(drivers)
    println(drivers["Yuki"])
    println(drivers.get("Oscar"))
    println(drivers.getOrDefault("Kimi", "Witch one ? Raikonen or Antonelli")) // Return default value
    println(drivers.get("Kimi")) // Return null

    drivers.remove("Albon")

    for ((key, value) in drivers) {
        println("$key is born in $value")
    }
}