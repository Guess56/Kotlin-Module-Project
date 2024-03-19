import java.util.*

class Input {
    fun inputName () :String {
        var name : String
        while (true) {
            name = Scanner(System.`in`).nextLine().lowercase()
            if (name.lowercase().trim() == "") {
                println("Введите снова, значение не может быть пустым")
            } else {
                break
            }
        }
        return name
    }
    fun inputCommand(): Int {
        var command: Int
        while (true) {
            println("Для создания - введите \"1\"\nДля выбора - введите \"2\"\nДля выхода - введите \"3\"")
            val input = readLine() ?: ""
            if (input.isEmpty()) {
                println("Введите корректную команду")
                continue
            }
            if (input.toIntOrNull() != null) {
                command = input.toInt()
                if (command !in 1..3) {
                    println("Введите верную команду")
                } else {
                    break
                }
            } else {
                println("Введите корректную команду")
            }
        }
        return command
    }
}