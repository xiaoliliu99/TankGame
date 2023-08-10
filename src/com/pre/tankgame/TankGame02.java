package com.pre.tankgame;

import javax.swing.*;
/**
 * @author Xiaoli Liu
 * @version 2.0
 * Desc: tank can move
 */
public class TankGame02 extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();

    }

    public TankGame02(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
