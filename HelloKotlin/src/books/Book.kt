package books

open class Book(val title: String, val author: String, var pages: Int = 0) {
    private var currentPage: Int = 0

    companion object {
        const val LIBRARY_URL = "http://library.com/api"
    }

    open fun readPage() {
        currentPage++
    }

    open fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    open fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, 2020)
    }

    fun canBorrow(n: Int):Boolean {
        return  n < MAX_BORROWED_BOOKS
    }

    fun printUrl() {
        val url = "${Constants.BASE_URL}/$title.html"
        println(url)
    }
}



