open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
        println("switched on")
    }

    fun switchOff() {
        isScreenLightOn = false
        println("switched off")
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    override fun switchOn() {
        super.switchOn()
        if (isFolded) {
            isScreenLightOn = false
        }
    }

    fun fold() {
        isFolded = true
        isScreenLightOn = false
        println("folded")
    }
    fun unfold() {
        isFolded = false
        isScreenLightOn = true
        println("unfolded")
    }
    }

fun main () {
    val newPhone = FoldablePhone()
    newPhone.checkPhoneScreenLight()
    newPhone.switchOn()
    newPhone.checkPhoneScreenLight()
    newPhone.unfold()
    newPhone.checkPhoneScreenLight()
    newPhone.switchOn()
    newPhone.checkPhoneScreenLight()
}

/*
write a FoldablePhone class that inherits from the Phone class.
It should contain the following:

A property that indicates whether the phone is folded.
A different switchOn() function behavior than the Phone class so that it only turns the screen on when the phone isn't folded.
Methods to change the folding state.
 */