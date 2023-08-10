package com.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Xiaoli Liu
 * @version 1.0
 * Desc
*/
public class MyPanel extends JPanel implements KeyListener {
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
        drawTank(hero.getX(),hero.getY(),g, hero.getDirect(), 1);




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
            // 0->up, 1->right, 2->down, 3->left
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

            case 1://right
                //left wheel
                g.fill3DRect(x,y,60,10,false);
                //right wheel
                g.fill3DRect(x,y+30,60,10,false);
                //middle component
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                //barrel
                g.drawLine(x+30,y+20,x+60,y+20);
                break;

            case 2://down
                //left wheel
                g.fill3DRect(x,y,10,60,false);
                //right wheel
                g.fill3DRect(x+30,y,10,60,false);
                //middle component
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                //barrel
                g.drawLine(x+20,y+30,x+20,y+60);
                break;

            case 3://left
                //left wheel
                g.fill3DRect(x,y,60,10,false);
                //right wheel
                g.fill3DRect(x,y+30,60,10,false);
                //middle component
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                //barrel
                g.drawLine(x+30,y+20,x,y+20);
                break;
            default:
                System.out.println("nothing to deal with");
        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_W || e.getKeyCode()==KeyEvent.VK_UP){//FOR W and up
            hero.setDirect(0);
            hero.moveUp();

        }
        else if(e.getKeyCode()==KeyEvent.VK_D || e.getKeyCode()==KeyEvent.VK_RIGHT){//FOR D and right
            hero.setDirect(1);
            hero.moveRight();

        }
        else if(e.getKeyCode()==KeyEvent.VK_S || e.getKeyCode()==KeyEvent.VK_DOWN){//FOR S and down
            hero.setDirect(2);
            hero.moveDown();

        }
        else if(e.getKeyCode()==KeyEvent.VK_A || e.getKeyCode()==KeyEvent.VK_LEFT){//FOR A and left
            hero.setDirect(3);
            hero.moveLeft();

        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
