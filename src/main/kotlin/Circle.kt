import kotlin.random.Random

class RadiusCannotBeNegative: Exception("Radius cannot be zero or negative")

class Circle(
    val radius: Double
) : Shapes("Circle") {

    companion object{
        fun randomCircle(): Circle{
            val radius = Random.nextDouble(1.0, 9.0)
            return Circle(radius)
        }
    }

    init {
        if (radius <= 0) throw RadiusCannotBeNegative()

        println("A $name is creates with the radius of $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter( )}")
        println("Level 2")
    }

    override fun area() = ImportantNumbers.PI * (radius*radius)
    override fun perimeter() = 2 * ImportantNumbers.PI * radius
}