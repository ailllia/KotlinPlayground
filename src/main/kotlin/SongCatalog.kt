class Song (val title: String, val artist: String, val year: Int, val playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000

    val getPopularity: String
        get() {
            return if (playCount < 1000) {
                "unpopular"
            } else {
                "popular"
            }
        }
    fun printDescription () {
        println("$title, performed by $artist, was released in $year.")
    }
}
fun main () {
    val mama = Song("Bohemian Rhapsody", "Queen", 1975, 1_000_000)
    val daddy = Song("Daddy Issues", "The Neighbourhood", 2015, 900)
    mama.printDescription()
    println(mama.getPopularity)
    daddy.printDescription()
    println(daddy.getPopularity)
}