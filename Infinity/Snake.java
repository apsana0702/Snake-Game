import java.awt.Color;
// import java.awt.Graphics;
import javax.swing.JFrame;

public class Snake {
    public static void main(String args[]){
            JFrame f=new JFrame();
            f.setTitle("Snake game");
            f.setBounds(10,10,905,700);
            f.setResizable(false);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBackground(Color.DARK_GRAY);

            Gameplay gm=new Gameplay();
            f.add(gm);
    }
}
