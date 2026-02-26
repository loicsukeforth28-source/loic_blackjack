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
//    Card aceOfHearts;
//    Card aceOfDiamonds;
//    Card twoOfClubs;
//    Card twoOfSpades;
//    Card twoOfHearts;
//    Card twoOfDiamonds;
//    Card threeOfClubs;
//    Card threeOfSpades;
//    Card threeOfHearts;
//    Card threeOfDiamonds;
//    Card fourOfClubs;
//    Card fourOfSpades;
//    Card fourOfHearts;
//    Card fourOfDiamonds;
//    Card fiveOfClubs;
//    Card fiveOfHearts;
//    Card fiveOfDiamonds;
//    Card fiveOfSpades;
//    Card sixOfSpades;
//    Card sixOfClubs;
//    Card sixOfHearts;
//    Card sixOfDiamonds;
//    Card sevenOfSpades;
//    Card sevenOfClubs;
//    Card sevenOfHearts;
//    Card sevenOfDiamonds;
//    Card eightOfSpades;
//    Card eightOfClubs;
//    Card eightOfHearts;
//    Card eightOfDiamonds;
//    Card nineOfSpades;
//    Card nineOfClubs;
//    Card nineOfHearts;
//    Card nineOfDiamonds;
//    Card tenOfSpades;
//    Card tenOfClubs;
//    Card tenOfHearts;
//    Card tenOfDiamonds;
//    Card jackOfSpades;
//    Card jackOfClubs;
//    Card jackOfHearts;
//    Card jackOfDiamonds;
//    Card queenOfSpades;
//    Card queenOfClubs;
//    Card queenOfHearts;
//    Card queenOfDiamonds;
//    Card kingOfSpades;
//    Card kingOfClubs;
//    Card kingOfHearts;
//    Card kingOfDiamonds;


    public int cardSum;
    public boolean win;
    int firstXpos;
     Card [] cardarray=new Card[52];
   public int num;
   public int num2;
   public int num3;

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
        for (int c=0; c<4; c++){
            cardarray[c] = new Card(1);
        }
        for (int c=4; c<8; c++){
            cardarray[c] = new Card(2);
        }
        for (int c=8; c<12; c++){
            cardarray[c] = new Card(3);
        }
        for (int c=12; c<16; c++){
            cardarray[c] = new Card(4);
        }
        for (int c=16; c<20; c++){
            cardarray[c] = new Card(5);
        }
        for (int c=20; c<24; c++){
            cardarray[c] = new Card(6);
        }
        for (int c=24; c<28; c++){
            cardarray[c] = new Card(7);
        }
        for (int c=28; c<32; c++){
            cardarray[c] = new Card(8);
        }
        for (int c=32; c<36; c++){
            cardarray[c] = new Card(9);
        }
        for (int c=36; c<=51; c++){
            cardarray[c] = new Card(10);
        }
        System.out.println(cardarray);
        aceOfSpades = new Card(1);
       aceOfClubs = new Card(1);
