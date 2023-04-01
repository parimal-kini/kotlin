class Rectangle(
    val a: Double,
    val b: Double
) : Shapes("Rectangle") {
    constructor(a: Double) : this(a, a)

    constructor(a: Int, b: Int): this(a.toDouble(), b.toDouble())

    init {
        println("A $name is creates with the side of $a and $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter( )}")
        println("Level 2")
    }

    override fun area() = a * b

    override fun perimeter() = 2*a + 2*b

    fun isSquare() = a==b
}