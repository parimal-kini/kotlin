open class Shapes(
    var name : String
) {
    init {
        println("I am super class BITCH!")
        println("Level 1")
    }

    fun changeName(newName: String) {
        name = newName
    }
}