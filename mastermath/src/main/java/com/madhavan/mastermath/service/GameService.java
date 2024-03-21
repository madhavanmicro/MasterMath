package com.madhavan.mastermath.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.madhavan.mastermath.model.game.Game;

@Service
public class GameService {


	public Game getGame(String mode) {
		AnnotationConfigApplicationContext context;
		context=new AnnotationConfigApplicationContext(com.madhavan.mastermath.model.game.ConfigBeans.class);

		Game gameData=(Game)context.getBean(mode);
		gameData.generate();
		context.close();
		return gameData;
	}

}
