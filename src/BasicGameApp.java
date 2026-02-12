//Basic Game Application
// Basic Object, Image, Movement
// Threaded

//*******************************************************************************
//Import Section
//Add Java libraries needed for the game
//import java.awt.Canvas;

//Graphics Libraries
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

//*******************************************************************************

public class BasicGameApp implements Runnable, KeyListener {

    //Variable Definition Section
    //Declare the variables used in the program
    //You can set their initial values too

    //Sets the width and height of the program window
    final int WIDTH = 1000;
    final int HEIGHT = 700;

    //Declare the variables needed for the graphics
    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;

    public BufferStrategy bufferStrategy;


    Image aceOfSpadesImage;
    Image aceOfClubsImage;
    Image aceOfHeartsImage;
    Image aceOfDiamondsImage;
    Image twoOfClubsImage;
    Image twoOfSpadesImage;
    Image twoOfHeartsImage;
    Image twoOfDiamondsImage;
    Image threeOfClubsImage;
    Image threeOfSpadesImage;
    Image threeOfHeartsImage;
    Image threeOfDiamondsImage;
    Image fourOfClubsImage;
    Image fourOfSpadesImage;
    Image fourOfHeartsImage;
    Image fourOfDiamondsImage;
    Image fiveOfClubsImage;
    Image fiveOfHeartsImage;
    Image fiveOfDiamondsImage;
    Image fiveOfSpadesImage;
    Image sixOfSpadesImage;
    Image sixOfClubsImage;
    Image sixOfHeartsImage;
    Image sixOfDiamondsImage;
    Image sevenOfSpadesImage;
    Image sevenOfClubsImage;
    Image sevenOfHeartsImage;
    Image sevenOfDiamondsImage;
    Image eightOfSpadesImage;
    Image eightOfClubsImage;
    Image eightOfHeartsImage;
    Image eightOfDiamondsImage;
    Image nineOfSpadesImage;
    Image nineOfClubsImage;
    Image nineOfHeartsImage;
    Image nineOfDiamondsImage;
    Image tenOfSpadesImage;
    Image tenOfClubsImage;
    Image tenOfHeartsImage;
    Image tenOfDiamondsImage;
    Image jackOfSpadesImage;
    Image jackOfClubsImage;
    Image jackOfHeartsImage;
    Image jackOfDiamondsImage;
    Image queenOfSpadesImage;
    Image queenOfClubsImage;
    Image queenOfHeartsImage;
    Image queenOfDiamondsImage;
    Image kingOfSpadesImage;
    Image kingOfClubsImage;
    Image kingOfHeartsImage;
    Image kingOfDiamondsImage;
    Card aceOfSpades;
    Card aceOfClubs;
    Card aceOfHearts;
    Card aceOfDiamonds;
    Card twoOfClubs;
    Card twoOfSpades;
    Card twoOfHearts;
    Card twoOfDiamonds;
    Card threeOfClubs;
    Card threeOfSpades;
    Card threeOfHearts;
    Card threeOfDiamonds;
    Card fourOfClubs;
    Card fourOfSpades;
    Card fourOfHearts;
    Card fourOfDiamonds;
    Card fiveOfClubs;
    Card fiveOfHearts;
    Card fiveOfDiamonds;
    Card fiveOfSpades;
    Card sixOfSpades;
    Card sixOfClubs;
    Card sixOfHearts;
    Card sixOfDiamonds;
    Card sevenOfSpades;
    Card sevenOfClubs;
    Card sevenOfHearts;
    Card sevenOfDiamonds;
    Card eightOfSpades;
    Card eightOfClubs;
    Card eightOfHearts;
    Card eightOfDiamonds;
    Card nineOfSpades;
    Card nineOfClubs;
    Card nineOfHearts;
    Card nineOfDiamonds;
    Card tenOfSpades;
    Card tenOfClubs;
    Card tenOfHearts;
    Card tenOfDiamonds;
    Card jackOfSpades;
    Card jackOfClubs;
    Card jackOfHearts;
    Card jackOfDiamonds;
    Card queenOfSpades;
    Card queenOfClubs;
    Card queenOfHearts;
    Card queenOfDiamonds;
    Card kingOfSpades;
    Card kingOfClubs;
    Card kingOfHearts;
    Card kingOfDiamonds;


    public int cardSum;
    public boolean win;
    int firstXpos;
    Card [] cardarray;



    // Main method definition
    // This is the code that runs first and automatically
    public static void main(String[] args) {
        BasicGameApp ex = new BasicGameApp();   //creates a new instance of the game
        new Thread(ex).start();                 //creates a threads & starts up the code in the run( ) method
    }


