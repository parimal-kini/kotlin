fun main(){
    val a = 3.0
    val b = 5.0
    val c = 6.0
    val d = 7.0
    val height = 6.0

    val trapeze = object:  Shapes("Trapeze", a,b,height){
        init {
            println("$name created with sides $a, $b, $c, $d and height $height")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return ((a+b)/2) * height
        }

        override fun perimeter(): Double {
            return a+b+c+d
        }
    }
}