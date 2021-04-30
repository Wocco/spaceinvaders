package graphics;
import be.uantwerpen.fti.ei.spaceinvaders.GamePanel;

import javax.swing.JFrame;
public class Window extends JFrame{
    public Window(){
        setTitle("~ SPACEINVADERS ~");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(896,896));//here we start the gamepanel
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
