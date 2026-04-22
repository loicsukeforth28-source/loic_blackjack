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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

//*******************************************************************************

public class BasicGameApp implements Runnable, KeyListener, MouseListener {

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

     public int cardSum=0;
     public int ace11CardSum=0;
     public int dealerSum=0;
     public int finalDealerSum=0;
     public int aceDealerSum=0;
     Card [] cardarray=new Card[52];
    public int num;
    public int num2;
    public int num3;
    public int num4;
    public int num5;
    public int num6;
    public int num7;
    public int num8;
    public int num9;
    public int num10;
    public int num11;
    public int num0;
    public int num00;
    public int num000;
    public int num0000;
    public int num00000;
    public boolean hit1=false;
    public boolean hit1used=false;
    public boolean hit2=false;
    public boolean hit2used=false;
    public boolean hit3=false;
    public boolean hit3used=false;
    public boolean stay=false;
    public boolean isNum1used=false;
    public boolean isNum2used=false;
    public boolean isNum3used=false;
    public boolean isNum4used=false;
    public boolean isNum5used=false;
    public boolean isNum6used=false;
    public boolean isNum7used=false;
    public boolean isNum8used=false;
    public boolean isNum9used=false;
    public boolean isNum10used=false;
    public boolean isNum11used=false;
    public boolean isNum0used=false;
    public boolean isNum00used=false;
    public boolean isNum000used=false;
    public boolean isNum0000used=false;
    public boolean isNum00000used=false;
    public boolean print = false;
    public boolean print2 = false;
    public boolean print3 = false;
    public boolean dealerPrint = false;
    public boolean dealerPrint2 = false;
    public boolean dealerPrint3 = false;
    public boolean dealerPrint4 = false;
    public boolean thirdDealerCard=false;
    public boolean fourthDealerCard=false;
    public boolean fifthDealerCard=false;
    public String result="";
    public boolean done=false;
    public boolean keepCardSum=false;
    public boolean keepCardSum2=false;
    public boolean keepCardSum3=false;
    public boolean keepCardSum4=false;
    public boolean cardsGood=true;
    public boolean cardsCreated=false;
    public boolean printCards=false;
    public boolean firstDealerSum=false;
    public boolean zeroithDealerSum=false;
    public boolean secondDealerSum=false;
    public boolean dealerStopped=false;
    public boolean aceDealerStopped=false;
    public int finalSum=0;
    public boolean blackjack=false;
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

        aceOfSpadesImage = Toolkit.getDefaultToolkit().getImage("AceSpades.png");
        aceOfHeartsImage = Toolkit.getDefaultToolkit().getImage("AceHearts.png");
        aceOfClubsImage = Toolkit.getDefaultToolkit().getImage("AceClubs.png");
        aceOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("AceDiamonds.png");

        twoOfSpadesImage = Toolkit.getDefaultToolkit().getImage("TwoSpades.png");
        twoOfHeartsImage = Toolkit.getDefaultToolkit().getImage("TwoHearts.png");
        twoOfClubsImage = Toolkit.getDefaultToolkit().getImage("TwoClubs.png");
        twoOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("TwoDiamonds.png");

        threeOfSpadesImage = Toolkit.getDefaultToolkit().getImage("ThreeSpades.png");
        threeOfHeartsImage = Toolkit.getDefaultToolkit().getImage("ThreeHearts.png");
        threeOfClubsImage = Toolkit.getDefaultToolkit().getImage("ThreeClubs.png");
        threeOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("ThreeDiamonds.png");

        fourOfSpadesImage = Toolkit.getDefaultToolkit().getImage("FourSpades.png");
        fourOfHeartsImage = Toolkit.getDefaultToolkit().getImage("FourHearts.png");
        fourOfClubsImage = Toolkit.getDefaultToolkit().getImage("FourClubs.png");
        fourOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("FourDiamonds.png");

        fiveOfSpadesImage = Toolkit.getDefaultToolkit().getImage("FiveSpades.png");
        fiveOfHeartsImage = Toolkit.getDefaultToolkit().getImage("FiveHearts.png");
        fiveOfClubsImage = Toolkit.getDefaultToolkit().getImage("FiveClubs.png");
        fiveOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("FiveDiamonds.png");

        sixOfSpadesImage = Toolkit.getDefaultToolkit().getImage("SixSpades.png");
        sixOfHeartsImage = Toolkit.getDefaultToolkit().getImage("SixHearts.png");
        sixOfClubsImage = Toolkit.getDefaultToolkit().getImage("SixClubs.png");
        sixOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("SixDiamonds.png");

