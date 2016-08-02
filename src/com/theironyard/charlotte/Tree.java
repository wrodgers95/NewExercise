package com.theironyard.charlotte;

/**
 * Created by Blake on 8/2/16.
 */

public class Tree {
    int height;
    int width;
    String color;


    //constructor

    public Tree(int height, int width, String color){
        this.height = height;
        this.width = width;
        this.color = color;
    }

    //height

    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
        if (height <= 0){
            System.err.println("Height must be greater than 0");
        }
        else {
            this.height = height;
        }
    }

    //width

    public int getWidth(){
        return height;
    }

    public void setWidth(int width){
    this.width = width;
    }

    //color

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}