//        aceOfHearts = new Card(100,100, 1);
//        aceOfDiamonds = new Card(100,100, 1);
//        twoOfSpades = new Card(100,100, 2);
//        twoOfClubs = new Card(100,100, 2);
//        twoOfHearts = new Card(100,100, 2);
//        twoOfDiamonds = new Card(100,100, 2);
//        threeOfSpades = new Card(100,100, 3);
//        threeOfClubs = new Card(100,100, 3);
//        threeOfHearts = new Card(100,100, 3);
//        threeOfDiamonds = new Card(100,100, 3);
//        fourOfSpades = new Card(100,100, 4);
//        fourOfClubs = new Card(100,100, 4);
//        fourOfHearts = new Card(100,100, 4);
//        fourOfDiamonds = new Card(100,100, 4);
//        fiveOfSpades = new Card(100,100, 5);
//        fiveOfClubs = new Card(100,100, 5);
//        fiveOfHearts = new Card(100,100, 5);
//        fiveOfDiamonds = new Card(100,100, 5);
//        sixOfSpades = new Card(100,100, 6);
//        sixOfClubs = new Card(100,100, 6);
//        sixOfHearts = new Card(100,100, 6);
//        sixOfDiamonds = new Card(100,100, 6);
//        sevenOfSpades = new Card(100,100, 7);
//        sevenOfClubs = new Card(100,100, 7);
//        sevenOfHearts = new Card(100,100, 7);
//        sevenOfDiamonds = new Card(100,100, 7);
//        eightOfSpades = new Card(100,100, 8);
//        eightOfClubs = new Card(100,100, 8);
//        eightOfHearts = new Card(100,100, 8);
//        eightOfDiamonds = new Card(100,100, 8);
//        nineOfSpades = new Card(100,100, 9);
//        nineOfClubs = new Card(100,100, 9)
//        nineOfHearts = new Card(100,100, 9);
//        nineOfDiamonds = new Card(100,100, 9);
//        tenOfSpades = new Card(100,100, 10);
//        tenOfClubs = new Card(100,100, 10);
//        tenOfHearts = new Card(100,100, 10);
//        tenOfDiamonds = new Card(100,100, 10);
//        jackOfSpades = new Card(100,100, 10);
//        jackOfClubs = new Card(100,100, 10);
//        jackOfHearts = new Card(100,100, 10);
//        jackOfDiamonds = new Card(100,100, 10);
//        queenOfSpades = new Card(100,100, 10);
//        queenOfClubs = new Card(100,100, 10);
//        queenOfHearts = new Card(100,100, 10);
//        queenOfDiamonds = new Card(100,100, 10);
//        kingOfSpades = new Card(100,100, 10);
//        kingOfClubs = new Card(100,100, 10);
//        kingOfHearts = new Card(100,100, 10);
//        kingOfDiamonds = new Card(100,100, 10);



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
// there's a 1 in 1352 chance that it fails 1 time and a 1 in about 140000 chance it screws up 2 times

       // aceOfSpades.play(400, 610);

      //  aceOfClubs.play(500, 610);
        num = (int) (Math.random() * 52);
       cardarray[num].play(400,610);
        System.out.println(num);
        cardSum=cardarray[num].value;
        System.out.println(cardarray[num].value+"="+cardSum);
         num2 = (int) (Math.random() * 52);
        if (num2!=num&& cardSum<22){
         cardarray[num2].play(500,610);
            System.out.println(num2);
            cardSum=cardarray[num].value+cardarray[num2].value;
            System.out.println(cardarray[num].value+"+"+cardarray[num2].value+"="+cardSum);
        }
        num3 = (int) (Math.random() * 52);
        if (num2!=num3 && num!=num3&& cardSum<22){
            cardarray[num3].play(600,610);
            System.out.println(num3);
            cardSum=cardarray[num].value+cardarray[num2].value+cardarray[num3].value;
            System.out.println(cardarray[num].value+"+"+cardarray[num2].value+"+"+cardarray[num3].value+"="+cardSum);
        }

    }




    //Paints things on the screen using bufferStrategy
    private void render() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.setColor(new Color(0,150,0));
        g.fillRect(0,0, WIDTH, HEIGHT);
        g.setColor(new Color(255,255,255));
      //  g.fillRect(aceOfSpades.xpos,aceOfSpades.ypos, aceOfSpades.width, aceOfSpades.height+3);
      //  g.drawImage(aceOfSpadesImage, aceOfSpades.xpos,aceOfSpades.ypos, aceOfSpades.width, aceOfSpades.height, null);
        g.setColor(new Color(255,255,255));
      //  g.fillRect(aceOfClubs.xpos,aceOfClubs.ypos, aceOfClubs.width, aceOfClubs.height+3);
     //   g.drawImage(aceOfClubsImage, aceOfClubs.xpos,aceOfClubs.ypos, aceOfClubs.width, aceOfClubs.height, null);
        g.fillRect(cardarray[num].xpos,cardarray[num].ypos, cardarray[num].width, cardarray[num].height+3);
        g.fillRect(cardarray[num2].xpos,cardarray[num2].ypos, cardarray[num2].width, cardarray[num2].height+3);
        g.fillRect(cardarray[num3].xpos,cardarray[num3].ypos, cardarray[num3].width, cardarray[num3].height+3);
        g.drawImage(aceOfHeartsImage, cardarray[0].xpos,cardarray[0].ypos, cardarray[0].width, cardarray[0].height, null);
        g.drawImage(aceOfSpadesImage, cardarray[1].xpos,cardarray[1].ypos, cardarray[1].width, cardarray[1].height, null);
        g.drawImage(aceOfClubsImage, cardarray[2].xpos,cardarray[2].ypos, cardarray[2].width, cardarray[2].height, null);
        g.drawImage(aceOfDiamondsImage, cardarray[3].xpos,cardarray[3].ypos, cardarray[3].width, cardarray[3].height, null);
        g.drawImage(twoOfSpadesImage, cardarray[4].xpos,cardarray[4].ypos, cardarray[4].width, cardarray[4].height, null);
        g.drawImage(twoOfClubsImage, cardarray[5].xpos,cardarray[5].ypos, cardarray[5].width, cardarray[5].height, null);
        g.drawImage(twoOfDiamondsImage, cardarray[6].xpos,cardarray[6].ypos, cardarray[6].width, cardarray[6].height, null);
        g.drawImage(twoOfHeartsImage, cardarray[7].xpos,cardarray[7].ypos, cardarray[7].width, cardarray[7].height, null);
        g.drawImage(threeOfSpadesImage, cardarray[8].xpos,cardarray[8].ypos, cardarray[8].width, cardarray[8].height, null);
        g.drawImage(threeOfClubsImage, cardarray[9].xpos,cardarray[9].ypos, cardarray[9].width, cardarray[9].height, null);
        g.drawImage(threeOfDiamondsImage, cardarray[10].xpos,cardarray[10].ypos, cardarray[10].width, cardarray[10].height, null);
        g.drawImage(threeOfHeartsImage, cardarray[11].xpos,cardarray[11].ypos, cardarray[11].width, cardarray[11].height, null);
        g.drawImage(fourOfClubsImage, cardarray[12].xpos,cardarray[12].ypos, cardarray[12].width, cardarray[12].height, null);
        g.drawImage(fourOfDiamondsImage, cardarray[13].xpos,cardarray[13].ypos, cardarray[13].width, cardarray[13].height, null);
        g.drawImage(fourOfSpadesImage, cardarray[14].xpos,cardarray[14].ypos, cardarray[14].width, cardarray[14].height, null);
        g.drawImage(fourOfHeartsImage, cardarray[15].xpos,cardarray[15].ypos, cardarray[15].width, cardarray[15].height, null);
        g.drawImage(fiveOfSpadesImage, cardarray[16].xpos,cardarray[16].ypos, cardarray[16].width, cardarray[16].height, null);
        g.drawImage(fiveOfClubsImage, cardarray[17].xpos,cardarray[17].ypos, cardarray[17].width, cardarray[17].height, null);
        g.drawImage(fiveOfDiamondsImage, cardarray[18].xpos,cardarray[18].ypos, cardarray[18].width, cardarray[18].height, null);
        g.drawImage(fiveOfHeartsImage, cardarray[19].xpos,cardarray[19].ypos, cardarray[19].width, cardarray[19].height, null);
        g.drawImage(sixOfClubsImage, cardarray[20].xpos,cardarray[20].ypos, cardarray[20].width, cardarray[20].height, null);
        g.drawImage(sixOfDiamondsImage, cardarray[21].xpos,cardarray[21].ypos, cardarray[21].width, cardarray[21].height, null);
        g.drawImage(sixOfHeartsImage, cardarray[22].xpos,cardarray[22].ypos, cardarray[22].width, cardarray[22].height, null);
        g.drawImage(sixOfSpadesImage, cardarray[23].xpos,cardarray[23].ypos, cardarray[23].width, cardarray[23].height, null);
        g.drawImage(sevenOfSpadesImage, cardarray[24].xpos,cardarray[24].ypos, cardarray[24].width, cardarray[24].height, null);
        g.drawImage(sevenOfClubsImage, cardarray[25].xpos,cardarray[25].ypos, cardarray[25].width, cardarray[25].height, null);
        g.drawImage(sevenOfDiamondsImage, cardarray[26].xpos,cardarray[26].ypos, cardarray[26].width, cardarray[26].height, null);
        g.drawImage(sevenOfHeartsImage, cardarray[27].xpos,cardarray[27].ypos, cardarray[27].width, cardarray[27].height, null);
        g.drawImage(eightOfClubsImage, cardarray[28].xpos,cardarray[28].ypos, cardarray[28].width, cardarray[28].height, null);
        g.drawImage(eightOfDiamondsImage, cardarray[29].xpos,cardarray[29].ypos, cardarray[29].width, cardarray[29].height, null);
        g.drawImage(eightOfHeartsImage, cardarray[30].xpos,cardarray[30].ypos, cardarray[30].width, cardarray[30].height, null);
        g.drawImage(eightOfSpadesImage, cardarray[31].xpos,cardarray[31].ypos, cardarray[31].width, cardarray[31].height, null);
        g.drawImage(nineOfSpadesImage, cardarray[32].xpos,cardarray[32].ypos, cardarray[32].width, cardarray[32].height, null);
        g.drawImage(nineOfClubsImage, cardarray[33].xpos,cardarray[33].ypos, cardarray[33].width, cardarray[33].height, null);
        g.drawImage(nineOfDiamondsImage, cardarray[34].xpos,cardarray[34].ypos, cardarray[34].width, cardarray[34].height, null);
        g.drawImage(nineOfHeartsImage, cardarray[35].xpos,cardarray[35].ypos, cardarray[35].width, cardarray[35].height, null);
        g.drawImage(tenOfClubsImage, cardarray[36].xpos,cardarray[36].ypos, cardarray[36].width, cardarray[36].height, null);
        g.drawImage(tenOfDiamondsImage, cardarray[37].xpos,cardarray[37].ypos, cardarray[37].width, cardarray[37].height, null);
        g.drawImage(tenOfHeartsImage, cardarray[38].xpos,cardarray[38].ypos, cardarray[38].width, cardarray[38].height, null);
        g.drawImage(tenOfSpadesImage, cardarray[39].xpos,cardarray[39].ypos, cardarray[39].width, cardarray[39].height, null);
        g.drawImage(jackOfSpadesImage, cardarray[40].xpos,cardarray[1].ypos, cardarray[40].width, cardarray[1].height, null);
        g.drawImage(jackOfClubsImage, cardarray[41].xpos,cardarray[41].ypos, cardarray[41].width, cardarray[41].height, null);
        g.drawImage(jackOfDiamondsImage, cardarray[42].xpos,cardarray[42].ypos, cardarray[42].width, cardarray[42].height, null);
        g.drawImage(jackOfHeartsImage, cardarray[43].xpos,cardarray[43].ypos, cardarray[43].width, cardarray[43].height, null);
        g.drawImage(queenOfClubsImage, cardarray[44].xpos,cardarray[44].ypos, cardarray[44].width, cardarray[44].height, null);
        g.drawImage(queenOfDiamondsImage, cardarray[45].xpos,cardarray[45].ypos, cardarray[45].width, cardarray[45].height, null);
        g.drawImage(queenOfHeartsImage, cardarray[46].xpos,cardarray[46].ypos, cardarray[46].width, cardarray[46].height, null);
        g.drawImage(queenOfSpadesImage, cardarray[47].xpos,cardarray[47].ypos, cardarray[47].width, cardarray[47].height, null);
        g.drawImage(kingOfSpadesImage, cardarray[48].xpos,cardarray[48].ypos, cardarray[48].width, cardarray[48].height, null);
        g.drawImage(kingOfClubsImage, cardarray[49].xpos,cardarray[49].ypos, cardarray[49].width, cardarray[49].height, null);
        g.drawImage(kingOfDiamondsImage, cardarray[50].xpos,cardarray[50].ypos, cardarray[50].width, cardarray[50].height, null);
        g.drawImage(kingOfHeartsImage, cardarray[51].xpos,cardarray[51].ypos, cardarray[51].width, cardarray[51].height, null);



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

