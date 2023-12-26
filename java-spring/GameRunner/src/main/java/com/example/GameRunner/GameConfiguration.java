package com.example.tutorial.GameRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.tutorial.GameRunner.game.Gamerunner;
import com.example.tutorial.GameRunner.game.GamingConsole;
import com.example.tutorial.GameRunner.game.Mariogame;
import com.example.tutorial.GameRunner.game.PackMan;


@Configuration
public class GameConfiguration {

	@Bean 
	
	public GamingConsole game () {
	      var game = new PackMan();
		return game;
	      
	}
	
@Bean 
	
	public Gamerunner gamerunner (GamingConsole game) {
	      var gamerunner = new Gamerunner(game);
		return gamerunner;
	      
	}

	

}
