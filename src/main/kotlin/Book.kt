class Book private constructor(val id: Int, val name: String) {

    // private 을 읽어올수 있음
    companion object BookFactory : IdProvider {
        const val myBook = "new Book"
        fun create() = Book(getId(), myBook)
        override fun getId(): Int {
            return 444
        }
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    val book = Book.create()
    println("${book.id} ${book.name}")
}