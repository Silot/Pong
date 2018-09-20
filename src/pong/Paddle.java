
package pong;

/**
 *
 * @author tolis
 */
public class Paddle {
    
    public int paddleNumber;
    
    public int x, y, width = 100, height = 500;
    
    public int score;
    
    public Paddle(int paddleNumber){
        this.paddleNumber = paddleNumber;
        
        if(paddleNumber == 1){
            this.x = width;
        }
        if(paddleNumber == 2){
            this.x = Pong.pong.width - width;
            
        }
        
         this.y = Pong.pong.height/2 - this.height/2;
        
        
    }
    
    
}
