//superclass
open class SmartDevice (val name: String, val category: String) {

    fun turnOn(){
        println("$name is turned on.")
    }

    fun turnOff(){
        println("$name is turned off.")
    }
}

//subclass: SmartTvDevice IS-A SmartDevice
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
                ////wird jedes mal durchlaufen, wenn der Wert sich ändert
            }
        }
    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
                //wird jedes mal durchlaufen, wenn der Wert sich ändert
            }
        }
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Changed volume to $speakerVolume")
    }
}

//subclass: SmartBulbDevice IS-A SmartDevice
class SmartBulbDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    private var brightness = 2
        set(value) {
            if (value in 0..100) {
                field = value
                //wird jedes mal durchlaufen, wenn der Wert sich ändert
            }
        }
    fun increaseBrightness() {
        brightness++
        println("Changed brightness to $brightness")
    }
}

//SmartHome HAS-A smartTvDevice, smartBulbDevice
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartBulbDevice: SmartBulbDevice
) {

    fun turnOnTv() {
        smartTvDevice.turnOn()
    }
    fun turnOffTv() {
        smartTvDevice.turnOff()
    }
    fun turnOnLight() {
        smartBulbDevice.turnOn()
    }
    fun turnOffLight() {
        smartBulbDevice.turnOff()
    }
    fun turnOffAllDevices() {
        smartTvDevice.turnOff()
        smartBulbDevice.turnOff()
    }
    fun louder() {
        smartTvDevice.increaseSpeakerVolume()
    }
    fun brighter() {
        smartBulbDevice.increaseBrightness()
    }
}

fun main() {
    //Call subclass directly:
    val smartTv = SmartTvDevice("Android TV", "SmartTV")
    smartTv.turnOn()
    smartTv.increaseSpeakerVolume()
    //smartTv.channelNumber = 200
    smartTv.turnOff()
    val smartBulb = SmartBulbDevice("Android Bulb", "SmartBulb")
    smartBulb.turnOn()
    smartBulb.increaseBrightness()
    smartBulb.turnOff()

    //call HAS-A class
    val smartTv2 = SmartTvDevice("My TV", "SmartTV")
    val home = SmartHome(smartTv2, smartBulb)
    home.turnOnLight()
    home.turnOnTv()
    home.louder()
    home.brighter()
    home.turnOffAllDevices()
}
