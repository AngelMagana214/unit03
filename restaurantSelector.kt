import java.util.*

object Restaurents {
    @JvmStatic
    fun main(args: Array<String>) {
        val choice = arrayOf("", "", "")
        val sc = Scanner(System.`in`)
        println("Is anyone in your party vegetarian?")
        choice[0] = sc.nextLine()
        println("Is anyone in your party a vegan?")
        choice[1] = sc.nextLine()
        println("Is anyone in your party gluten free?")
        choice[2] = sc.nextLine()
        println("Ok, since you're being picky! Here are your restaurant choices:")
        if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Corner Café")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Corner Café")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Main Street Pizza Company")
            println("Corner Café")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Corner Café")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("yes", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Main Street Pizza Company")
            println("Corner Café")
            println("Mama's fine Italian")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("yes", ignoreCase = true)
        ) {
            println("Main Street Pizza Company")
            println("Corner Café")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "yes",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Corner Café")
            println("The Chef’s Kitchen")
        } else if (choice[0].equals("no", ignoreCase = true) && choice[1].equals(
                "no",
                ignoreCase = true
            ) && choice[2].equals("no", ignoreCase = true)
        ) {
            println("Joe's gourmet burgers")
            println("Main Street Pizza Company")
            println("Corner Café")
            println("Mama's fine Italian")
            println("The Chef’s Kitchen")
        }
    }
}
