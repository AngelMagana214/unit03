import java.util.*

fun main(args: Array<String>) {
    println("What's up homie! Let's see if the date you pick is *magic*")
    val month: Int
    val day: Int
    val year: Int
    val magicDate: String
    val input = Scanner(System.`in`)
    println("Enter Month as a number: ")
    day = input.nextInt()
    println("Day: ")
    month = input.nextInt()
    println("Year: ")
    year = input.nextInt()
    magicDate = if (day * month == year) {
        "That date is magic, homeboy!."
    } else "That date isn't magical, sorry boss."
    println(magicDate)
