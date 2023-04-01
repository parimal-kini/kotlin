class Circle(
    val radius: Double
) : Shapes("Circle") {
    private val pi = 3.141492
    init {
        println("----------------------------------------------")
        println("A $name is creates with the radius of $radius")
        println("Area of my circle is ${area()}")
        println("Circumference of my circle is ${perimeter( )}")
        println("Level 2")
    }

    override fun area() = pi * (radius*radius)
    override fun perimeter() = 2 * pi * radius

}