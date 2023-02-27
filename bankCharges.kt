import java.util.*

internal object BankCharges {
    @JvmStatic
    fun main(args: Array<String>) {
        val numChecks: Int
        val totalFeeForChecks: Double
        val totalFee: Double
        val baseCharge = 10.0

        print("How many checks did you write this month? ")
        numChecks = Scanner(System.`in`).nextInt()
        totalFeeForChecks =
            if (numChecks < 20) numChecks * .10 else if (numChecks < 40) 19 * .10 + (numChecks - 19) * 0.08 else if (numChecks < 60) 19 * .10 + 20 * .08 + (numChecks - 39) * 0.06 else 19 * .10 + 20 * .08 + 20 * .06 + (numChecks - 59) * 0.04
        totalFee = totalFeeForChecks + baseCharge


        println("Your charges are as follows:")
        println("Totalfee = $totalFee")
        println("Total base charge = $baseCharge")
       
        println("Total fee for checks = ")
        if (numChecks < 20) println("Checks charged at 10 cents fee is: $numChecks") else {
            println("Checks charged at 10 cents fee is: 19.")
            if (numChecks < 40) println("Checks charged at 8 cents fee is: " + (numChecks - 19)) else {
                println("Checks charged at 8 cents fee is: 20.")
                if (numChecks < 60) println("Checks charged at 6 cents fee is: " + (numChecks - 39)) else {
                    println("Checks charged at 6 cents fee is: 20.")
                    println("Checks charged at 4 cents fee is: " + (numChecks - 59))
                }
            }
        }
    }
}
