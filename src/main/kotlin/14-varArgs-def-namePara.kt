fun main(){
    val myArr = intArrayOf(15, 25, 35, 6)
    val max = getMax(1,2,3,*myArr,4,5,6,7)
    println("The maximum number is $max")

    searchFor("Android")
    searchFor("Android", "DuckDuckGo")
    searchFor(searchEngine = "Bing", search = "how to become a android developer")

    println(alternatingSum(1,2,3,4,5,6,7))
    println(alternatingSum(3,4,5,2,1,2,3))
}

fun getMax(vararg numbers: Int): Int{
    var max= numbers[0]
    for (num in numbers){
        if (max < num) max = num
    }
    return max
}

fun searchFor(search: String, searchEngine: String = "Google"){
    println("searching for $search on $searchEngine")
}

fun alternatingSum(vararg num: Int): Int{
    var sum = 0
    var evenIndex = true
    for (n in num){
        if(evenIndex) sum += n
        else sum -= n
        evenIndex = !evenIndex
    }
    return sum
}