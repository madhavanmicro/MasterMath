package com.madhavan.mastermath.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhavan.mastermath.dao.PlayerDao;
import com.madhavan.mastermath.model.player.Player;

@Service
public class PlayerService {

	@Autowired
	PlayerDao dataBase;

	//Create player
	public void createPlayer(String name, String mobileNumber, String password) {

		Player player = new Player();
		player.setPassword(password);
		player.setName(name);
		player.setMobileNumber(mobileNumber);

		dataBase.save(player);
	}

	//store the player to database
	public void savePlayer(Player player) {
			dataBase.save(player);

	}

	//update the player's high score
	public void updateHighScore(Player player) {
			player.setHighScore(Math.max(player.getHighScore(), player.getScore()));
			dataBase.save(player);
	}

	//get player
	public Player getPlayerByMobileNumber(String mobileNumber) {
		
		Player player = dataBase.findById(mobileNumber).orElse(null);
		return player;
	}

	//validate with user id and password
	public boolean validatePlayerLogin(String mobileNumber, String password) {

		Player player = dataBase.findById(mobileNumber).orElse(null);

		return player != null && player.getPassword().equals(password);
	}


	//get top 3 high score details
	public List<String> topThreeHighScoreWithName(){

		List<String> topHighScoreList = new ArrayList<>();
		List<Integer> list=dataBase.topThreeHighScore();
		
		for(Integer highScore:list) {
			List<String> nameList=dataBase.getNamesForHighScore(highScore);
			String names=nameList.stream().collect(Collectors.joining(", "));	
			topHighScoreList.add(highScore+" - "+names);		
		}
		return topHighScoreList;

	}

}
