package bot

fun main() {
    val botName = "Aid"
    val birthYear = 2020

    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")

    println("Please, remind me your name.")
    val name = readln()
    println("What a great name you have, $name!")

    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val (r3, r5, r7) = readln().split(" ").map { it.toInt() }
    val age = (r3 * 70 + r5 * 21 + r7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")

}
