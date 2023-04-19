package chapter3;

import java.util.Random;


public class PickACard {
    public static void main(String[] args) {

        String cardValue = "";
        String cardSuit = "";

        Random playingCard = new Random();
        int randomNumber = playingCard.nextInt(13) + 1;

        switch(randomNumber) {
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
                cardValue = "jack";
                break;
            case 11:
                cardValue = "queen";
                break;
            case 12:
                cardValue = "king";
                break;
            case 13:
                cardValue = "ace";
                break;

        }
        randomNumber = playingCard.nextInt(4) + 1;
        switch (randomNumber){
            case 1:
                cardSuit = "clubs";
                break;
            case 2:
                cardSuit = "diamonds";
                break;
            case 3:
                cardSuit = "hearts";
                break;
            case 4:
                cardSuit = "spades";
                break;
        }

        System.out.println("Your card is " + cardValue + " of " + cardSuit);
    }
}



