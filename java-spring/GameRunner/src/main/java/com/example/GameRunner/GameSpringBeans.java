package com.example.tutorial.GameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.tutorial.GameRunner.game.Gamerunner;
import com.example.tutorial.GameRunner.game.GamingConsole;


@Configuration
public class GameSpringBeans {

public static void main(String [] args) {

	try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
		context.getBean(GamingConsole.class).up();

		context.getBean(Gamerunner.class).run();


	}


}
}