/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comegalletas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author SOFIA RUDAS
 */
public class ComeGalletas extends Sprite implements Runnable {
    private ArrayList<Galleta> galletas;

    public ComeGalletas (int x, int y, int width, int height, ArrayList<Galleta> galletas) {
        super(x, y, height, width);
        this.galletas = galletas;
    }

    public void run() {
        while (true) {
            Galleta nearest = findNearestCookie();
            if (nearest != null) {
                moveTowards(nearest);
                eatIfReached(nearest);
            }

            try {
                Thread.sleep(20); 
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private Galleta findNearestCookie() {
        Galleta closest = null;
        int minDistance = Integer.MAX_VALUE;

        for (Galleta c : galletas) {
            int distance = Math.abs(x - c.getX()) + Math.abs(y - c.getY());
            if (distance < minDistance) {
                minDistance = distance;
                closest = c;
            }
        }

        return closest;
    }

    private void moveTowards(Galleta target) {
        if (target.getX() > x){
            x++;
        }
        else if (target.getX() < x){
            x--;
        }

        if (target.getY() > y){
            y++;
        }
        else if (target.getY() < y){
            y--;
        }
    }

    private void eatIfReached(Galleta target) {
        if (this.checkCollision(target)) {
            galletas.remove(target);
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

