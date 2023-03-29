fun main(){
    print("Enter your age : ")
    val age = readln()?.toInt()

    if (age != null) {
        if(age < 18)
            println("You are not an adult")
        else if(age >= 18 && age <= 60)
            println("You are an adult")
        else if(age >= 61 && age <= 80)
            println("You are old")
        else
            println("You are really really old")
    }
}