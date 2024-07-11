fun main() {
    val testCases = listOf(
        arrayOf("TH19", "SG20", "TH2"), 
        arrayOf("TH10", "TH3Netflix", "TH1", "TH7"), 
        arrayOf("SG1", "SG2", "SG10"), 
        arrayOf("TH", "SG", "TH1", "SG1"), 
        arrayOf("TH1", "TH2", "TH10", "TH20"), 
        arrayOf("TH1Netflix", "TH1", "TH2"), 
        arrayOf("AB10", "AB2", "AB1"), 
        arrayOf("TH2", "TH11", "TH1", "TH21"), 
        arrayOf("TH1", "SG1", "TH2", "SG2"), 
        arrayOf("TH1A", "TH1B", "TH1"), 
        arrayOf(""), 
        arrayOf(), 
        arrayOf("TH1", "TH01", "TH001"), 
        arrayOf("TH01", "TH10", "TH02"), 
        arrayOf("TH01Netflix", "TH01", "TH1Netflix"), 
    )

    for (testCase in testCases) {
        println("Input: ${testCase.joinToString()} -> Sorted: ${sortNumber2(testCase)}")
    }
}

fun sortNumber2(numb2: Array<String>): String {
    val sort2 = numb2.sortedWith(compareBy({ it.substring(0, 2) }, { extractNumber(it) }))
    return sort2.joinToString()
}

fun extractNumber(s: String): Int? {
    val numberStr = s.substring(2)
    val digits = numberStr.takeWhile { it.isDigit() }
    return digits.toIntOrNull()
}
