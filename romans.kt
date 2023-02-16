    fun main(args: Array<String>) {
        print("Enter a number between 1-10:")
        var enteredNumber = readLine()


        when (enteredNumber) {
            1.toString() -> println("I")
            2.toString() -> println("II")
            3.toString() -> println("III")
            4.toString() -> println("IV")
            5.toString() -> println("V")
            6.toString() -> println("VI")
            7.toString() -> println("VII")
            8.toString() -> println("VIII")
            9.toString() -> println("IX")
            10.toString() -> println("X")
            else -> println("ERROR!!! Follow the rules, fool!")
        }
    }
