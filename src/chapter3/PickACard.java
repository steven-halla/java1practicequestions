package chapter3;

import java.util.Random;

import java.util.Random;

import java.util.Random;

import java.util.Random;

public class PickACard {
    public static void main(String[] args) {

        String cardValue = "";
        String cardSuit = "";

        Random playingCard = new Random();
        int randomNumber = playingCard.nextInt(13) + 1;

        switch (randomNumber) {
            case 1:
                cardValue = "2";
                break;
            case 2:
                cardValue = "3";
                break;
            case 3:
                cardValue = "4";
                break;
            case 4:
                cardValue = "5";
                break;
            case 5:
                cardValue = "6";
                break;
            case 6:
                cardValue = "7";
                break;
            case 7:
                cardValue = "8";
                break;
            case 8:
                cardValue = "9";
                break;
            case 9:
                cardValue = "10";
                break;
            case 10:
                cardValue = "Jack";
                break;
            case 11:
                cardValue = "Queen";
                break;
            case 12:
                cardValue = "King";
                break;
            case 13:
                cardValue = "Ace";
                break;
        }

        randomNumber = playingCard.nextInt(4) + 1;

        switch (randomNumber) {
            case 1:
                cardSuit = "Clubs";
                break;
            case 2:
                cardSuit = "Diamonds";
                break;
            case 3:
                cardSuit = "Hearts";
                break;
            case 4:
                cardSuit = "Spades";
                break;
        }

        System.out.println("Your card is " + cardValue + " of " + cardSuit);
    }
}



// we have values 2,3,4,5,6,7,8,9,10, jack, queen, king,ace
// we have four suits

// first we need a random value
//then we assign that value a suit
//three vars

//one var for value
//one var for suit
// one var that combines the two
//there are 52 cards in a deck
// include an if statement if value is higher than 10