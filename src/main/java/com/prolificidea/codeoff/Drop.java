package com.prolificidea.codeoff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.List;
import java.util.Random;

import com.prolificidea.codeoff.content.Content;
import com.prolificidea.codeoff.themes.Theme;

public class Drop {

    private static Random rng = new Random();
    private int velocity, length, x, y;
    private char[][] text;
    private Theme theme = Config.THEME;
    private static List<String> jokes = Content.getJokes();
    private String joke;
    
    Drop(int x) {
    	joke = new StringBuilder(jokes.get(getRandomInteger(0, jokes.size()-1))).reverse().toString();
        this.x = x;
        length = joke.length();
        text = createContent(length);
        velocity = getRandomInteger(1, 4);
        this.y = (-1) * length * Config.FONT_SIZE;
    }

    protected char[][] createContent(int length) {
        char[][] result = new char[length][1];
        
        for (int i = 0; i < result.length; i++) {
            result[i][0] = joke.toCharArray()[i];
        }
        return result;
    }

    public void draw(Graphics2D g2) {
        int fontSize = g2.getFont().getSize();
        
        Color tail = theme.getTrailColor();
        Color lead = theme.getLeadColor();
        for (int i = 0; i < length; i++) {
        	
            if (i == length - 1) {
				g2.setColor(lead);
				g2.setFont(new Font("Monospaced", Font.BOLD, Config.FONT_SIZE));
            }
            else
                g2.setColor(tail);
            g2.drawChars(text[i], 0, 1, x, y + (i * fontSize));
            g2.setFont(new Font("Monospaced", Font.PLAIN, Config.FONT_SIZE));
        }
        y += velocity;
    }

    public static int getRandomInteger(int min, int max) {
        int randomNum = rng.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public boolean isOffScreen() {
        return (y > Config.SCREEN_SIZE_HEIGHT);
    }
}