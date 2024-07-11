fun main() {
    val testCases = listOf(
        "()", 
        "(}", 
        "({[]})", 
        "({[)]}",
        "(", 
        ")", 
        "",
        "{[()]}",
        "{[(])}", 
        "([{}])", 
        "([)", 
        "[({})]", 
        "([]{})", 
        "([{}]))", 
        "(([])", 
        "{[(])}", 
        "{[()]}[({})]{}", 
        "(((((())))))", 
        "(((((())))))(", 
        "(((((()))))))",
        "(((((((())))))))", 
        "[[[[[[[]]]]]]]", 
        "[[[[[[[[]]]]]]]]", 
        "[[[[[[[]]]]]]]]", 
    )
    
    for (message in testCases) {
        println("Input: \"$message\" -> ${CheckBracket(message)}")
    }
}

fun CheckBracket(message: String): Boolean {
    var b1 = 0
    var b2 = 0
    var b3 = 0
    for (c in message) {
        when (c) {
            '(' -> b1++
            ')' -> b1--
            '{' -> b2++
            '}' -> b2--
            '[' -> b3++
            ']' -> b3--
        }
        if (b1 < 0 || b2 < 0 || b3 < 0) {
            return false
        }
    }
    return b1 == 0 && b2 == 0 && b3 == 0
}

