package com.example.conditionalsinkotlin.ui.theme

fun main() {
    val trafficLightColor = "greeen";

    if(trafficLightColor == "red")
        println("Stop");

    else if(trafficLightColor == "yellow")
        println("procceed cautiously")
    else if(trafficLightColor == "green")
        println("Go")
    else
        println("Invalid Color")

}
{
    fun main() {
        val trafficLightColor = "Amber";
        val message =
            when (trafficLightColor) {
                "Red" -> ("stop")
                "Green" -> ("Go")
                "Yellow","Amber" -> ("Slow")

                else -> ("invalid color")
            }
        println(message)
    }
}
fun main() {
    val trafficLightColor = "amber";
    val message =
        if (trafficLightColor == "red")
            ("stop")
        else if (trafficLightColor == "red")
            ("Go")
        else if (trafficLightColor == "yellow")
            ("Slow")
        else if (trafficLightColor == "amber")
            ("Slow")
        else ("invalid color")
    println(message)
}
fun main() {
    val x=34;
    when (x){
        2,3,5,7 -> println("prim")
        in 1..10 -> println("intre 1-10, dar nu prim")
        is Int -> println("integer dar nu la 1-10")
        else -> println("nu integer")
    }
}

open class SmartDevice (val name: String, val category: String){
    var devicestatus: String = "online";
    constructor(name: String , category: String, statusCode: Int):this (name, category)
    {
        devicestatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

}
class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
}
class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}
fun main() {
    val device = SmartDevice("Phone", "Mobile",1);
    println(device.name)
    println(device.category)
    println(device.devicestatus)

}