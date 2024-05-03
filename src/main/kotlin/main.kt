fun main() {
    val likes = 91
    val rightWord = when {
        likes == 11 -> "людям"
        likes % 10 == 1 -> "человеку"
        else -> "людям"
    }
    println("Понравилось $likes $rightWord")
}