    // This section is the setup portion of the program
    // Initialize your variables and construct your program objects here.
    public BasicGameApp() {// BasicGameApp constructor

        setUpGraphics();
        Card [] cardarray = new Card[52];
        for (int c=0; c<4; c++){
            cardarray[c] = new Card(100,100,1);
        }
        for (int c=4; c<8; c++){
            cardarray[c] = new Card(100,100,2);
        }
        for (int c=8; c<12; c++){
            cardarray[c] = new Card(100,100,3);
        }
        for (int c=12; c<16; c++){
            cardarray[c] = new Card(100,100,4);
        }
        for (int c=16; c<20; c++){
            cardarray[c] = new Card(100,100,5);
        }
        for (int c=20; c<24; c++){
            cardarray[c] = new Card(100,100,6);
        }
        for (int c=24; c<28; c++){
            cardarray[c] = new Card(100,100,7);
        }
        for (int c=28; c<32; c++){
            cardarray[c] = new Card(100,100,8);
        }
        for (int c=32; c<36; c++){
            cardarray[c] = new Card(100,100,9);
        }
        for (int c=36; c<52; c++){
            cardarray[c] = new Card(100,100,10);
        }
        aceOfSpades = new Card(100,100, 1);
        aceOfClubs = new Card(100,100, 1);
        aceOfHearts = new Card(100,100, 1);
        aceOfDiamonds = new Card(100,100, 1);
        twoOfSpades = new Card(100,100, 2);
        twoOfClubs = new Card(100,100, 2);
        twoOfHearts = new Card(100,100, 2);
        twoOfDiamonds = new Card(100,100, 2);
        threeOfSpades = new Card(100,100, 3);
        threeOfClubs = new Card(100,100, 3);
        threeOfHearts = new Card(100,100, 3);
        threeOfDiamonds = new Card(100,100, 3);
        fourOfSpades = new Card(100,100, 4);
        fourOfClubs = new Card(100,100, 4);
        fourOfHearts = new Card(100,100, 4);
        fourOfDiamonds = new Card(100,100, 4);
        fiveOfSpades = new Card(100,100, 5);
        fiveOfClubs = new Card(100,100, 5);
        fiveOfHearts = new Card(100,100, 5);
        fiveOfDiamonds = new Card(100,100, 5);
        sixOfSpades = new Card(100,100, 6);
        sixOfClubs = new Card(100,100, 6);
        sixOfHearts = new Card(100,100, 6);
        sixOfDiamonds = new Card(100,100, 6);
        sevenOfSpades = new Card(100,100, 7);
        sevenOfClubs = new Card(100,100, 7);
        sevenOfHearts = new Card(100,100, 7);
        sevenOfDiamonds = new Card(100,100, 7);
        eightOfSpades = new Card(100,100, 8);
        eightOfClubs = new Card(100,100, 8);
        eightOfHearts = new Card(100,100, 8);
        eightOfDiamonds = new Card(100,100, 8);
        nineOfSpades = new Card(100,100, 9);
        nineOfClubs = new Card(100,100, 9);
        nineOfHearts = new Card(100,100, 9);
        nineOfDiamonds = new Card(100,100, 9);
        tenOfSpades = new Card(100,100, 10);
        tenOfClubs = new Card(100,100, 10);
        tenOfHearts = new Card(100,100, 10);
        tenOfDiamonds = new Card(100,100, 10);
        jackOfSpades = new Card(100,100, 10);
        jackOfClubs = new Card(100,100, 10);
        jackOfHearts = new Card(100,100, 10);
        jackOfDiamonds = new Card(100,100, 10);
        queenOfSpades = new Card(100,100, 10);
        queenOfClubs = new Card(100,100, 10);
        queenOfHearts = new Card(100,100, 10);
        queenOfDiamonds = new Card(100,100, 10);
        kingOfSpades = new Card(100,100, 10);
        kingOfClubs = new Card(100,100, 10);
        kingOfHearts = new Card(100,100, 10);
        kingOfDiamonds = new Card(100,100, 10);



        aceOfSpadesImage = Toolkit.getDefaultToolkit().getImage("AceSpades.png");
        aceOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        aceOfClubsImage = Toolkit.getDefaultToolkit().getImage("AceClubs.png");
        aceOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        twoOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        twoOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        twoOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        twoOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        threeOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        threeOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        threeOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        threeOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        fourOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        fourOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        fourOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        fourOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        fiveOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        fiveOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        fiveOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        fiveOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        sixOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        sixOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        sixOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        sixOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        sevenOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        sevenOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        sevenOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        sevenOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        eightOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        eightOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        eightOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        eightOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        nineOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        nineOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        nineOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        nineOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        tenOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        tenOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        tenOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        tenOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        jackOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        jackOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        jackOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        jackOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        queenOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        queenOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        queenOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        queenOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        kingOfSpadesImage = Toolkit.getDefaultToolkit().getImage(".png");
        kingOfHeartsImage = Toolkit.getDefaultToolkit().getImage(".png");
        kingOfClubsImage = Toolkit.getDefaultToolkit().getImage(".png");
        kingOfDiamondsImage = Toolkit.getDefaultToolkit().getImage(".png");
        run();

    } // end BasicGameApp constructor


//*******************************************************************************
//User Method Section
// put your code to do things here.

