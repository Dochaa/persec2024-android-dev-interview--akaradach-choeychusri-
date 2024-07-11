fun main() {
    println(tribonacciF(arrayOf(1, 3, 5), 5).joinToString())
    println(tribonacciF(arrayOf(2, 2, 2), 3).joinToString())
    println(tribonacciF(arrayOf(10, 10, 10), 4).joinToString())
    println(tribonacciF(arrayOf(1), 5).joinToString())
    println(tribonacciF(arrayOf(3, 4), 6).joinToString())
    println(tribonacciF(emptyArray(), 5).joinToString())
}

fun tribonacciF(initialArray: Array<Int>, lengthN: Int): Array<Int> {
    val initial = initialArray.toMutableList()
    while (initial.size < 3) {
        initial.add(0)
    }

    var num = initial.toTypedArray()

    while (num.size < lengthN) {
        num += num.takeLast(3).sum()
    }

    return num.take(lengthN).toTypedArray()
}
