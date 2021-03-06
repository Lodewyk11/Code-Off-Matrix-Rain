package com.prolificidea.codeoff;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class Rain extends JPanel {

	private static final long serialVersionUID = 1L;

	private Drop[] drops;

    Rain() {
    	drops = new Drop[Config.SCREEN_SIZE_WIDTH / Config.FONT_SIZE];
        for (int i = 0; i < drops.length; i++) {
            drops[i] = new Drop(i * Config.FONT_SIZE);
        }
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Config.SCREEN_SIZE_WIDTH, Config.SCREEN_SIZE_HEIGHT);
        
        Font font = new Font("Monospaced", Font.PLAIN, Config.FONT_SIZE);
        g2.setFont(font);

        for (int i = 0; i < drops.length; i++) {
            if (drops[i].isOffScreen()) {
                drops[i] = new Drop(i * Config.FONT_SIZE);
            }
            drops[i].draw(g2);
            super.repaint();
        }

        try {
            Thread.sleep(10);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        repaint();
    }
    

}
