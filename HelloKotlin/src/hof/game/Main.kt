package hof.game

fun main() {
    val game = Game()
    /*
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println(game.path)
    */
    var isPlaying: Boolean = true
    while (isPlaying) {
        print("(Press c to close)\nEnter a direction: n/s/e/w: ")
        val direction = readLine()
        if (direction == "c") isPlaying = false
        game.makeMove(direction)
    }
}