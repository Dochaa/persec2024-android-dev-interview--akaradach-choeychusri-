fun main() {
   
    println(toRoman(1989))  
    println(toRoman(2000)) 
    println(toRoman(68))   
    println(toRoman(109))

    println(fromRoman("MCMLXXXIX"))
    println(fromRoman("MM"))
    println(fromRoman("LXVIII"))
    println(fromRoman("CIX"))       

    val testCases = listOf(
        1 to "I", 4 to "IV", 9 to "IX", 40 to "XL",
        90 to "XC", 400 to "CD", 500 to "D", 1000 to "M",
        3999 to "MMMCMXCIX", 49 to "XLIX", 58 to "LVIII",
        1999 to "MCMXCIX", 2021 to "MMXXI"
    )

    for ((number, roman) in testCases) {
        println("Decimal: $number -> Roman: ${toRoman(number)}")
        println("Roman: $roman -> Decimal: ${fromRoman(roman)}")
    }
}

fun toRoman(num: Int): String {
    var rawNum = num
    var roman = ""
    val romanNumerals = listOf(
        1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
        100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
        10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
    )
    for ((value, symbol) in romanNumerals) {
        while (rawNum >= value) {
            rawNum -= value
            roman += symbol
        }
    }
    return roman
}

fun fromRoman(roman: String): Int {
    val romanNumerals = mapOf(
        'M' to 1000, 'D' to 500, 'C' to 100, 'L' to 50,
        'X' to 10, 'V' to 5, 'I' to 1
    )
    var num = 0
    var prevValue = 0
    for (char in roman) {
        val value = romanNumerals[char] ?: 0
        if (value > prevValue) {
            num += value - 2 * prevValue
        } else {
            num += value
        }
        prevValue = value
    }
    return num
}
