fun main(){
//    for(i in 1..3) println(i)
//    for (i in 5..10) println(i)
//    for (i in 10 downTo 5) println(i)
//    for (i in 10 downTo 5 step 2) println(i)

//    var myArr = arrayOf(2, 1, 3, 9, 5, 14, -1)
//    var max = myArr[0]
//    for(i in myArr) if(i > max) max = i
//    println("max num is $max")

//    var myArr = arrayOf(2, 1, 3, 9, 5, 14, -1)
//    var sum = 0
//    for (i in myArr) sum += i
//    println("Sum of all the items in array is $sum")

    println("Enter 5 numbers : ")
    var avg = 0.0
    for (i in 1..5){
        var input = readln()?.toInt()
        if (input != null){
            avg += input / 5.0
        }
    }
    println("the average is $avg")

//    var myArr = arrayOf(1,3,4,5,6,42,2,3,1,34,54,54)
//    for (i in myArr[0]..myArr[myArr.size-1])
//        println(i)
}
