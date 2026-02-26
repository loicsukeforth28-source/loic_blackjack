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
    boolean Ace11;




    public Card( int pvalue) {
        value = pvalue;
        //create a flag to be either 1 or 11
       // if (Ace11 = true){
       //     value = 11;
      //  }
        width = 60;
        height = 80;

    }
    public void play(int pXpos,int pYpos){
            xpos = pXpos;
            ypos = pYpos;




    }
}