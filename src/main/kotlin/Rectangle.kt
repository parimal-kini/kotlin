class Rectangle(
    val a: Double,
    val b: Double
) : Shapes("Rectangle") {
    init {
        println("A rectangle is created with $a and $b sides!")
    }

    fun area() = a * b

    fun perimeter() = 2*a + 2*b

    fun isSquare() = a==b
}