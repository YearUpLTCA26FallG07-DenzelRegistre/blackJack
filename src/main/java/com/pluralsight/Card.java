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
        if(faceUp){
            return this.suit;
        }
        else {
            return "#";
        }
    }
    public String geValue(){
        if(faceUp){
            return this.value;
        }
        else {
            return "#";
        }
    }
    public int getPointValue(){
        if (faceUp){

        }
    }
}
