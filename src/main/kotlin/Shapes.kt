abstract class Shapes(
    var name : String
) {
    init {
        println("I am super class BITCH!")
        println("Level 1")
    }

    abstract fun area() : Double
    abstract fun perimeter() : Double
    fun changeName(newName: String) {
        name = newName
    }
}