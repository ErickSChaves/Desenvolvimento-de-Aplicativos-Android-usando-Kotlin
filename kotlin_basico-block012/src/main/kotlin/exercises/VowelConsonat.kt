package exercises

fun countVowels(phrase: String): Int {
    val VOLWES = "aeiou"
    var totalVowels = 0

    for(letter in phrase) {
        if (letter.lowercaseChar() in VOLWES) totalVowels++
    }
    return totalVowels
}

fun countConsonats(phrase: String): Int {
    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var totalConsonants = 0

    for(letter in phrase) {
        if (letter.lowercaseChar() in CONSONANTS) totalConsonants++
    }
    return totalConsonants
}