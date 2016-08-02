package com.theironyard.charlotte;

/**
 * Created by Blake on 8/2/16.
 */
public class Dog {
    int legs;
    int age;
    boolean alive;

    //writing constructors to set fields

    public Dog(int legs, int age, boolean alive){
        this.legs = legs;
        this.age = age;
        this.alive = alive;
    }

    // legs

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    // age

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age < 0) {
            System.err.println("Age cannot be less than 0");
        }
        else if (age > 35) {
            System.err.println("Use human years, not dog years");
        }
        else {
            this.age = age;
            }
        }


    // alive boolean

    public boolean getAlive(){
        return alive;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }
}
