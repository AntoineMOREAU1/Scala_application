import scala.io.StdIn.readLine
import scala.util.Random


// Player Name
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")
println("\n")

println("Enter the name of player ! ")
val name_player = readLine()
println(" Let's play !!\n")
println("\n")


//val name_player = "Antoine"


val cards = List("ace ♣", "ace ♦", "ace ♥", "ace ♠",

                 "2 ♣", "2 ♦", "2 ♥", "2 ♠",
                 "3 ♣", "3 ♦", "3 ♥", "3 ♠",
                 "4 ♣", "4 ♦", "4 ♥", "4 ♠",
                 "5 ♣", "5 ♦", "5 ♥", "5 ♠",
                 "6 ♣", "6 ♦", "6 ♥", "6 ♠",
                 "7 ♣", "7 ♦", "7 ♥", "7 ♠",
                 "8 ♣", "8 ♦", "8 ♥", "8 ♠",
                 "9 ♣", "9 ♦", "9 ♥", "9 ♠",

                 "10 ♣", "10 ♦", "10 ♥", "10 ♠",
                 "Jack ♣", "Jack ♦", "Jack ♥", "Jack ♠",
                 "Queen ♣", "Queen ♦", "Queen ♥", "Queen ♠",
                 "King ♣", "King ♦", "King ♥", "King ♠"
                )


// ==================== Player ====================

object Player {

    def win_lost (player_hand: Int, dealer_hand: Int){   
    
    if (player_hand > dealer_hand && player_hand < 21 || dealer_hand >21 ) { 
        println("Congratulation you are the WINNER !!")
        println("\n")
        println("You have ",player_hand,"points") 
        println("Dealer has ",dealer_hand,"points") 
        println("\n")
        
        }

    else if (player_hand == dealer_hand) { 
        println("EQUALITY !!") 
        println("\n")
        println("You have ",player_hand,"points") 
        println("Dealer has ",dealer_hand,"points") 
        println("\n")

        }

    else if (player_hand == 21) { 
        println("Congratulation you are the WINNER and you did a BlackJack !!") 
        println("\n")
        println("You have ",player_hand,"points") 
        println("Dealer has ",dealer_hand,"points") 
        println("\n")
        }

    else {
        println( "You lost no chance :(" )
        println("\n")
        println("You have ",player_hand,"points") 
        println("Dealer has ",dealer_hand,"points") 
        println("\n")
        }
    }

    def card_name (random_first_player_card: Int): String = {
        cards(random_first_player_card) 
    }

    def card_value(random_first_player_card: Int): Int = {

        if (random_first_player_card >= 0 && random_first_player_card <= 3 ){ 
        println("You got an ACE, do you want for your ace 1 or 11 ? \n")
        var aceChoice = readLine()

        if (aceChoice == "1") { 
            1 }

        else { 
            11 }

        }

        // 2 
        else if (random_first_player_card >= 4 && random_first_player_card <= 7 ){ 
            2 }


        // 3 
        else if (random_first_player_card >= 8 && random_first_player_card <= 11 ) { 
            3 }

        // 4 
        else if (random_first_player_card >= 12 && random_first_player_card <= 15 ) { 
            4 }

        // 5 
        else if (random_first_player_card >= 16 && random_first_player_card <= 19 ) { 
            5 }

        // 6 
        else if (random_first_player_card >= 20 && random_first_player_card <= 23 ) {
            6 }

        // 7 
        else if (random_first_player_card >= 24 && random_first_player_card <= 27 ) { 
            7 }

        // 8 
        else if (random_first_player_card >= 28 && random_first_player_card <= 31 ) { 
            8 }

        // 9 
        else if (random_first_player_card >= 32 && random_first_player_card <= 35 )  { 
            9 }

        // 10 - Valet - Dame - Roi
        else if (random_first_player_card >= 36 && random_first_player_card <= 51) { 
            10 }

        else {-1}

        }

   def card_value_dealer(random_first_player_card: Int, dealer_hand: Int): Int = {

        if (random_first_player_card >= 0 && random_first_player_card <= 3 ){ 


        if (dealer_hand > 10 ) { 
            1 }

        else  { 
            11 }

        }

        // 2 
        else if (random_first_player_card >= 4 && random_first_player_card <= 7 ){ 
            2 }


        // 3 
        else if (random_first_player_card >= 8 && random_first_player_card <= 11 ) { 
            3 }

        // 4 
        else if (random_first_player_card >= 12 && random_first_player_card <= 15 ) { 
            4 }

        // 5 
        else if (random_first_player_card >= 16 && random_first_player_card <= 19 ) { 
            5 }

        // 6 
        else if (random_first_player_card >= 20 && random_first_player_card <= 23 ) {
            6 }

        // 7 
        else if (random_first_player_card >= 24 && random_first_player_card <= 27 ) { 
            7 }

        // 8 
        else if (random_first_player_card >= 28 && random_first_player_card <= 31 ) { 
            8 }

        // 9 
        else if (random_first_player_card >= 32 && random_first_player_card <= 35 )  { 
            9 }

        // 10 - Valet - Dame - Roi
        else if (random_first_player_card >= 36 && random_first_player_card <= 51) { 
            10 }

        else {-1}

        }




}



