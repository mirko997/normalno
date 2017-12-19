
package Stablol;

import javafx.scene.canvas.*;


public class Tree extends Canvas{
    GraphicsContext g2 = getGraphicsContext2D();

    public Tree() {
        super();
        setWidth(300);
        setHeight(300);
        draw(150,200,50,90);
    }
    
    public void draw(double x, double y, double lon, double angle){
        g2.setLineWidth(1);
        if(lon>2){
            double x1 = x + lon*Math.cos(Math.toRadians(angle));
            double y1 = y - lon*Math.sin(Math.toRadians(angle));
            g2.strokeLine(x, y, x1, y1);
            draw(x1,y1,lon*0.75,angle+30);
            draw(x1,y1,lon*0.66,angle-50);
        }
    }
   
}
