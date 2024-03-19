class CreateItems {
    var input = Input()
    fun createArchive () : MutableMap<String, MutableMap<String,String>> {
        println("Введите название архива")
        val nameArchive = input.inputName()
        val archive : MutableMap<String, MutableMap<String,String>> = mutableMapOf(nameArchive to mutableMapOf())
        return archive
    }
    fun createNote () : String {
        println("Введите название заметки")
        val nameNote = input.inputName()
        return nameNote
    }
    fun createTextNote (): String {
        println("Введите текст заметки")
        val text = input.inputName()
        return  text
    }
}