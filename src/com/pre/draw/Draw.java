package com.pre.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author Xiaoli Liu
 * @version 1.0
 * Desc:record how to draw basic shape on the window
 * 1.define MyPanel which extend to JPanel
 *
*/
public class Draw extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        new Draw();

    }
    public Draw(){
        //initial panel
        mp = new MyPanel();
        // put the panel to the frame
        this.add(mp);
        //set the frame size
        this.setSize(400,300);
        //when close the window, exit the process
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

class MyPanel extends JPanel {

    //paint method
    //initial by call parents method
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("call it");
        //draw the circle
        //g.drawOval(10,10,100,100);

        //draw a line
        //g.drawLine(10,10,100,100);

        //draw line rectangular
        //g.drawRect(10,10,100,100);

        //filled rect
        //g.setColor(Color.blue);
        //g.fillRect(10,10,100,100);

        //filled circle
        //g.setColor(Color.black);
        //g.drawOval(10,10,100,100);

        //draw a image

        //get image from the root
        //Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/interlude_32.png"));
        //g.drawImage(image,10,10,192,108,this);

        //draw the string
        //g.setColor(Color.cyan);
        //g.setFont(new Font("Arial",Font.BOLD,50));
        //g.drawString("Hello world",100,100);


    }
}