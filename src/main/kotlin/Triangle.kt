import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : Shapes("Triangle") {
    init {
        println("A $name is creates with the sides $a, $b, $c")
        println("$name are is ${area()}")
        println("$name perimeter is ${perimeter( )}")
        println("Level 2")
    }
    override fun area() = sqrt((perimeter()/2) * (perimeter()/ 2-a) * (perimeter()/ 2-b) *  (perimeter()/ 2-c))
    override fun perimeter() = a + b + c

}