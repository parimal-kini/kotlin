class Circle(
    val radius: Double
) : Shapes("Circle") {
    private val pi = 3.141492
    init {
        println("A $name is creates with the radius of $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter( )}")
        println("Level 2")
    }

    override fun area() = pi * (radius*radius)
    override fun perimeter() = 2 * pi * radius

}