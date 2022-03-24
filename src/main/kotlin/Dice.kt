class Dice {

    var number: Int = 0
    var rollAgain: Boolean = true


    fun rollDice() {
        if(this.rollAgain) {
            this.number = (1..6).random()
        }
        this.rollAgain = false
    }

    fun printDice() {
        print("$number ")
    }

    fun lockDice() {
        this.rollAgain = true
    }

}