package com.example.tutorial.GameRunner.game;

public class Gamerunner {
	GamingConsole game;
	
	 public Gamerunner (GamingConsole game) {
		 this.game=game;
	 }
	public void run() {
		System.out.println("The geame is runnig"+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
