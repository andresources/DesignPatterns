interface ICar{
    enum class CarType{
        TATA,KIA,MARUTHI
    }
    fun displayDetails()
}
class Tata2 : ICar{
    override fun displayDetails() {
       println("This is Tata")
    }
}
class Kia2 : ICar{
    override fun displayDetails() {
        println("This is Kia")
    }
}

class Maruthi2 : ICar{
    override fun displayDetails() {
        println("This is Maruthi")
    }
}

object CarFactory{
    fun getCar(carType: ICar.CarType) : ICar = when(carType){
        ICar.CarType.TATA -> Tata2()
        ICar.CarType.KIA -> Kia2()
        ICar.CarType.MARUTHI -> Maruthi2()
    }
}

fun main(){
    CarFactory.getCar(ICar.CarType.KIA).displayDetails()
}
