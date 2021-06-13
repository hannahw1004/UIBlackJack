
import java.awt.*;
import javax.swing.*;

public class DisplayClientUserName {
    static JFrame frame; 
    static JButton accept, decline;
    static JLabel player;

    static JButton confirm;
    static JTextField edit;

    public static void createClientInput(){
        frame = new JFrame("panel");
        

        JPanel p = new JPanel();
        p.setBounds(0,0,900,650);
        p.setLayout(null);

        player = new JLabel("Player:_________");
        player.setFont(new Font("Verdana", Font.PLAIN, 25));
        player.setBounds(300,100,250,250);

        accept = new JButton("Accept");
        accept.setFont(new Font("Verdana", Font.PLAIN, 10));
        accept.setBounds(300,320,80,25);
        decline = new JButton("Decline");
        decline.setFont(new Font("Verdana", Font.PLAIN, 10));
        decline.setBounds(460,320,80,25);


        p.add(player);
        p.add(accept);
        p.add(decline);

        p.setBackground(Color.gray);

        frame.add(p);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(900,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void jpan(){
        frame = new JFrame("panel");
        

        JPanel p = new JPanel();
        p.setBounds(0,0,900,650);
        p.setLayout(null);

        player = new JLabel("Name:");
        player.setFont(new Font("Verdana", Font.PLAIN, 25));
        player.setBounds(300,100,250,250);

        edit = new JTextField(" ");
        edit.setBounds(400, 210, 150, 30);

        confirm = new JButton("Confirm");
        confirm.setFont(new Font("Verdana", Font.PLAIN, 10));
        confirm.setBounds(400,320,80,25);


        p.add(player);
        p.add(confirm);
        p.add(edit);

        p.setBackground(Color.gray);

        frame.add(p);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(900,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                createClientInput();
                jpan();
            }
        });


    }

}
