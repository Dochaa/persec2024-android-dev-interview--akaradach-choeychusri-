data class Autocomplete(val search: String, val items: Array<String>, val maxResult: Int)

fun main() {
    val testCases = listOf(
        Autocomplete("th", arrayOf("Mother", "Think", "Worthy", "Apple", "Android"), 2), 
        Autocomplete("app", arrayOf("Apple", "Application", "Happy", "Appetizer"), 3), 
        Autocomplete("an", arrayOf("Banana", "Android", "Can", "Ant", "Man"), 4), 
        Autocomplete("test", arrayOf("Testing", "Contest", "Latest", "Testament"), 2),
        Autocomplete("a", arrayOf("Apple", "Banana", "Apricot", "Grape", "Pineapple"), 3), 
        Autocomplete("nope", arrayOf("Nothing", "Zero", "None", "Null"), 1), 
        Autocomplete("lo", arrayOf("Hello", "Solo", "Pillow", "Flow"), 2), 
        Autocomplete("M", arrayOf("Mother", "Think", "Worthy", "Apple", "Android"), 3),
        Autocomplete("H", arrayOf("house", "Happy", "Hat", "Horse", "hero"), 2),
        Autocomplete("", arrayOf("Anything", "Everything", "Something", "Nothing"), 2),
        Autocomplete("app", arrayOf(), 3),
        Autocomplete("lo", arrayOf("solo", "Solo", "SOLO", "flow"), 3)
    )

    for (testCase in testCases) {
        println("Input: search=\"${testCase.search}\", items=${testCase.items.joinToString()}, maxResult=${testCase.maxResult}")
        println("Output: ${findWord(testCase)}")
        println("-----")
    }
}

fun findWord(DataF: Autocomplete): String {
    val index = DataF.items.filter { it.contains(DataF.search, ignoreCase = true) }
    val words = index.sortedBy { it.startsWith(DataF.search, ignoreCase = true).not() }
    val cutA = words.slice(0 until minOf(DataF.maxResult, words.size))
    return cutA.joinToString()
}
