package com.pre.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Xiaoli Liu
 * @version 1.0
 * Desc: how ball move(event control)
*/
public class BallMove extends JFrame{
    Mypanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();


    }

    public BallMove(){
        mp = new Mypanel();
        this.add(mp);
        this.setSize(400,300);
        //JFrame can listen for the panel mp
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// Listening the event from keyboard.
class Mypanel extends JPanel implements KeyListener {

    // in order to let circle moving, set the axis to the variable
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    //character input
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //trigger when key pressed
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;

        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        //repaint
        this.repaint();
    }



    //trigger when key released
    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println((char)e.getKeyCode()+" been pressed");
    }
}