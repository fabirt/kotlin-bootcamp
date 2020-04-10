package books

/**
 * Returns the weight of the book
 */
fun Book.getWeight():Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0
