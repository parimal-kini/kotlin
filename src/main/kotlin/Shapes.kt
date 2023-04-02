abstract class Shapes(
    var name : String
) {
    constructor(name: String, vararg dimensions: Double): this(name)
    init {
        println("----------------------------------------------")
        println("I am super class BITCH!")
        println("Level 1")
    }

    abstract fun area() : Double
    abstract fun perimeter() : Double
    fun changeName(newName: String) {
        name = newName
    }
}