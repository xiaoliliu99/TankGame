package com.pre.tankgame;

import javax.swing.*;
/**
 * @author Xiaoli Liu
 * @version 1.0
 * Desc
*/
public class TankGame extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();

    }

    public TankGame(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
