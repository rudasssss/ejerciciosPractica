/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comegalletas;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SOFIA RUDAS
 */
public class Galleta extends Sprite {
    public Galleta(int x, int y, int width, int height) {
        super(x, y, height, width);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

