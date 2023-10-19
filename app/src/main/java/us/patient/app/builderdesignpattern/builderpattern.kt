package us.patient.app.builderdesignpattern
/*
There are some of the problems when objet has a lot of attributes,
Even through some of the parameters might be optional,
we are forced to send all the parameters and optional parameters need to send as NULL.

Implementation:
#First of all you need to create a static nested class and then copy all the arguments from the outer class
#We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
#Builder class should have a public constructor with all the required attributes.
#Builder class should have methods to set the optional parameters and it should return the same Builder object.
#The final step is to provide a build() method in the builder class that will return the Object needed by client program
#For this we need to have a private constructor in the Class with Builder class as argument.
 */
class Computer private constructor(var computerBuilder:ComputerBuilder){
    private var HD: String? = null
    private var RAM: String? = null
    //Optional
    private var isGraphicsCardEnabled: Boolean? =null
    private var isBluetoothEnabled: Boolean? =null
    init {
        this.HD = computerBuilder.HD
        this.RAM = computerBuilder.RAM
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled
    }

     fun getComputerDetails() = "RAM : $RAM, \nHD: $HD, \nGraphicsCardEnabled : $isGraphicsCardEnabled, \nBluetoothEnabled: $isBluetoothEnabled"

     class ComputerBuilder(){
         var HD: String? = null
         var RAM: String? = null

        //Optional
         var isGraphicsCardEnabled: Boolean? =null
         var isBluetoothEnabled: Boolean? =null

        fun setHD(HD: String) : ComputerBuilder{
            this.HD = HD
            return this
        }

        fun setRAM(RAM: String) = apply {
            this.RAM = RAM
        }

        fun setGraphicsCardEnabled(isGraphicsCardEnabled: Boolean) = apply {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled
        }

        fun setBluetoothEnabled(isBluetoothEnabled: Boolean) = apply {
            this.isBluetoothEnabled = isBluetoothEnabled
        }

        fun build() : Computer{
            return Computer(this);
        }

    }
}

fun main(){
    var computer: Computer = Computer.ComputerBuilder().apply {
        HD = "500GB"
        RAM ="16GB"
        isBluetoothEnabled = false
        isGraphicsCardEnabled = true
    }.build()

    println(computer.getComputerDetails())
}