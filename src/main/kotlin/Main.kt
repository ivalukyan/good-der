package org.example


fun main() {
    val developers = mutableListOf<Pair<Int, Int>>()
    var x = 0
    var y = 0
    var count = 1

    var route = readLine().orEmpty()

    for (move in route) {
        when (move) {
            'U' -> y++
            'R' -> x++
            'D' -> y--
            'L' -> x--
        }
        if (Pair(x, y) in developers) {count++}
        developers.add(Pair(x, y))
    }
    println(count)
}