        sevenOfSpadesImage = Toolkit.getDefaultToolkit().getImage("SevenSpades.png");
        sevenOfHeartsImage = Toolkit.getDefaultToolkit().getImage("SevenHearts.png");
        sevenOfClubsImage = Toolkit.getDefaultToolkit().getImage("SevenClubs.png");
        sevenOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("SevenDiamonds.png");

        eightOfSpadesImage = Toolkit.getDefaultToolkit().getImage("EightSpades.png");
        eightOfHeartsImage = Toolkit.getDefaultToolkit().getImage("EightHearts.png");
        eightOfClubsImage = Toolkit.getDefaultToolkit().getImage("EightClubs.png");
        eightOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("EightDiamonds.png");

        nineOfSpadesImage = Toolkit.getDefaultToolkit().getImage("NineSpades.png");
        nineOfHeartsImage = Toolkit.getDefaultToolkit().getImage("NineHearts.png");
        nineOfClubsImage = Toolkit.getDefaultToolkit().getImage("NineClubs.png");
        nineOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("NineDiamonds.png");

        tenOfSpadesImage = Toolkit.getDefaultToolkit().getImage("TenSpades.png");
        tenOfHeartsImage = Toolkit.getDefaultToolkit().getImage("TenHearts.png");
        tenOfClubsImage = Toolkit.getDefaultToolkit().getImage("TenClubs.png");
        tenOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("TenDiamonds.png");

        jackOfSpadesImage = Toolkit.getDefaultToolkit().getImage("JackSpades.png");
        jackOfHeartsImage = Toolkit.getDefaultToolkit().getImage("JackHearts.png");
        jackOfClubsImage = Toolkit.getDefaultToolkit().getImage("JackClubs.png");
        jackOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("JackDiamonds.png");

        queenOfSpadesImage = Toolkit.getDefaultToolkit().getImage("QueenSpades.png");
        queenOfHeartsImage = Toolkit.getDefaultToolkit().getImage("QueenHearts.png");
        queenOfClubsImage = Toolkit.getDefaultToolkit().getImage("QueenClubs.png");
        queenOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("QueenDiamonds.png");

        kingOfSpadesImage = Toolkit.getDefaultToolkit().getImage("KingSpades.png");
        kingOfHeartsImage = Toolkit.getDefaultToolkit().getImage("KingHearts.png");
        kingOfClubsImage = Toolkit.getDefaultToolkit().getImage("KingClubs.png");
        kingOfDiamondsImage = Toolkit.getDefaultToolkit().getImage("KingDiamonds.png");
        run();

    } // end BasicGameApp constructor

