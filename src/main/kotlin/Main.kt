fun main() {
    var vehicle = Car("lambo", "2020cv", "maroon", 4)
    vehicle.carry(5)
vehicle.identity()
var money =vehicle.calculateparkingfees(3)
    println(money)



 var transport= Bus("mistubish","19wend4","blue",50)
 var changee=transport.maxTripFare(50.0)
    println(changee)
var busfees=transport.calculateparkingfees(13)
    println(busfees)

}
open class Car (var make:String,var model:String, var color:String, var capacity:Int) {

     fun carry(people: Int) {
        var x= people% capacity
        println(x)
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("exceeding in capacity by $x")
        }
    }
    fun identity(){
    println("I am a $color $make $model ")
}
open fun calculateparkingfees(hours:Int):Int{
    var total= hours*20
    return total
}
}
class Bus(make:String, model:String, color:String, capacity:Int):Car(make,model,color, capacity){
    fun maxTripFare(fare:Double):Double{
        var amount= fare*capacity
        return amount
    }

    override fun calculateparkingfees(hours: Int): Int {
        var payment= hours*capacity
        return payment
    }


}