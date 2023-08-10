package com.pre.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Xiaoli Liu
 * @version 1.0
 * Desc
*/
public class MyPanel extends JPanel {
    //define my tank
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //fill the frame
        g.fillRect(0,0,1000,750);

        //draw tank
        drawTank(hero.getX(),hero.getY(),g,0,0);


    }

    /**
     *
     * @param x: x-aixis of tank
     * @param y: y-axis
     * @param g pan
     * @param direct direction of tank
     * @param type tank's type
     */
    public  void drawTank(int x, int y,Graphics g,int direct,int type){
        switch (type) {
            case 0 ->//my tank
                    g.setColor(Color.cyan);
            case 1 ->//enemy's tank
                    g.setColor(Color.yellow);
        }
        switch (direct){
            case 0://up
                //left wheel
                g.fill3DRect(x,y,10,60,false);
                //right wheel
                g.fill3DRect(x+30,y,10,60,false);
                //middle component
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                //barrel
                g.drawLine(x+20,y+30,x+20,y);




                break;
            default:
                System.out.println("nothing to deal with");
        }

    }


}
