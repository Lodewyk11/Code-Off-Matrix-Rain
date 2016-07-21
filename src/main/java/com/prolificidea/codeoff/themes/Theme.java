package com.prolificidea.codeoff.themes;

import java.awt.Color;

import com.prolificidea.codeoff.Drop;

public enum Theme {
	PLAIN_MATRIX(new Color(50,205,50),new Color(35,145,35)),
	RANDOM_COLORS(new Color(Drop.getRandomInteger(0, 255),Drop.getRandomInteger(0, 255),Drop.getRandomInteger(0, 255)), 
			new Color(Drop.getRandomInteger(0, 255),Drop.getRandomInteger(0, 255),Drop.getRandomInteger(0, 255)));
	
	private Color leadColor;
	private Color trailColor;
	
	Theme(Color leadColor, Color trailColor) {
		this.leadColor = leadColor;
		this.trailColor = trailColor;
	}

	public Color getLeadColor() {
		return leadColor;
	}

	public void setLeadColor(Color leadColor) {
		this.leadColor = leadColor;
	}

	public Color getTrailColor() {
		return trailColor;
	}

	public void setTrailColor(Color trailColor) {
		this.trailColor = trailColor;
	}
	
	
	
}
