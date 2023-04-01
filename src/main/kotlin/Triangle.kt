import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : Shapes("Triangle") {
    init {
        println()
        println("----------------------------------------------")
        println()
        println("A triangle is creates with the sides $a, $b, $c")
        println("Area of my triangle is ${area()}")
        println("Perimeter of my circle is ${perimeter( )}")
    }
    private fun area() = sqrt((perimeter()/2) * (perimeter()/ 2-a) * (perimeter()/ 2-b) *  (perimeter()/ 2-c))
    private fun perimeter() = a + b + c

}