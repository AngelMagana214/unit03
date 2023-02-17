import java.util.*

fun main(args: Array<String>) {
    println("Dont be shy! Lets check that weight and see how heavy you are.")
    val Weight: Int
    val Height: Int
    val bmi: Double


    val input = Scanner(System.`in`)

    println("Enter your weight as a number: ")
    Weight = input.nextInt()
    println("Enter your height in inches: ")
    Height = input.nextInt()

    bmi = (Weight * 703 / (Height * Height)).toDouble()

    if (bmi <= 18.5){
        println("You are underweight. Eat a sandwich, kid!")
    }
    else if (bmi> 18.5 && bmi <= 25){
        println("Your weight is optimal. Keep doing what you're doing.")
    }
    else {
        println("You are overweight. Hit the gym tubby!")
    }

}
