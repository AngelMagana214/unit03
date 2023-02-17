import java.util.*

object NameOrganizer {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Lets organize some names in alphabetical order like we have OCD!!!")
        val scanner = Scanner(System.`in`)
        var name1: String
        var name2: String
        var name3: String
        print("\nEnter first name: ")
        name1 = scanner.next()
        print("\nEnter second name: ")
        name2 = scanner.next()
        print("\nEnter third name: ")
        name3 = scanner.next()
        name1 = name1.capitalize(Locale.getDefault())
        name2 = name2.capitalize(Locale.getDefault())
        name3 = name3.capitalize(Locale.getDefault())
        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0) {
            println(name1)
            if (name2.compareTo(name3) < 0) {
                println(name2)
                println(name3)
            } else {
                println(name3)
                println(name2)
            }
        } else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0) {
            println(name2)
            if (name1.compareTo(name3) < 0) {
                println(name1)
                println(name3)
            } else {
                println(name3)
                println(name1)
            }
        } else {
            println(name3)
            if (name1.compareTo(name2) < 0) {
                println(name1)
                println(name2)
            } else {
                println(name2)
                println(name1)
            }
        }
    }
}
