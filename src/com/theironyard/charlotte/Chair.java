package com.theironyard.charlotte;

/**
 * Created by Blake on 8/2/16.
 */
public class Chair {
    String color;
    boolean rolls;
    boolean armrest;

    //constructor

    public Chair(String color, boolean rolls, boolean armrest) {
        this.color = color;
        this.rolls = rolls;
        this.armrest = armrest;
    }

    //color
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //rolls

    public boolean getRolls(){
        return rolls;
    }

    public void setRolls(boolean rolls){
        this.rolls = rolls;
    }

    //armrest

    public boolean getArmrest(){
        return armrest;
    }

    public void setArmrest(boolean armrest){
        this.armrest = armrest;
    }

}