
fun main(){
    val myRectangle = Rectangle(2.0, 5.0)
    println("Area of my rectangle is ${myRectangle.area()}")
    println("Perimeter of my rectangle is ${myRectangle.perimeter()}")
    println("Is my rectangle a square? ${myRectangle.isSquare()}")

    val myCircle1 = Circle(3.0)
    val myCircle12 = Circle(5.0)
    val myCircle13 = Circle(7.0)

    val myTriangle = Triangle(3.0, 3.0, 3.0)
}