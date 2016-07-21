package com.prolificidea.codeoff.content;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Content {

	private static List<String> jokes = new ArrayList<String>();
	private static final File file = new File("resources/Jokes.txt");
	
	public static List<String> getJokes() {
		if(jokes.isEmpty()) {
			loadJokes();
			return jokes;
		}
			return jokes;
	}
	
	private static void loadJokes() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
		    while ((line = br.readLine()) != null) {
		      jokes.add(line);
		    }
		    br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
