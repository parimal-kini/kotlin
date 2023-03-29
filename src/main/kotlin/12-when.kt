fun main(){
    println("Where are you from : ")
    var country = readln()

    when(country){
        "India" -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Colombia", "Mexico" -> println("Hola")
        "Russia" -> println("Privet")
        else -> println("I don't know that")
    }
}