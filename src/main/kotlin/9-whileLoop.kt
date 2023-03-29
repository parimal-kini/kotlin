fun main(){
//    print("Enter a number : ")
//    var num = readln()?.toInt()
//    if(num != null){
//        println("let's count down from $num to 0")
//        while (num != -1){
//            println(num)
//            num--
//        }
//    }

//    print("Enter 1st number : ")
//    val num1 = readln()?.toInt()
//
//    print("Enter 2nd number : ")
//    val num2 = readln()?.toInt()
//
//    if (num1 != null && num2 != null){
//        var product = num1
//        var i = num2
//        while (i != 1){
//            product *= num1
//            i--
//        }
//        println("$num1 to the power of $num2 is $product")
//    }

    print("Enter a number: ")
    var num = readln().toInt()
    if (num != null){
        while (num > 0){
            println(num)
            num--
        }
    }

    print("Enter 1st num: ")
    var num1 = readln().toInt()

    print("Enter 2nd num: ")
    var num2 = readln().toInt()

    if (num1 !== null && num2 !== null){
        var ans = num1
        var i = num2
        while (i != 1){
            ans *= num1
            i--
        }
        println("$num1 to the power of $num2 is $ans")
    }
}