/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gnomo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author SOFIA RUDAS
 */
public class Gnome extends Sprite {
    
    public static final int STEP = 10;
    
    public Gnome(int x, int y, int width, int height) {
        super(x, y, width, height, Color.WHITE);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public void handleKey(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                y -= STEP;
                break;
                
            case KeyEvent.VK_DOWN:
                y += STEP;
                break;
                
            case KeyEvent.VK_LEFT:
                x -= STEP;
                break;
                
            case KeyEvent.VK_RIGHT:
                x += STEP;
                break;
        }  
    }
}
