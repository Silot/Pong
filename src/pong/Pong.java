
package pong;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author tolis
 */
public class Pong implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
    public static Pong pong;
    
    public int width = 700, height = 700;
    
    public Renderer renderer;
    
    public Paddle player1;
    
    public Paddle player2;
    
    public Pong(){
        Timer timer = new Timer(20, this);
        
        JFrame jFrame = new JFrame("Pong");
        jFrame.setSize(width, height);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(renderer);
        
        timer.start();
    }
    
  
    public void start(){
        player1 = new Paddle(1);
        player2 = new Paddle(2);
    }
    
    private void update() {
       
    }

    void render(Graphics g) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        renderer.repaint();
    }

    
    
      public static void main(String[] args) {
         pong = new Pong();       
    }
    
}