// ==================== Round 1 ====================

// ----------------First player card ----------------

//Generate first card [0,13[ (1,2,3...Queen,King)

val random_first_player_card = Random.nextInt(52) 


var value_first_player_card = -100
var name_first_player_card = ""



value_first_player_card = Player.card_value(random_first_player_card) 

name_first_player_card = Player.card_name(random_first_player_card) 



// ----------------Second player card ----------------

// Generate cards de [0,13[ (1,2,3...Queen,King)
var random_second_player_card = Random.nextInt(52) 

while (random_second_player_card == random_first_player_card) {
    random_second_player_card = Random.nextInt(52) 
}

var value_second_player_card = -100
var name_second_player_card = ""



value_second_player_card = Player.card_value(random_second_player_card) 

name_second_player_card = Player.card_name(random_second_player_card) 

var player_hand = 0
var dealer_hand = 0
// ----------------First dealer card ----------------

//Generate first card [0,13[ (1,2,3...Queen,King)

var random_first_dealer_card = Random.nextInt(52) 

while ( random_first_dealer_card== random_first_player_card || random_first_dealer_card== random_second_player_card) {
    random_first_dealer_card = Random.nextInt(52) 
}


var value_first_dealer_card = -100
var name_first_dealer_card = ""



value_first_dealer_card = Player.card_value_dealer(random_first_dealer_card, dealer_hand) 

name_first_dealer_card = Player.card_name(random_first_dealer_card) 

dealer_hand = value_first_dealer_card 


// ----------------Second dealer card ----------------

// Generate cards de [0,13[ (1,2,3...Queen,King)
var random_second_dealer_card = Random.nextInt(52) 

while (random_second_dealer_card == random_first_player_card || random_second_dealer_card == random_second_player_card  || random_second_dealer_card == random_first_dealer_card ) {
    random_second_dealer_card = Random.nextInt(52) 
}

var value_second_dealer_card = -100
var name_second_dealer_card = ""



value_second_dealer_card = Player.card_value_dealer(random_second_dealer_card, dealer_hand) 

name_second_dealer_card = Player.card_name(random_second_dealer_card) 

// --------------Display round 1------------------
println("\n")
println("------------------ROUND 1------------------")

println("Antoine : \n")

println("Your first card is", name_first_player_card )
println("Your second card is", name_second_player_card )


println("\n")
println("Dealer : \n")

println("Dealer's first card is" , name_first_dealer_card )
println("\n")


player_hand = value_first_player_card + value_second_player_card
dealer_hand = value_first_dealer_card + value_second_dealer_card




// ==================== Round 2 ====================

println("Do you want another card ? (yes/no) : \n")
val want_third_card = readLine()


    // ----------------Thrid dealer card ----------------

var nb_dealer_card = 2
var nb_player_card = 2

var random_third_dealer_card = 0
var value_third_dealer_card = -100
var name_third_dealer_card = ""

if (dealer_hand<16){

    nb_dealer_card = 3

    // Generate cards de [0,13[ (1,2,3...Queen,King)
    random_third_dealer_card = Random.nextInt(52) 

    while (random_third_dealer_card == random_first_player_card || random_third_dealer_card == random_second_player_card || random_third_dealer_card == random_first_dealer_card || random_third_dealer_card == random_second_dealer_card) {
        random_third_dealer_card = Random.nextInt(52) 
    }


    value_third_dealer_card = Player.card_value_dealer(random_third_dealer_card, dealer_hand) 
    name_third_dealer_card = Player.card_name(random_third_dealer_card) 

    dealer_hand = value_first_dealer_card + value_second_dealer_card + value_third_dealer_card

}


    // ----------------Thrid player card ----------------


var random_third_player_card = 0
var value_third_player_card = -100
var name_third_player_card = ""
var end = "" 

if (want_third_card == "yes") { 
    
    nb_player_card = 3

    // Generate cards de [0,13[ (1,2,3...Queen,King)
    random_third_player_card = Random.nextInt(52) 

    while (random_third_player_card == random_first_player_card || random_third_player_card == random_second_player_card || random_third_player_card == random_first_dealer_card || random_third_player_card == random_second_dealer_card && random_third_player_card == random_third_dealer_card) {
        random_third_player_card = Random.nextInt(52) 
    }

    value_third_player_card = Player.card_value(random_third_player_card) 
    name_third_player_card = Player.card_name(random_third_player_card) 

    player_hand = value_first_player_card + value_second_player_card + value_third_player_card



// --------------Display round 2------------------
    println("\n")
    println("------------------ROUND 2------------------")

    println("Antoine : \n")

    println("Your first card is", name_first_player_card )
    println("Your second card is", name_second_player_card )
    println("Your third card is", name_third_player_card )



    println("\n")
    println("Dealer : \n")

    println("Dealer's first card is" , name_first_dealer_card )
    println("\n")


}

