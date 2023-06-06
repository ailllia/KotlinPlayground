fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages in 0..99) {
        println("You have $numberOfMessages notifications.")
    } else if (numberOfMessages > 99){
        println("Your phone is blowing up! You have 99+ notifications.\n")
    } else {
        println("Error, something went wrong!")
    }
}