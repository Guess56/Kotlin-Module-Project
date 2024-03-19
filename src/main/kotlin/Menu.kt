class Menu {
    var createItems = CreateItems()
    var input = Input()
    var apply = Apply()
    fun menu (archive : MutableMap<String, MutableMap<String,String>>) {

        while (true) {
            println("Меню архивов")
            val commandArchive = input.inputCommand()
            var nameArchive:String
            when (commandArchive) {
                1 -> archive.putAll(createItems.createArchive())

                2-> {
                    if (archive.isNotEmpty()) {
                        nameArchive = apply.applyArchive(archive)
                        menu2(archive, nameArchive.lowercase())
                    } else println("Список архивов пуст")
                }
                3 -> return
            }
        }
    }

    fun menu2 (archive : MutableMap<String, MutableMap<String,String>>, nameArchive : String) {
        var noteKey : String
        var noteText: String
        var applyNote : String
        val note : MutableMap<String,String> = mutableMapOf()
        while (true) {
            println("Меню заметки")
            val commandNote = input.inputCommand()
            when (commandNote) {
                1 -> {
                    noteKey = createItems.createNote()
                    noteText = createItems.createTextNote()
                    note.put(noteKey,noteText)
                    archive[nameArchive.lowercase()]!!.put(noteKey,noteText)
                }
                2-> {
                    if ((archive[nameArchive.lowercase()]!!.isNotEmpty())) {
                        applyNote = apply.applyNote(note)
                        println(note[applyNote])
                    } else println("Список заметок пуст")
                }
                3 -> return
            }
        }
    }
}

