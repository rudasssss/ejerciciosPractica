/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author SOFIA RUDAS
 */
public class Troll extends Sprite {
    public static final int SPEED = 5;

    public Troll(int x, int y, int width, int height) {
        super(x, y, width, height, Color.GRAY);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void moveToward(Gnome gnome) {
        if (gnome.getX() > x) x += SPEED;
        else if (gnome.getX() < x) x -= SPEED;

        if (gnome.getY() > y) y += SPEED;
        else if (gnome.getY() < y) y -= SPEED;
    }
}
