/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comegalletas.v;

import javax.swing.JFrame;

/**
 *
 * @author SOFIA RUDAS
 */
public class gameWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComeGalletas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Garden());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
