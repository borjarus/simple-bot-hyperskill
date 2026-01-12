package bot

fun greet(botName: String, birthYear: Int) {
    println("Hello! My name is $botName.")
    println("I was created in $birthYear.")
}

fun remindName(){
    println("Please, remind me your name.")
    val name = readln()
    println("What a great name you have, $name!")
}

fun guessAge(){
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val (r3, r5, r7) = readln().split(" ").map { it.toInt() }
    val age = (r3 * 70 + r5 * 21 + r7 * 15) % 105

    println("Your age is $age; that's a good time to start programming!")
}

fun countDown(){
    println("Now I will prove to you that I can count to any number you want.")

    val n = readln().toInt()
    (0..n).forEach { println("$it!") }
}

fun test(){
    val question = "Why do we use methods?"
    val options = listOf(
        "1. To repeat a statement multiple times.",
        "2. To decompose a program into several small subroutines.",
        "3. To determine the execution time of a program.",
        "4. To interrupt the execution of a program."
    )
    val correctAnswer = 2

    println("\nLet's test your programming knowledge.")
    println("$question?")
    options.forEach{ println(it) }

    generateSequence { readln().toInt() }
        .takeWhile { it != correctAnswer }
        .forEach{ println("Please, try again.") }

    println("Congratulations, have a nice day!")

}

fun main() {
    val botName = "Aid"
    val birthYear = 2020

    greet(botName, birthYear)
    remindName()
    guessAge()
    countDown()
    test()
}