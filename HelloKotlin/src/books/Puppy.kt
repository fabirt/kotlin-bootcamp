package books

import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        val pagesToRemove = Random.nextInt(12)
        book.tornPages(pagesToRemove)
    }
}