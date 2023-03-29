import kotlin.math.exp

//fun main(){
//    println("Enter the last number of range : ")
//    val end = readln()?.toInt()
//    val myList = listOf(1,2,3)
//
//    if (end != null) add(end)
//    println(printPow(5,2))
//    printFirstItem(myList)
//}
//
//fun printFirstItem(mylist : List<Int>) = println(mylist[0])
//
//fun add(range: Int){
//    var sum = 0
//    for(i in 1..range){
//        sum += i
//    }
//    println(sum)
//}
//
//fun printPow(base: Int, exponent: Int): Int{
//    var result = 1
//    for (i in 1..exponent) result *= base
////    println("result of $base to the power of $exponent is $result")
//    return result
//}

fun main(){
    printSum(3)

    var pow = printExponent(3, 2)
    println("3 to the pow 0f 2 is $pow")

    var myList = listOf(4, 2, 8, 6, 1, 3, 7, 9, 5)
    println("Enter the number you want to search : ")
    var key = readln()?.toInt()

    val indexOfKey = findIndexInList(myList, key!!)
    println("Index of $key is $indexOfKey")
}

fun findIndexInList(myList: List<Int>, key: Int): Int {
    var index = myList.indexOf(key)
    return index
}

fun printSum(num: Int){
    var sum = 0
    for (i in 1..num){
        sum += i
    }
    println(sum)
}

fun printExponent(base: Int, exponent:Int): Int{
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    return result
}
