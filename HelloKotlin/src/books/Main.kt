package books

const val MAX_BORROWED_BOOKS = 4

fun main() {
    val eBook = EBook("My eBook", "Me")
    eBook.readPage()
    val (x, y) = eBook.getTitleAuthor()
    val (a, b, c) = eBook.getTitleAuthorYear()
    println("Here is your book $x written by $y")
    println("Here is your book $a written by $b in $c")
    mainLibrary()

    println(eBook.canBorrow(3))
    eBook.printUrl()
    puppyGame()
}

fun mainLibrary() {
    val library = createLibrary("William Shakespeare", allBook())

    println(library)
}

fun allBook(): List<String> {
    return listOf("Hamlet", "Macbeth", "Otelo", "Romeo y Julieta", "Tito Andrónico", "Coriolano", "Sonetos")
}

fun createLibrary(author: String, titles: List<String>): Map<String, List<Book>> {
    val books: MutableList<Book> = mutableListOf()
    for (title in titles) {
        books.add(EBook(title, author))
    }
    return mapOf(author to books)
}

fun puppyGame() {
    val puppy = Puppy()
    val book = Book("Clifford", "", 100)
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println(book.getWeight())
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}