else { 
    end = "ok"


    println("\n")
    println("------------------ RESULT ------------------")

    println("Antoine : \n")

    println("Your first card is", name_first_player_card )
    println("Your second card is", name_second_player_card )



    if (nb_player_card == 3 ){

    println("Your third card is", name_third_player_card )
    }


    println("\n")
    println("Dealer : \n")

    println("Dealer's first card is" , name_first_dealer_card )
    println("Dealer's second card is" , name_second_dealer_card )

    if (nb_dealer_card == 3 ){

        println("Dealer's third card is" ,name_third_dealer_card)
    }


    println("\n")


    Player.win_lost(player_hand,dealer_hand)
}



    // ==================== Round 3 ====================


    // ----------------Fourth dealer card ----------------

var random_fourth_dealer_card = 0
var value_fourth_dealer_card = -100
var name_fourth_dealer_card = ""


if (dealer_hand<16){

    nb_dealer_card = 4

    // Generate cards de [0,13[ (1,2,3...Queen,King)
    random_fourth_dealer_card = Random.nextInt(52) 

    while (random_fourth_dealer_card == random_first_player_card || random_fourth_dealer_card == random_second_player_card ||random_fourth_dealer_card == random_third_player_card || random_fourth_dealer_card == random_first_dealer_card || random_fourth_dealer_card == random_second_dealer_card || random_fourth_dealer_card == random_third_dealer_card ) {
        random_fourth_dealer_card = Random.nextInt(52) 
    }

    value_fourth_dealer_card = Player.card_value_dealer(random_fourth_dealer_card, dealer_hand) 
    name_fourth_dealer_card = Player.card_name(random_fourth_dealer_card) 

    dealer_hand = value_first_dealer_card + value_second_dealer_card + value_third_dealer_card + value_fourth_dealer_card


}



    // ---------------- Fourth player card ----------------

var want_fourth_card = ""

if (nb_player_card == 3){
    println("Do you want another card ? (yes/no) : \n")
    want_fourth_card = readLine()

}


var random_fourth_player_card = 0
var value_fourth_player_card = -100
var name_fourth_player_card = ""

if (want_fourth_card == "yes"){

    nb_player_card = 4

    // Generate cards de [0,13[ (1,2,3...Queen,King)
    random_fourth_player_card = Random.nextInt(52) 

    while (random_fourth_player_card == random_first_player_card || random_fourth_player_card == random_second_player_card || random_fourth_player_card == random_third_player_card || random_fourth_player_card == random_first_dealer_card || random_fourth_player_card == random_second_dealer_card || random_fourth_player_card == random_third_dealer_card) {
        random_fourth_player_card = Random.nextInt(52) 
    }

    value_fourth_player_card = Player.card_value(random_fourth_player_card) 
    name_fourth_player_card = Player.card_name(random_fourth_player_card) 

    player_hand = value_first_player_card + value_second_player_card + value_third_player_card + value_fourth_player_card


// --------------Display round 3------------------

    println("\n")
    println("------------------ RESULT ------------------")

    println("Antoine : \n")

    println("Your first card is", name_first_player_card )
    println("Your second card is", name_second_player_card )
    println("Your third card is", name_third_player_card )
    println("Your fourth card is", name_fourth_player_card )


    println("\n")
    println("Dealer : \n")

    println("Dealer's first card is" , name_first_dealer_card )
    println("Dealer's second card is" , name_second_dealer_card )

    if (nb_dealer_card >= 3 ){

        println("Dealer's third card is" ,name_third_dealer_card)
    }

    if (nb_dealer_card == 4 ){
        println("Dealer's third card is" ,name_third_dealer_card)
        println("Dealer's third card is" ,name_fourth_dealer_card)
    }
    println("\n")

    
    Player.win_lost(player_hand,dealer_hand)


}


else{
    if( end != "ok"){
        
    println("\n")
    println("------------------ RESULT ------------------")

    println("Antoine : \n")

    println("Your first card is", name_first_player_card )
    println("Your second card is", name_second_player_card )
    println("Your third card is", name_third_player_card )


    println("\n")
    println("Dealer : \n")

    println("Dealer's first card is" , name_first_dealer_card )
    println("Dealer's second card is" , name_second_dealer_card )

    if (nb_dealer_card >= 3 ){

        println("Dealer's third card is" ,name_third_dealer_card)
    }

    if (nb_dealer_card == 4 ){
        println("Dealer's fourth card is" ,name_fourth_dealer_card)
    }
    println("\n")

    
    Player.win_lost(player_hand,dealer_hand)

    }   
}





