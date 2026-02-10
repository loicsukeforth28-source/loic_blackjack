import java.awt.*;
/**
 * Created by chales on 11/6/2017.
 * Edits by mblair on 10/27/2025
 */
public class Snoopy {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;               //name of the hero
    public int xpos;                  //the x position
    public int ypos;                  //the y position
              //the speed of the hero in the y direction
    public int width;                 //the width of the hero image
    public int height;                //the height of the hero image
    public boolean isAlive;//a boolean to denote if the hero is alive or dead
    public Rectangle rect;
    int health;
    double successRate;
    int gravity;

    //This is a constructor that takes 3 parameters.
    // This allows us to specify the hero's name and position when we build it.
    public Snoopy(String pName, int pXpos1, int pYpos1, double psuccess) {
        name = pName;
        xpos = pXpos1;
        ypos = pYpos1;

        width = 60;
        height = 60;
        isAlive = true;
        health=100;
        successRate =psuccess;
 
    }

    public void move() { // move

    }

    public void bounce() {
        rect = new Rectangle(xpos+width/2, ypos+height/2, width, height);

    }

    public void wrap() {


    }
    public void play(){

    }

}
// if (cardNumbers > dealerNumbers) {
// sout(you win)
// }





