import kotlin.math.sign

fun main(){
//    println("Please enter a number : ")
//    var input = readln().toInt()
//    if (input != null){
//        if (input.isPrime()) println("$input IS a Prime Number")
//        else println("$input is NOT a Prime Number")
//    }

    var myList = listOf<Int>(1,2,3,4,5,6)
    var productOfMyList = myList.product()
    println("Product of my list is: $productOfMyList")
}

fun Int.isPrime(): Boolean{
    for (i in 2 until this - 1){
        if (this % 2 == 0) return false
    }
    return true
}

fun List<Int>.product(): Int{
    var ans = 1
    for (i in 1 .. this.size){
        ans *= i
    }
    return ans
}