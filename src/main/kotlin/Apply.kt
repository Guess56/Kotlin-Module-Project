import java.util.*

class Apply {
    fun applyArchive (archive : MutableMap<String, MutableMap<String,String>>) : String {
        var nameArchive =""
        archive.forEach { index, elem -> println(index) }
        var flag = true
        while (flag) {
            println("Введите название нужного архива из списка")
            val name = Scanner(System.`in`).nextLine().lowercase().trim()

            if (!archive.keys.toString().contains(name.lowercase().trim())) {
                println("Введите корректное название")
            } else {
                for ( key in archive.keys ) {
                    if (name.lowercase() == key.lowercase()) {
                        nameArchive = name.lowercase()
                        flag = false
                    }
                }
            }
        }
        return nameArchive.lowercase()
    }
    fun applyNote (note : MutableMap<String,String>) : String {
        var nameNote =""
        note.forEach { index, elem -> println(index) }
        var flag = true
        while (flag) {
            println("Введите название нужной заметки из списка")
            val name = Scanner(System.`in`).nextLine().lowercase().trim()
            if (!note.keys.toString().contains(name.lowercase())) {
                println("Введите корректное название")
            } else {
                for (key in note.keys) {
                    if (name.lowercase() == key.lowercase()) {
                        nameNote = name.lowercase()
                        flag = false
                    }
                }
            }
        }
        return nameNote.lowercase()
    }
}