package com.prolificidea.codeoff;

import java.awt.GraphicsEnvironment;

import com.prolificidea.codeoff.themes.Theme;

public interface Config {

    
    int SCREEN_SIZE_HEIGHT = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
    int SCREEN_SIZE_WIDTH = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
    int FONT_SIZE = 20;
    Theme THEME = Theme.PLAIN_MATRIX;

}
