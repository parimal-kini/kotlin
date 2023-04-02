fun main(){
    print("Enter the radius: ")
    val userInput = readln().toDouble()
    try {
        userInput
    }catch (e: Exception){
        println("Now it will throw a exception")
        //e.printStackTrace()
    }
    var myCircle = Circle(userInput)
}