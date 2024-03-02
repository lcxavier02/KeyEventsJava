package keyevents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends JFrame {
    
    public KeyEvents() {
        super("Key Events");
        setSize(400, 400);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Tecla escrita: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Tecla presionada: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Tecla soltada: " + KeyEvent.getKeyText(e.getKeyCode()));
            }
        });
    }

    public static void main(String[] args) {
       new KeyEvents(); 
    }
    
}
