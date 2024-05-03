fun main() {
    val likes = 1011
    val rightWord = when {
        likes % 100 == 11 -> "людям"
        likes % 10 == 1 -> "человеку"
        else -> "людям"
    }
    println("Понравилось $likes $rightWord")
}