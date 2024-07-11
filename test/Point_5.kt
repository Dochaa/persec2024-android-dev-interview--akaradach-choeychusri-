fun main() {
    testSortedNumber(1572)
    testSortedNumber(1989)
    testSortedNumber(9163)
    testSortedNumber(2679)
    testSortedNumber(987654321)
    testSortedNumber(120)
    testSortedNumber(0)
    testSortedNumber(111)
    testSortedNumber(1000) 
    testSortedNumber(5501) 
    testSortedNumber(999) 
    testSortedNumber(4321) 
    testSortedNumber(8080) 
}

fun testSortedNumber(num: Int) {
    val sortedNumber = num.toString().toList().sortedDescending().joinToString("").toInt()
    println("Input: $num -> Sorted Descending: $sortedNumber")
}


