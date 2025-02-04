fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }.toMutableList()
    evenNumbers.add(6) // Modifying the evenNumbers list now works
    println(list.joinToString())
    println(evenNumbers.joinToString())
}