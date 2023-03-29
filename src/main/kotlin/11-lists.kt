fun main(){
    println("Please enter 5 numbers : ")
    var myList = mutableListOf<Int>()
    for (i in 1..5){
        val num = readln()?.toInt()
        if(num != null)
            myList.add(num)
    }
    println("The numbers in reversed order are: ")
    for (i in myList.size-1 downTo 0){
        println(myList[i])
    }

//    println("Please enter a number greater than 1 : ")
//    var num = readln()?.toInt()
//    var myList = mutableListOf<Int>()
//    var first = 0
//    var second = 1
//    var next = 0
////    println("$first \n $second")
//    myList.add(first)
//    myList.add(second)
//    for(i in 2 until  num!!){
//        next = first + second
////        println(next)
//        myList.add(next)
//        first = second
//        second = next
//    }
//    println(myList)
}