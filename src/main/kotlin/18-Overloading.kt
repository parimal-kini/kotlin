fun main(){
//    val myRectangle = Rectangle(5.0)
//    val myCircle = Circle(7.0)
//    val myTriangle = Triangle(9.0, 9.0, 9.0)
//
//    val maxAreaRectAndCircle = maxArea(myRectangle, myCircle)
//    val maxAreaRectCircleAndTriangle = maxArea(myRectangle, myCircle, myTriangle)
//
//    println("The maximum area of rectange and circle is $maxAreaRectAndCircle")
//    println("The maximum area of rectange, circle and triangle is $maxAreaRectCircleAndTriangle")
//    println("Level 3")
    val myList = listOf<Int>(1,2,3,4,5,6)
    val myArr = arrayOf(11,12,13)

    printAlternateList(myList)
    printAlternateList(myArr)
    //println("Alternate of List is ${}")
    //println("Alternate of Arr is ${}")
}

fun maxArea(shape1: Shapes, shape2: Shapes): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()

    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shapes, shape2: Shapes, shape3: Shapes): Double{
    val areaShape1Shape2 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()

    return if(areaShape1Shape2 > areaShape3) areaShape1Shape2 else areaShape3
}

fun printAlternateList(list: List<Int>){
    var i = 0
    var j = list.size - 1
    var toggle = true

    println("Alternate of List is: ")
    while (i <= j){
        if(toggle){
            print("${list[i]} ")
            i++
        }else{
            print("${list[j]} ")
            j--
        }
        toggle = !toggle
    }
}

fun printAlternateList(arr: Array<Int>){
    var i = 0
    var j = arr.size - 1
    var toggle = true

    println()
    println("Alternate of Array is: ")
    while (i <= j){
        if(toggle){
            print("${arr[i]} ")
            i++
        }else{
            print("${arr[j]} ")
            j--
        }
        toggle = !toggle
    }
}