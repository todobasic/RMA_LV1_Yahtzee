class Hand {

    val listDice = List(6) { Dice() }
    var numRolls: Int = 0
    var one_counter: Int = 0
    var two_counter: Int = 0
    var three_counter: Int = 0
    var four_counter: Int = 0
    var five_counter: Int = 0
    var six_counter: Int = 0


    fun start(){
        var answer: String

        continueGame()

        while(numRolls < 3){
            answer = QReroll()
            rerollProcess(answer)
            continueGame()
            }
    }

    fun QReroll(): String {
        var input: String
        println("\nDo you want to reroll any of the dice? (yes/no)")
        input = readLine()!!
        return input
    }

    fun rerollProcess(string: String){
        var answer2 = string
        if(answer2=="yes"){
            println("\nInput index number of the die you want to reroll. Input 'd' when you're done selecting.")
            answer2 = readLine()!!
            while (answer2!="d") {
                if(answer2=="1") { listDice.elementAt(0).lockDice() }
                else if(answer2=="2") { listDice.elementAt(1).lockDice() }
                else if(answer2=="3") { listDice.elementAt(2).lockDice() }
                else if(answer2=="4") { listDice.elementAt(3).lockDice() }
                else if(answer2=="5") { listDice.elementAt(4).lockDice() }
                else if(answer2=="6") { listDice.elementAt(5).lockDice() }
                answer2 = readLine()!!
            }} else {
            println("Your roll was:")
            for(d in listDice){ d.printDice()}
            System.exit(-1)
        }
    }

    fun continueGame() {
        println("Your roll:")
        for(d in listDice){
            d.rollDice()
            d.printDice()
        }
        println("")
        dieCounter()
        checkPoker()
        checkYamb()
        checkScale()
        numRolls++
    }

    fun dieCounter(){
        one_counter=0
        two_counter=0
        three_counter=0
        four_counter=0
        five_counter=0
        six_counter=0
        for(d in listDice){
            if(d.number == 1){one_counter++}
            else if(d.number == 2){two_counter++}
            else if(d.number == 3){three_counter++}
            else if(d.number == 4){four_counter++}
            else if(d.number == 5){five_counter++}
            else if(d.number == 6){six_counter++}
        }
    }

    fun checkPoker(){
        if(one_counter == 4){ println("You scored POKER!") }
        if(two_counter == 4){ println("You scored POKER!") }
        if(three_counter == 4){ println("You scored POKER!") }
        if(four_counter == 4){ println("You scored POKER!") }
        if(five_counter == 4){ println("You scored POKER!") }
        if(six_counter == 4){ println("You scored POKER!") }
    }

    fun checkYamb(){
        if(one_counter == 5 || one_counter == 6){ println("You scored YAMB!") }
        if(two_counter == 5 || two_counter == 6){ println("You scored YAMB!") }
        if(three_counter == 5 || three_counter == 6){ println("You scored YAMB!") }
        if(four_counter == 5 || four_counter == 6){ println("You scored YAMB!") }
        if(five_counter == 5 || five_counter == 6){ println("You scored YAMB!") }
        if(six_counter == 5 || six_counter == 6){ println("You scored YAMB!") }
    }

    fun checkScale(){
        if(one_counter==1 && two_counter==1 && three_counter==1 && four_counter==1 && five_counter==1 && six_counter==1){
            println("You scored SCALE!")
        }
    }


}