fun main(){
    var a = 5
    var b = 6

    var i = 9
    var j = 9
    println(b>a || !(a>b || i>=j) && i>j)

    val simpleExpression = 3>4 || 4>3 && 4<=4
    println(simpleExpression)

    //............................................//
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    println(hardExpression)
}