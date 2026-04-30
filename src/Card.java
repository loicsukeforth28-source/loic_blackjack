import java.awt.*;

public class Card {
    public String name;               //name of the hero
    public int xpos;                  //the x position
    public int ypos;                  //the y position
    //the speed of the hero in the y direction
    public int width;                 //the width of the hero image
    public int height;                //the height of the hero image
    public Rectangle rect;
    public int value;
    public boolean firstCard;
    public boolean secondCard;
    public boolean thirdCard;
    public Card( int pvalue) {
        value = pvalue;
        width = 60;
        height = 80;
        xpos=-100;
        ypos=-100;
    }
    public void play(int pXpos,int pYpos){
            xpos = pXpos;
            ypos = pYpos;
    }
}