/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mousee;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Windows10
 */
public class Mousee extends Applet implements MouseMotionListener{
int mx,my,cholce;
    public void init(){
        setBackground(Color.yellow);
        setSize(600,600);
        addMouseMotionListener(this);
        
    }
public void paint(Graphics g){
g.setColor(Color.red);
g.drawString("Erca Uca", mx+2, my+27);
g.drawString("Mouse LOCATİON:"+mx+"," +my,getWidth()/2-60,getHeight()/2-60);
g.setColor(Color.blue);
g.drawOval(mx, my-10, 60, 60);
}
    @Override
    public void mouseDragged(MouseEvent e) {
       
    }

    //@Override
    public void mouseClick(MouseEvent e) {
mx=e.getX();
        my=e.getY();
       // repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mx=e.getX();
        my=e.getY();
        repaint();
    }
    
}
