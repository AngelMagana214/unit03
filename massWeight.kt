import java.util.*

fun main(args: Array<String>) {
    println("\nIt's Science Time, buddy-boy! Lets calculate weight from an object's mass")
    val Mass: Int

    val Weight: Double


    val input = Scanner(System.`in`)

    println("\nEnter your object mass: ")
    Mass = input.nextInt()


    Weight = (Mass * 9.8 ).toDouble()

    if (Weight <= 10){
        println("Your object is too light! You scared to lift weights or something?")
    }
    else if (Weight> 10 && Weight <= 1000){
        println("Your object weight is optimal.")
    }
    else {
        println("Your object weight is too massive! You'll give yourself a hernia, kid!")
    }

}
