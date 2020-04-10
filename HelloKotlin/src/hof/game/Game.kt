package hof.game

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)
    private val north = { path.add(Directions.NORTH) }
    private val south = { path.add(Directions.SOUTH) }
    private val east = { path.add(Directions.EAST) }
    private val west = { path.add(Directions.WEST) }
    private val end = {
        path.add(Directions.END)
        println("GAME OVER: $path")
        path.clear()
        false
    }

    private fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(direction: String?) {
        when(direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}