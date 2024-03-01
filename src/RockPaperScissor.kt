class RockPaperScissor() {

    private var playerOne: Int = -1
    private var playerTwo: Int = -1

    private fun printOptions() {
        println(
            """
            ===============================
            GUNTING BATU KERTAS
            ===============================
            OPTION
            0. GUNTING
            1. BATU
            2. KERTAS
        """.trimIndent()
        )
    }

    private fun showResult(playerOne: Int, playerTwo: Int): String {
        return if (((playerOne + 1) % 3) == playerTwo) {
            "Player 2 menang"
        } else if (playerOne == playerTwo) {
            "Seri"
        } else {
            "Player 1 menang"
        }
    }

    private fun inputPlayerOne() {
        println("Masukkan pilihan 1 (0/1/2): ")
        playerOne = readln().toInt()
    }

    private fun inputPlayerTwo() {
        println("Masukkan pilihan 2 (0/1/2): ")
        playerTwo = readln().toInt()
    }

    fun run() {
        printOptions()
        inputPlayerOne()
        inputPlayerTwo()
        println(showResult(playerOne, playerTwo))
    }
}