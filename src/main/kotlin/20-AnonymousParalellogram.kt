fun main(){
    val a = 3.0
    val b = 4.0
    val height = 2.0

    val paralellogram = object: Shapes("Paralellogram", a,b,height){
        init {
            println("$name created with sides $a, $b and height $height")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        }
        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2*a + 2*b
        }

        fun isRect(): Boolean = height==b
    }

    println("Is paralellogram a rectangle: ${paralellogram.isRect()}")

}