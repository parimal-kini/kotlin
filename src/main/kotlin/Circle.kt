class Circle(
    val radius: Double
) : Shapes("Circle") {
    val pi = 3.141492
    init {
        println("----------------------------------------------")
        println("A $name is creates with the radius of $radius")
        println("Area of my circle is ${area()}")
        println("Circumference of my circle is ${circumference( )}")
        println("Level 2")
    }

    fun area() = pi * (radius*radius)
    fun circumference() = 2 * pi * radius

}