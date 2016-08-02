package com.theironyard.charlotte;

/**
 * Created by Blake on 8/2/16.
 */
public class Building {
    int stories;
    String color;
    boolean hasElevator;
    int elevators;


    //constructor

    public Building(int stories, String color, boolean hasElevator, int elevators) {
        this.stories = stories;
        this.color = color;
        this.hasElevator = hasElevator;
        this.elevators = elevators;
    }


    //stories

    public int getStories(){
        return stories;
    }

    public void setStories(int stories) {
        if (stories <= 1) {
            System.err.println("Must be at least 1");
        }
        else {
            this.stories = stories;
        }
    }

    //color

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }


    // hasElevator boolean

    public boolean getHasElevator(){
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator){
        this.hasElevator = hasElevator;
    }


    //elevators

    public int getElevators(){
        return elevators;
    }
    public void setElevators(int elevators){
        if (hasElevator == true) {
            this.elevators = elevators;
        }
        else if (elevators <= 0){
            System.out.println("Building has no elevators");
        }
        else {
            System.err.println("Building has no elevators");
        }
    }
}
