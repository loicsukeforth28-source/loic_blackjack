import java.awt.*;

import java.awt.*;
/**
 * Created by chales on 11/6/2017.
 * Edits by mblair on 10/27/2025
 */
public class Zombie {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;               //name of the hero
    public int xpos;                  //the x position
    public int ypos;                  //the y position
    //the speed of the hero in the y direction
    public int width;                 //the width of the hero image
    public int height;                //the height of the hero image
    public boolean isAlive;           //a boolean to denote if the hero is alive or dead
    public Rectangle rect;
    int health;
    double successRate;
    //This is a constructor that takes 3 parameters.
    // This allows us to specify the hero's name and position when we build it.
    public Zombie(String pName, int pXpos, int pYpos, double psuccess) {
        name = pName;
        xpos = pXpos;
        ypos = pYpos;
        width = 60;
        height = 60;
        isAlive = true;
        health=100;
        successRate =psuccess;
 
    }

    public void move() { // move

    }

    public void bounce() {

        rect = new Rectangle(xpos + width / 2, ypos + height / 2, width, height);


    }

    public void wrap() {

        if (xpos <= 0){
            xpos = 940;
        }
        if (xpos >= 940){
            ypos = 640;
        }
        if (ypos <= 0){
           ypos = 640;
        }
        if (ypos >= 640){
            ypos = 0;
        }
    }

}






