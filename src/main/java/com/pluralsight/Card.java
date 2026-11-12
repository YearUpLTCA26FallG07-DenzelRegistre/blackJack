package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean faceUp;

    public Card(String suit, String value, boolean faceUp) {
        this.suit = suit;
        this.value = value;
        this.faceUp = faceUp;
    }



    public String getSuit(){
        // only return the suit if the card is face up
        if(faceUp){
            return this.suit;
        }
        else {
            return "#";
        }
    }
    public String geValue(){

        // only return the value if the card is face up
        if(faceUp){
            return this.value;// this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
        }
        else {
            return "#";
        }
    }
    public int getPointValue(){
        // only return the value if the card is face up
        if (!faceUp) return 0;

        return switch (value) {
                case "A" -> 11;
                case "K", "Q", "J", "10" -> 10;
                case "2" -> 2;
                case "3" -> 3;
                case "4" -> 4;
                case "5" -> 5;
                case "6" -> 6;
                case "7" -> 7;
                case "8" -> 8;
                case "9" -> 9;
                default -> throw new IllegalStateException("Unexpected value: " + value);
            };
            // @todo determine point value and return it
            // A = 11
            // K, Q, J = 10
            // all numeric cards are equal to their face value

    }

    public boolean isFaceUp(){
        return faceUp;
    }
    public void flip(){
        faceUp = !faceUp;
    }
}
