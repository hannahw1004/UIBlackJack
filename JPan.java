import java.awt.*;
import javax.swing.*;

public class JPan {
    static JFrame frame; 
    static JButton confirm;
    static JLabel player;
    static JTextField edit;

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
                
                jpan();
            }
        });


    }

}
