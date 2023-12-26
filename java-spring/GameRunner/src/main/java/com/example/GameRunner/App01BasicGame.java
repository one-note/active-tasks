package com.example.tutorial.GameRunner;

import com.example.tutorial.GameRunner.game.Gamerunner;
import com.example.tutorial.GameRunner.game.Mariogame;
import com.example.tutorial.GameRunner.game.PackMan;

public class App01BasicGame {

	public static void main(String[] args) {

	//	var game = new Mariogame();
		var game = new PackMan();
		
		
		var gamerunner = new Gamerunner(game);
	
		gamerunner.run();

	}

}
