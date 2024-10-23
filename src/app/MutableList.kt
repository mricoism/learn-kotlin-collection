package app


/*
KTC.02.b - MUTABLE LIST
 */
fun main() {
    val cars: MutableList<String> = mutableListOf("Toyota", "Mercedes", "Ferrari", "BYD")
    cars.add("BMW")
    cars.add("Honda")
    cars.set(3, "Mazda")
    cars[4] = "Nissan"
    cars.removeAt(1)
    cars.remove("Ferrari")
    println(cars)
    println(cars[0])
    println(cars.get(2))
    println(cars.isEmpty())
    println(cars.isNotEmpty())
    println(cars.indexOf("Toyota"))
    println(cars.contains("Nissan"))
    println(cars.containsAll(listOf("Honda", "Mazda")))
}