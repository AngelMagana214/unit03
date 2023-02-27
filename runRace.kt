import java.util.*

object Race {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Lets run a marathon!")
        val runner1: String
        val runner2: String
        val runner3: String
        val time1: Int
        val time2: Int
        val time3: Int
        val sc = Scanner(System.`in`)
        println("Enter runner 1 name: ")
        runner1 = sc.next()
        println("Enter runner 1 time in minutes: ")
        time1 = sc.nextInt()
        println("Enter runner 2 name: ")
        runner2 = sc.next()
        println("Enter runner 2 time in minutes: ")
        time2 = sc.nextInt()
        println("Enter runner 3 name: ")
        runner3 = sc.next()
        println("Enter runner 3 time in minutes: ")
        time3 = sc.nextInt()
        var x = 0
        if (time1 < time2 && time1 < time3) {
            println("Here are the race results!")
            println("$runner1 ")
            if (time2 < time3) {
                println("$runner2 ")
                x = 1
            } else {
                println("$runner3 ")
            }
            if (x == 1) println("$runner3 ") else println("$runner2 ")
        }
        x = 0
        if (time2 < time1 && time2 < time3) {
            println("Here are the race results!")
            println("$runner2 ")
            if (time1 < time3) {
                println("$runner1 ")
                x = 1
            } else {
                println("$runner3 ")
            }
            if (x == 1) println("$runner3") else println("$runner1 ")
        }
        x = 0
        if (time3 < time1 && time3 < time2) {
            println("Here are the race results!")
            println("$runner3 ")
            if (time1 < time2) {
                println("$runner1 ")
                x = 1
            } else {
                println("$runner2 ")
            }
            if (x == 1) {
                println("$runner2 ")
            } else println("$runner1 ")
        }
    }
}