    // main thread
    // this is the code that plays the game after you set things up
    public void run() {
        //for the moment we will loop things forever.
        moveThings();
        while (true) {
       //     moveThings();  //move all the game objects
            render();  // paint the graphics
            pause(30); // sleep for 10 ms
            if (cardSum == 21) {
                win = true;
            }
        }
    }

    public void moveThings() {
// there's a 1 in 1352 chance that it fails 1 time and a 1 in about 140000 chance it screws up 3 times

       // aceOfSpades.play(400, 610);

      //  aceOfClubs.play(500, 610);
        int num = (int) (Math.random() * 52);
       cardarray[num].play(400,610);
        System.out.println(num);
        cardSum=cardarray[num].value;
        System.out.println(cardSum);
        int num2 = (int) (Math.random() * 52);
        if (num2!=num){
         cardarray[num2].play(500,610);
            System.out.println(num2);
            cardSum=cardarray[num].value+cardarray[num2].value;
            System.out.println(cardSum);
        }
        int num3 = (int) (Math.random() * 52);
        if (num2!=num3 && num!=num3){
            cardarray[num3].play(600,610);
            System.out.println(num3);
            cardSum=cardarray[num].value+cardarray[num2].value+cardarray[num3].value;
            System.out.println(cardSum);
        }

    }




    //Paints things on the screen using bufferStrategy
    private void render() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.setColor(new Color(0,150,0));
        g.fillRect(0,0, WIDTH, HEIGHT);
        g.setColor(new Color(255,255,255));
        g.fillRect(aceOfSpades.xpos,aceOfSpades.ypos, aceOfSpades.width, aceOfSpades.height+3);
        g.drawImage(aceOfSpadesImage, aceOfSpades.xpos,aceOfSpades.ypos, aceOfSpades.width, aceOfSpades.height, null);
        g.setColor(new Color(255,255,255));
        g.fillRect(aceOfClubs.xpos,aceOfClubs.ypos, aceOfClubs.width, aceOfClubs.height+3);
        g.drawImage(aceOfClubsImage, aceOfClubs.xpos,aceOfClubs.ypos, aceOfClubs.width, aceOfClubs.height, null);
        for (int c=0; c<4; c++){
            cardarray[c] = new Card(100,100,1);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
          //  g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=4; c<8; c++){
            cardarray[c] = new Card(100,100,2);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
          //  g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=8; c<12; c++){
            cardarray[c] = new Card(100,100,3);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
         //   g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=12; c<16; c++){
            cardarray[c] = new Card(100,100,4);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
        //    g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=16; c<20; c++){
            cardarray[c] = new Card(100,100,5);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
         //   g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=20; c<24; c++){
            cardarray[c] = new Card(100,100,6);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
           // g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=24; c<28; c++){
            cardarray[c] = new Card(100,100,7);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
           // g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=28; c<32; c++){
            cardarray[c] = new Card(100,100,8);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
           // g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=32; c<36; c++){
            cardarray[c] = new Card(100,100,9);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
           // g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        for (int c=36; c<52; c++){
            cardarray[c] = new Card(100,100,10);
            g.fillRect(cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height+3);
           // g.drawImage(Image, cardarray[c].xpos,cardarray[c].ypos, cardarray[c].width, cardarray[c].height, null);
        }
        g.dispose();
        bufferStrategy.show();
    }

    //Pauses or sleeps the computer for the amount specified in milliseconds
    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }

    //Graphics setup method
    private void setUpGraphics() {
        frame = new JFrame("Application Template");   //Create the program window or frame.  Names it.

        panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
        panel.setLayout(null);   //set the layout

        // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
        // and trap input events (Mouse and Keyboard events)
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);

        panel.add(canvas);  // adds the canvas to the panel.

        // frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
        frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
        frame.setResizable(false);   //makes it so the frame cannot be resized
        frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

        // sets up things so the screen displays images nicely.
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        canvas.addKeyListener(this);
        System.out.println("DONE graphic setup");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}

