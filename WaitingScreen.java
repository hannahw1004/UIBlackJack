import java.awt.*;
import javax.swing.*;
public class WaitingScreen {
    static JFrame wFrame;
    static JFrame dFrame;
    static JFrame gFrame;
    static JLabel waitingPlayer, waitingDealer;
    static JLabel waiting;
    public static void dealerWaitScreen(){
        wFrame = new JFrame("panel");
        

        JPanel p = new JPanel();
        p.setBounds(0,0,900,650);
        p.setLayout(null);

        waitingDealer = new JLabel("Waiting for Player...");
        waitingDealer.setFont(new Font("Verdana", Font.PLAIN, 25));
        waitingDealer.setBounds(300,100,400,400);

        p.add(waitingDealer);

        p.setBackground(Color.gray);

        dFrame.add(p);
        dFrame.setLayout(null);
        dFrame.setVisible(true);
        dFrame.setSize(900,650);
        dFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void playerWaitingScreen(){
        wFrame = new JFrame("panel");
        

        JPanel p = new JPanel();
        p.setBounds(0,0,900,650);
        p.setLayout(null);

        waitingPlayer = new JLabel("Waiting for Dealer's approval...");
        waitingPlayer.setFont(new Font("Verdana", Font.PLAIN, 25));
        waitingPlayer.setBounds(300,100,400,400);

        p.add(waitingPlayer);

        p.setBackground(Color.gray);

        wFrame.add(p);
        wFrame.setLayout(null);
        wFrame.setVisible(true);
        wFrame.setSize(900,650);
        wFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void waitingforGame(){
        gFrame = new JFrame("panel");
        

        JPanel p = new JPanel();
        p.setBounds(0,0,900,650);
        p.setLayout(null);

        waiting = new JLabel("Waiting for Game to Start...");
        waiting.setFont(new Font("Verdana", Font.PLAIN, 25));
        waiting.setBounds(250,90,400,400);

        p.add(waiting);

        p.setBackground(Color.gray);

        gFrame.add(p);
        gFrame.setLayout(null);
        gFrame.setVisible(true);
        gFrame.setSize(900,650);
        gFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public static void main(String[] args){

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //playerWaitingScreen();
                dealerWaitScreen();
                waitingforGame();
            }
        });


    }

}
