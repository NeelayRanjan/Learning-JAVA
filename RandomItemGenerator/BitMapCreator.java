import javax.swing.*;
import java.awt.*;
public class BitMapCreator extends JComponent{
    private int iterations;
    private int density;
    public void paintComponent(Graphics g){
        Rectangle rect = new Rectangle(5,10,density,density);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle bg = new Rectangle(-10,-10,5000,5000);
        g2.setColor(Color.GRAY);
        g2.fill(bg);
        g2.draw(bg);
        for (int i=0;i<=iterations;i++) {
            for (int k=0;k<=iterations;k++) {
                int p =(int)(Math.random()*2);
                if (p == 1){
                    g2.setColor(Color.BLACK);
                }else {
                    g2.setColor(Color.WHITE);
                }
                rect.translate(density,0);
                g2.fill(rect);
                g2.draw(rect);
            }
            rect.translate(-(density*(iterations+1)),density);
        }
    }
    public void setIterations(int i){
        iterations = i;
    }
    public void setDensity(int d){
        density = d;
    }
}
