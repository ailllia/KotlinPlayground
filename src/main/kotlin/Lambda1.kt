fun main () {
    val trickFunction = trickOrTreat(true, null)
    val treatFunction1 = trickOrTreat(false, {"$it quarters"})
    val treatFunction2 = trickOrTreat(false){"Have a cupcake!"}
    trickFunction()
    repeat(4) {
        treatFunction1()
    }
    treatFunction2()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        if (extraTreat!= null) {
            println(extraTreat(5))
        }
        treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}