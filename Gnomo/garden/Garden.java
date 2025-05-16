/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomo.garden;

import gnomo.Gnome;
import gnomo.Sprite;
import gnomo.Troll;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author SOFIA RUDAS
 */
public class Garden extends Sprite {
    private Gnome gnome;
    private Troll troll;
    private boolean gnomeAlive = true;

    public Garden(int x, int y, int width, int height) {
        super(x, y, width, height, Color.GREEN);

        gnome = new Gnome(100, 100, 50, 50);
        troll = new Troll(400, 300, 50, 50); 
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);

        if (gnomeAlive) {
            gnome.draw(g);
            troll.draw(g);
        } else {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString("Gnomo muerto", 150, 200);
        }
    }

    public void handleKey(KeyEvent e) {
        if (!gnomeAlive) return;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
                gnome.handleKey(e);
                troll.moveToward(gnome);
                checkIfGnomeCaught();
                break;
        }
    }

    private void checkIfGnomeCaught() {
        if (troll.hit(gnome)) {
            gnomeAlive = false;
            System.out.println("Juego acabado");
            System.out.println("Gnomo muerto");
        }
    }
}
