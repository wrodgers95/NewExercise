package com.theironyard.charlotte;

/**
 * Created by Blake on 8/2/16.
 */
public class Car {
    int rimSize;
    String color;
    boolean convertible;

    public Car(int rimSize, String color, boolean convertible) {
        this.rimSize = rimSize;
        this.color = color;
        this.convertible = convertible;
    }

    //rimSize

    public int getRimSize() {
        return rimSize;
    }

    public void setRimSize(int rimSize){
        if (rimSize < 1){
            System.err.println("Rim Size must be over 1");
        }
        else {
            this.rimSize = rimSize;
        }
    }

    // color

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //convertible

    public boolean getConvertible(){
        return convertible;
    }

    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }
}