//*******************************************************************************
//User Method Section
// put your code to do things here.

    // main thread
    // this is the code that plays the game after you set things up
    public void run() {
        //for the moment we will loop things forever.
        while (true) {
           moveThings();  //move all the game objects
            render();  // paint the graphics
            pause(30); // sleep for 10 ms

        }
    }
    //Makes all the cards and makes sure they are all different
    public void createCardsCheckCards(){
        if (!isNum0used) {
            num0 = (int) (Math.random() * 52);
            isNum0used = true;
        }
        if (!isNum1used) {
            num = (int) (Math.random() * 52);
            isNum1used = true;
        }
        if (!isNum2used) {
            num2 = (int) (Math.random() * 52);
            isNum2used = true;
        }
        if (!isNum3used) {
            num3 = (int) (Math.random() * 52);
            isNum3used = true;
        }
        if (!isNum4used) {
            num4 = (int) (Math.random() * 52);
            isNum4used = true;
        }
        if (!isNum00used) {
            num00 = (int) (Math.random() * 52);
            isNum00used = true;
        }
        if (!isNum000used) {
            num000 = (int) (Math.random() * 52);
            isNum000used = true;
        }
        if (!isNum0000used) {
            num0000 = (int) (Math.random() * 52);
            isNum0000used = true;
        }
        if (!isNum5used) {
            num5 = (int) (Math.random() * 52);
            isNum5used = true;
        }
        if (!isNum00000used) {
            num00000 = (int) (Math.random() * 52);
            isNum00000used = true;
        }
        if (!isNum6used) {
            num6 = (int) (Math.random() * 52);
            isNum6used = true;
        }
        if (!isNum7used) {
            num7 = (int) (Math.random() * 52);
            isNum7used = true;
        }
        if (!isNum8used) {
            num8 = (int) (Math.random() * 52);
            isNum8used = true;
        }
        if (!isNum9used) {
            num9 = (int) (Math.random() * 52);
            isNum9used = true;
        }
        if (!isNum10used) {
            num10 = (int) (Math.random() * 52);
            isNum10used = true;
        }
        if (!isNum11used) {
            num11 = (int) (Math.random() * 52);
            isNum11used = true;
        }
        // This sequence of if statements makes it so only once every card is different does it move on to the playing part
        if (num0==num||num0==num2||num0==num3||num0==num4||num0==num00||num0==num000||num0==num0000||num0==num5||num0==num00000||num0==num6||num0==num7||num0==num8||num0==num9||num0==num10||num0==num11){
            isNum0used=false;
            cardsGood = false;
        }
       else if (num==num2||num==num3||num==num4||num==num00||num==num000||num==num0000||num==num5||num==num00000||num==num6||num==num7||num==num8||num==num9||num==num10||num==num11){
            isNum1used=false;
            cardsGood = false;
        }
       else if (num2==num3||num2==num4||num2==num00||num2==num000||num2==num0000||num2==num5||num2==num00000||num2==num6||num2==num7||num2==num8||num2==num9||num2==num10||num2==num11){
            isNum2used=false;
            cardsGood = false;
        }
       else if (num3==num4||num3==num00||num3==num000||num3==num0000||num3==num5||num3==num00000||num3==num6||num3==num7||num3==num8||num3==num9||num3==num10||num3==num11){
            isNum3used=false;
            cardsGood = false;
        }
       else if(num4==num00||num4==num000||num4==num0000||num4==num5||num4==num00000||num4==num6||num4==num7||num4==num8||num4==num9||num4==num10||num4==num11){
            isNum4used=false;
            cardsGood = false;
        }
       else if(num00==num000||num00==num0000||num00==num5||num00==num00000||num00==num6||num00==num7||num00==num8||num00==num9||num00==num10||num00==num11){
            isNum00used=false;
            cardsGood = false;
       }
       else if(num000==num0000||num000==num5||num000==num00000||num000==num6||num000==num7||num000==num8||num000==num9||num000==num10||num000==num11){
            isNum000used=false;
            cardsGood = false;
       }
       else if(num0000==num5||num0000==num00000||num0000==num6||num0000==num7||num0000==num8||num0000==num9||num0000==num10||num0000==num11){
            isNum0000used=false;
            cardsGood = false;
        }
       else if(num5==num00000||num5==num6||num5==num7||num5==num8||num5==num9||num5==num10||num5==num11){
            isNum5used=false;
            cardsGood = false;
       }
       else if(num00000==num6||num00000==num7||num00000==num8||num00000==num9||num00000==num10||num00000==num11){
            isNum00000used=false;
            cardsGood = false;
       }
       else if(num6==num7||num6==num8||num6==num9||num6==num10||num6==num11){
            isNum6used=false;
            cardsGood = false;
       }
       else if(num7==num8||num7==num9||num7==num10||num7==num11){
            isNum7used=false;
            cardsGood = false;
       }
       else if(num8==num9||num8==num10||num8==num11){
            isNum8used=false;
            cardsGood = false;
       }
       else if(num9==num10||num9==num11){
            isNum9used=false;
            cardsGood = false;
       }
       else if(num10==num11){
            isNum10used=false;
            cardsGood = false;
       }
        else cardsGood=true;

    }
    public void moveThings() {
        //starts the process of making cards and checking them
        if(!cardsCreated) {
            createCardsCheckCards();
            cardsCreated=true;
        }
            while (!cardsGood){
                createCardsCheckCards();
            }
//            if (!printCards){
//                System.out.println(num);
//                System.out.println(num2);
//                System.out.println(num3);
//                System.out.println(num4);
//                System.out.println(num5);
//                System.out.println(num0);
//                System.out.println(num00);
//                System.out.println(num000);
//                System.out.println(num0000);
//                System.out.println(num00000);
//                printCards=true;
//            }
        if (cardsCreated) {
            //plays the first dealer card
            cardarray[num0].play(425, 10);
            if (!zeroithDealerSum){
                dealerSum = cardarray[num0].value;
                if(cardarray[num0].value==1){
                    aceDealerSum = cardarray[num0].value +10;
//                System.out.println("ace dealer sum is "+aceDealerSum);
                }
            zeroithDealerSum=true;
            }
            //plays the first player card
            cardarray[num].play(425, 610);
            if (!keepCardSum) {
                cardSum = cardarray[num].value;
                if (cardarray[num].value==1){
                    ace11CardSum = cardarray[num].value+10;
                }
                keepCardSum = true;
            }


            cardarray[num2].play(500, 610);
            if (!keepCardSum2) {
                cardSum = cardarray[num].value + cardarray[num2].value;
                if(cardarray[num].value==1||cardarray[num2].value==1){
                    ace11CardSum=cardSum;
                }
                if (cardarray[num2].value == 1) {
                    ace11CardSum = ace11CardSum+ 11;
                }
                if (ace11CardSum > cardSum && ace11CardSum < 22) {
                    finalSum = ace11CardSum;
                } else finalSum = cardSum;
                if (finalSum > 21) {
                    result = "you lose haha bozo";
                }
                if(ace11CardSum==21){
                    result = "Blackjack! You Win!";
                    blackjack=true;
                    stay=true;
                }
                keepCardSum2 = true;
            }

            if (cardSum < 21 && hit1 && !stay) {
                cardarray[num3].play(575, 610);
                if (!keepCardSum3) {
                    cardSum = cardarray[num].value + cardarray[num2].value + cardarray[num3].value;
                    if (cardarray[num3].value == 1) {
                        ace11CardSum = ace11CardSum + 11;
                    }
                    keepCardSum3=true;
                }

                if (!print) {
                    if (cardSum > 21) {
                        result="you lose haha bozo";
                        System.out.println(result);
                        done=true;
                    }
                    System.out.println(cardarray[num].value + "+" + cardarray[num2].value + "+" + cardarray[num3].value + "=" + cardSum);
                    print = true;
                    hit1used = true;
                }
            }

            if (cardSum < 21 && hit2 && hit1used && !stay) {
                cardarray[num4].play(650, 610);
                if (!keepCardSum4) {
                    cardSum = cardarray[num].value + cardarray[num2].value + cardarray[num3].value + cardarray[num4].value;
                    keepCardSum4=true;
                }
                if (!print2) {
                    if (cardSum > 21) {
                        result="you lose haha bozo";
                        System.out.println(result);
                        done=true;
                    }
                    System.out.println(cardarray[num].value + "+" + cardarray[num2].value + "+" + cardarray[num3].value + "+" + cardarray[num4].value + "=" + cardSum);
                    print2 = true;
                    hit2used = true;
                }
            }
            if (cardSum < 21 && hit2used && hit1used && hit3 && !stay) {
                cardarray[num5].play(725, 610);
                cardSum = cardarray[num].value + cardarray[num2].value + cardarray[num3].value + cardarray[num4].value + cardarray[num5].value;
                if (!print3) {
                    if (cardSum > 21) {
                        System.out.println("you lose haha bozo");
                    }
                    System.out.println(cardarray[num].value + "+" + cardarray[num2].value + "+" + cardarray[num3].value + "+" + cardarray[num4].value + "=" + cardSum);
                    print3 = true;
                    hit3=false;
                    hit3used = true;
                }

            }
            //once player stays then all the other dealer cards are played
            if (stay) {
                cardarray[num00].play(500, 10);
                if (!firstDealerSum) {
                    dealerSum = cardarray[num0].value + cardarray[num00].value;
                    if (cardarray[num00].value==1){
                        System.out.println("before"+aceDealerSum);
                        aceDealerSum = dealerSum+10;
                        System.out.println("after"+aceDealerSum);
                    } else aceDealerSum=aceDealerSum+cardarray[num00].value;
                    firstDealerSum=true;
                }
                if (!dealerPrint) {
                    System.out.println("1."+cardarray[num0].value + "+" + cardarray[num00].value + "=" + dealerSum);
                    dealerPrint = true;
                }
                if (aceDealerSum<18&&dealerSum < 17 && !thirdDealerCard) {
                    pause(150);
                    cardarray[num000].play(575, 10);
                    if (!secondDealerSum){
                    dealerSum = cardarray[num00].value + cardarray[num0].value + cardarray[num000].value;
                    if (cardarray[num000].value==1) {
                        aceDealerSum = cardarray[num000].value + aceDealerSum + 10;
                    }
                    }
                    thirdDealerCard = true;
                    if (!dealerPrint2) {
                        System.out.println("2."+ cardarray[num0].value + "+" + cardarray[num00].value + "+" + cardarray[num000].value + "=" + dealerSum);
                        dealerPrint2 = true;
                    }
                }
                if (aceDealerSum<18&&dealerSum < 17 && thirdDealerCard && !fourthDealerCard) {
                    System.out.println(dealerSum);
                    cardarray[num0000].play(650, 10);
                    dealerSum = cardarray[num00].value + cardarray[num0].value + cardarray[num000].value + cardarray[num0000].value;
                    fourthDealerCard = true;
                    if (!dealerPrint3) {
                        System.out.println("3."+cardarray[num00].value + "+" + cardarray[num0].value + "+" + cardarray[num000].value + "+" + cardarray[num0000].value + "=" + dealerSum);
                        dealerPrint3 = true;
                    }
                }
                if (aceDealerSum<18&&dealerSum < 17 && !fifthDealerCard && fourthDealerCard) {
                    System.out.println(dealerSum);
                    cardarray[num00000].play(725, 10);
                    dealerSum = cardarray[num00].value + cardarray[num0].value + cardarray[num000].value + cardarray[num0000].value+cardarray[num00000].value;
                    fifthDealerCard = true;
                    if (!dealerPrint4) {
                        System.out.println("4."+cardarray[num00].value + "+" + cardarray[num0].value + "+" + cardarray[num000].value + "+" + cardarray[num0000].value + "+" + cardarray[num00000].value+ "=" + dealerSum);
                        dealerPrint4 = true;
                    }
                }
                if (dealerSum >= 17) {
                    dealerStopped=true;
                }
                if(aceDealerSum >= 18 && aceDealerSum < 22) {
                    aceDealerStopped = true;
                }

                    if (dealerStopped||aceDealerStopped) {
                        if(ace11CardSum>cardSum&&ace11CardSum<22) {
                            finalSum = ace11CardSum;
                        } else finalSum=cardSum;
                        if(aceDealerSum>dealerSum&&aceDealerSum<22) {
                            finalDealerSum = aceDealerSum;
                        } else finalDealerSum=dealerSum;
                        if (cardarray[num].value == 1 && cardarray[num2].value==10) {
                            result="Blackjack! You Win!";
                        }
                        if (cardarray[num].value == 10 && cardarray[num2].value==1) {
                            result="Blackjack! You Win!";
                        }
                        else if (finalSum > finalDealerSum && finalSum < 22) {
                            result = "You Win (i guess)";
                        }
                       else if (finalSum < finalDealerSum&&finalDealerSum<22) {
                            result = "you lose haha bozo";
                        }
                       else if (finalSum == finalDealerSum) {
                            result = "you broke (even)";
                        }
                       else if (finalDealerSum > 21 && finalSum < 22) {
                            result = "You Win (i guess)";
                       }
                        done = true;
                     }
            }

        }

    }

        //Paints things on the screen using bufferStrategy
        private void render () {
            Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
            g.clearRect(0, 0, WIDTH, HEIGHT);
            g.setColor(new Color(0, 150, 0));
            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(new Color(255, 255, 255));
            g.fillRect(cardarray[num0].xpos, cardarray[num0].ypos, cardarray[num0].width, cardarray[num0].height + 3);
            g.fillRect(cardarray[num00].xpos, cardarray[num00].ypos, cardarray[num00].width, cardarray[num00].height + 3);
            g.fillRect(cardarray[num000].xpos, cardarray[num000].ypos, cardarray[num000].width, cardarray[num000].height + 3);
            g.fillRect(cardarray[num0000].xpos, cardarray[num0000].ypos, cardarray[num0000].width, cardarray[num0000].height + 3);
            g.fillRect(cardarray[num00000].xpos, cardarray[num00000].ypos, cardarray[num00000].width, cardarray[num00000].height + 3);
            g.fillRect(cardarray[num].xpos, cardarray[num].ypos, cardarray[num].width, cardarray[num].height + 3);
            g.fillRect(cardarray[num2].xpos, cardarray[num2].ypos, cardarray[num2].width, cardarray[num2].height + 3);
            g.fillRect(cardarray[num3].xpos, cardarray[num3].ypos, cardarray[num3].width, cardarray[num3].height + 3);
            g.fillRect(cardarray[num4].xpos, cardarray[num4].ypos, cardarray[num4].width, cardarray[num4].height + 3);
            g.fillRect(cardarray[num5].xpos, cardarray[num5].ypos, cardarray[num5].width, cardarray[num5].height + 3);
            g.fillRect(cardarray[num6].xpos, cardarray[num6].ypos, cardarray[num6].width, cardarray[num6].height + 3);
            g.fillRect(cardarray[num7].xpos, cardarray[num7].ypos, cardarray[num7].width, cardarray[num7].height + 3);
            g.fillRect(cardarray[num8].xpos, cardarray[num8].ypos, cardarray[num8].width, cardarray[num8].height + 3);
            g.fillRect(cardarray[num9].xpos, cardarray[num9].ypos, cardarray[num9].width, cardarray[num9].height + 3);
            g.fillRect(cardarray[num10].xpos, cardarray[num10].ypos, cardarray[num10].width, cardarray[num10].height + 3);
            g.fillRect(320,605,85,85);
            g.setColor(new Color(250, 0, 0));
            g.fillRect(325,610,75,75);
            g.setColor(new Color(255, 255, 255));
            g.drawImage(aceOfHeartsImage, cardarray[0].xpos, cardarray[0].ypos, cardarray[0].width, cardarray[0].height, null);
            g.drawImage(aceOfSpadesImage, cardarray[1].xpos, cardarray[1].ypos, cardarray[1].width, cardarray[1].height, null);
            g.drawImage(aceOfClubsImage, cardarray[2].xpos, cardarray[2].ypos, cardarray[2].width, cardarray[2].height, null);
            g.drawImage(aceOfDiamondsImage, cardarray[3].xpos, cardarray[3].ypos, cardarray[3].width, cardarray[3].height, null);
            g.drawImage(twoOfSpadesImage, cardarray[4].xpos, cardarray[4].ypos, cardarray[4].width, cardarray[4].height, null);
            g.drawImage(twoOfClubsImage, cardarray[5].xpos, cardarray[5].ypos, cardarray[5].width, cardarray[5].height, null);
            g.drawImage(twoOfDiamondsImage, cardarray[6].xpos, cardarray[6].ypos, cardarray[6].width, cardarray[6].height, null);
            g.drawImage(twoOfHeartsImage, cardarray[7].xpos, cardarray[7].ypos, cardarray[7].width, cardarray[7].height, null);
            g.drawImage(threeOfSpadesImage, cardarray[8].xpos, cardarray[8].ypos, cardarray[8].width, cardarray[8].height, null);
            g.drawImage(threeOfClubsImage, cardarray[9].xpos, cardarray[9].ypos, cardarray[9].width, cardarray[9].height, null);
            g.drawImage(threeOfDiamondsImage, cardarray[10].xpos, cardarray[10].ypos, cardarray[10].width, cardarray[10].height, null);
            g.drawImage(threeOfHeartsImage, cardarray[11].xpos, cardarray[11].ypos, cardarray[11].width, cardarray[11].height, null);
            g.drawImage(fourOfClubsImage, cardarray[12].xpos, cardarray[12].ypos, cardarray[12].width, cardarray[12].height, null);
            g.drawImage(fourOfDiamondsImage, cardarray[13].xpos, cardarray[13].ypos, cardarray[13].width, cardarray[13].height, null);
            g.drawImage(fourOfSpadesImage, cardarray[14].xpos, cardarray[14].ypos, cardarray[14].width, cardarray[14].height, null);
            g.drawImage(fourOfHeartsImage, cardarray[15].xpos, cardarray[15].ypos, cardarray[15].width, cardarray[15].height, null);
            g.drawImage(fiveOfSpadesImage, cardarray[16].xpos, cardarray[16].ypos, cardarray[16].width, cardarray[16].height, null);
            g.drawImage(fiveOfClubsImage, cardarray[17].xpos, cardarray[17].ypos, cardarray[17].width, cardarray[17].height, null);
            g.drawImage(fiveOfDiamondsImage, cardarray[18].xpos, cardarray[18].ypos, cardarray[18].width, cardarray[18].height, null);
            g.drawImage(fiveOfHeartsImage, cardarray[19].xpos, cardarray[19].ypos, cardarray[19].width, cardarray[19].height, null);
            g.drawImage(sixOfClubsImage, cardarray[20].xpos, cardarray[20].ypos, cardarray[20].width, cardarray[20].height, null);
            g.drawImage(sixOfDiamondsImage, cardarray[21].xpos, cardarray[21].ypos, cardarray[21].width, cardarray[21].height, null);
            g.drawImage(sixOfHeartsImage, cardarray[22].xpos, cardarray[22].ypos, cardarray[22].width, cardarray[22].height, null);
            g.drawImage(sixOfSpadesImage, cardarray[23].xpos, cardarray[23].ypos, cardarray[23].width, cardarray[23].height, null);
            g.drawImage(sevenOfSpadesImage, cardarray[24].xpos, cardarray[24].ypos, cardarray[24].width, cardarray[24].height, null);
            g.drawImage(sevenOfClubsImage, cardarray[25].xpos, cardarray[25].ypos, cardarray[25].width, cardarray[25].height, null);
            g.drawImage(sevenOfDiamondsImage, cardarray[26].xpos, cardarray[26].ypos, cardarray[26].width, cardarray[26].height, null);
            g.drawImage(sevenOfHeartsImage, cardarray[27].xpos, cardarray[27].ypos, cardarray[27].width, cardarray[27].height, null);
            g.drawImage(eightOfClubsImage, cardarray[28].xpos, cardarray[28].ypos, cardarray[28].width, cardarray[28].height, null);
            g.drawImage(eightOfDiamondsImage, cardarray[29].xpos, cardarray[29].ypos, cardarray[29].width, cardarray[29].height, null);
            g.drawImage(eightOfHeartsImage, cardarray[30].xpos, cardarray[30].ypos, cardarray[30].width, cardarray[30].height, null);
            g.drawImage(eightOfSpadesImage, cardarray[31].xpos, cardarray[31].ypos, cardarray[31].width, cardarray[31].height, null);
            g.drawImage(nineOfSpadesImage, cardarray[32].xpos, cardarray[32].ypos, cardarray[32].width, cardarray[32].height, null);
            g.drawImage(nineOfClubsImage, cardarray[33].xpos, cardarray[33].ypos, cardarray[33].width, cardarray[33].height, null);
            g.drawImage(nineOfDiamondsImage, cardarray[34].xpos, cardarray[34].ypos, cardarray[34].width, cardarray[34].height, null);
            g.drawImage(nineOfHeartsImage, cardarray[35].xpos, cardarray[35].ypos, cardarray[35].width, cardarray[35].height, null);
            g.drawImage(tenOfClubsImage, cardarray[36].xpos, cardarray[36].ypos, cardarray[36].width, cardarray[36].height, null);
            g.drawImage(tenOfDiamondsImage, cardarray[37].xpos, cardarray[37].ypos, cardarray[37].width, cardarray[37].height, null);
            g.drawImage(tenOfHeartsImage, cardarray[38].xpos, cardarray[38].ypos, cardarray[38].width, cardarray[38].height, null);
            g.drawImage(tenOfSpadesImage, cardarray[39].xpos, cardarray[39].ypos, cardarray[39].width, cardarray[39].height, null);
            g.drawImage(jackOfSpadesImage, cardarray[40].xpos, cardarray[40].ypos, cardarray[40].width, cardarray[40].height, null);
            g.drawImage(jackOfClubsImage, cardarray[41].xpos, cardarray[41].ypos, cardarray[41].width, cardarray[41].height, null);
            g.drawImage(jackOfDiamondsImage, cardarray[42].xpos, cardarray[42].ypos, cardarray[42].width, cardarray[42].height, null);
            g.drawImage(jackOfHeartsImage, cardarray[43].xpos, cardarray[43].ypos, cardarray[43].width, cardarray[43].height, null);
            g.drawImage(queenOfClubsImage, cardarray[44].xpos, cardarray[44].ypos, cardarray[44].width, cardarray[44].height, null);
            g.drawImage(queenOfDiamondsImage, cardarray[45].xpos, cardarray[45].ypos, cardarray[45].width, cardarray[45].height, null);
            g.drawImage(queenOfHeartsImage, cardarray[46].xpos, cardarray[46].ypos, cardarray[46].width, cardarray[46].height, null);
            g.drawImage(queenOfSpadesImage, cardarray[47].xpos, cardarray[47].ypos, cardarray[47].width, cardarray[47].height, null);
            g.drawImage(kingOfSpadesImage, cardarray[48].xpos, cardarray[48].ypos, cardarray[48].width, cardarray[48].height, null);
            g.drawImage(kingOfClubsImage, cardarray[49].xpos, cardarray[49].ypos, cardarray[49].width, cardarray[49].height, null);
            g.drawImage(kingOfDiamondsImage, cardarray[50].xpos, cardarray[50].ypos, cardarray[50].width, cardarray[50].height, null);
            g.drawImage(kingOfHeartsImage, cardarray[51].xpos, cardarray[51].ypos, cardarray[51].width, cardarray[51].height, null);
            g.setFont(new Font("Arial",Font.BOLD,40));
            g.drawString("Hit",335,657);
            if (done){
                g.drawString(result,600, 200);
            }
            if (!print) {
                g.drawString("you have " + cardarray[num].value + "+" + cardarray[num2].value + "=" + cardSum, 10, 200);
                if (cardarray[num].value==1){
                    g.drawString("or you have " + 11 + "+" + cardarray[num2].value + "=" + ace11CardSum, 10, 250);
                }
                if (cardarray[num2].value==1){
                    g.drawString("or you have " + cardarray[num].value + "+" + 11 + "=" + ace11CardSum, 10, 250);
                }
            }
            else if (!print2) {
                g.drawString("you have " + cardarray[num].value + "+" + cardarray[num2].value + "+" + cardarray[num3].value + "=" + cardSum, 10, 200);
                if (cardarray[num].value==1){
                    g.drawString("or you have " + 11 + "+" + cardarray[num2].value + "+" + cardarray[num3].value +"=" + ace11CardSum, 10, 250);
                }
                if (cardarray[num2].value==1){
                    g.drawString("or you have " + cardarray[num].value + "+" + 11 +"+" + cardarray[num3].value + "=" + ace11CardSum, 10, 250);
                }
                if (cardarray[num3].value==1){
                    g.drawString("or you have " + cardarray[num].value + "+" + cardarray[num2].value +"+" + 11 + "=" + ace11CardSum, 10, 250);
                }
            }
            else if(!print3){
                g.drawString("you have " + cardarray[num].value + "+" + cardarray[num2].value +"+"+cardarray[num3].value+"+" +cardarray[num4].value+"=" + cardSum, 10, 200);
            }
            else{
                g.drawString("you have " + cardarray[num].value + "+" + cardarray[num2].value +"+"+cardarray[num3].value+"+" +cardarray[num4].value+"+"+cardarray[num5].value+"=" + cardSum, 10, 200);
            }
            g.drawString("Dealer has: "+dealerSum,10,300);
            if (cardarray[num0].value==1) {
                g.drawString("or Dealer has: "+aceDealerSum,10,350);
            }
            else if (cardarray[num00].value==1&&dealerPrint) {
                g.drawString("or Dealer has: " + aceDealerSum, 10, 350);
            }
            else if (cardarray[num000].value==1&&dealerPrint2) {
                g.drawString("or Dealer has: " + aceDealerSum, 10, 350);
            }
            g.dispose();
            bufferStrategy.show();
        }

        //Pauses or sleeps the computer for the amount specified in milliseconds
        public void pause ( int time){
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
        }

        //Graphics setup method
        private void setUpGraphics () {
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
            canvas.addMouseListener(this);
            System.out.println("DONE graphic setup");
        }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
         //System.out.println(e.getKeyCode());

      if (e.getKeyCode()==82){
           cardSum=0;
           ace11CardSum=0;
           dealerSum=0;
           finalDealerSum=0;
           aceDealerSum=0;
           hit1=false;
           hit1used=false;
           hit2=false;
           hit2used=false;
           hit3=false;
           hit3used=false;
           stay=false;
           isNum1used=false;
           isNum2used=false;
           isNum3used=false;
           isNum4used=false;
           isNum5used=false;
           isNum6used=false;
           isNum7used=false;
           isNum8used=false;
           isNum9used=false;
           isNum10used=false;
           isNum11used=false;
           isNum0used=false;
           isNum00used=false;
           isNum000used=false;
           isNum0000used=false;
           isNum00000used=false;
           print = false;
           print2 = false;
           print3 = false;
           dealerPrint = false;
           dealerPrint2 = false;
           dealerPrint3 = false;
           dealerPrint4 = false;
           thirdDealerCard=false;
           fourthDealerCard=false;
           fifthDealerCard=false;
           result="";
           done=false;
           keepCardSum=false;
           keepCardSum2=false;
           keepCardSum3=false;
           keepCardSum4=false;
           cardsGood=true;
           cardsCreated=false;
           printCards=false;
           firstDealerSum=false;
           zeroithDealerSum=false;
           secondDealerSum=false;
           dealerStopped=false;
           aceDealerStopped=false;
           finalSum=0;
           blackjack=false;
         for (int c=0;c<52;c=c+1){
             cardarray[c].xpos=-100;
             cardarray[c].ypos=-100;
         }
         moveThings();
      }
        if (e.getKeyCode()==10){
            stay=true;
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getX()+","+e.getY());
        if (e.getX()>=320&& e.getX()<=405&&e.getY()>=605&&e.getY()<=690){
            if(hit2&&!hit3){
                hit3=true;
            }
            if(hit1&&!hit2){
                hit2=true;
            }
            hit1=true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


