/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reloj;

import javax.swing.JFrame;
import reloj.v.PanelReloj;

/**
 *
 * @author SOFIA RUDAS
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reloj en Tiempo Real");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PanelReloj());
        frame.setSize(500, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
   
    }   
}
