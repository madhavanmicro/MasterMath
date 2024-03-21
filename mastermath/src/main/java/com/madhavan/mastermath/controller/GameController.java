package com.madhavan.mastermath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.madhavan.mastermath.model.game.Game;
import com.madhavan.mastermath.model.player.Player;
import com.madhavan.mastermath.service.GameService;
import com.madhavan.mastermath.service.PlayerService;

@Controller
public class GameController {

	@Autowired
	PlayerService playerService;
	@Autowired
	GameService gameService;

	Player player; 
	ModelAndView modelAndView;
	Game game;
	String mode;

	public GameController() {
		modelAndView = new ModelAndView();
	}

	//Home page
	@GetMapping("/")
	public String home() {
		return "home";
	}

	//Registration
	@GetMapping("/signup")
	public ModelAndView signup() {
		modelAndView.setViewName("signup");
		return modelAndView;
	}

	//add player to database
	@PostMapping("addPlayer")
	public String addPlayer(@RequestParam("name") String name, @RequestParam("mobilenumber") String mobileNumber,
							@RequestParam("password") String pass) {
	
		playerService.createPlayer(name, mobileNumber, pass); //creating player in database
		return "sucesspage";

	}

	//login-page
	@GetMapping("/login")
	public ModelAndView login() {

		modelAndView.setViewName("login"); 
		return modelAndView;
	}

	//login validation
	@PostMapping("/login-validation")
	public ModelAndView login(@RequestParam("mobilenumber") String mobileNumber,
							  @RequestParam("pass") String password) {
				
		if (playerService.validatePlayerLogin(mobileNumber, password)) {
			player = playerService.getPlayerByMobileNumber(mobileNumber);//assign logged player to Instance player
			modelAndView.addObject("player", player);
			return welcome();
		} else {
			modelAndView.setViewName("login");
			return modelAndView;
		}
	}

	//welcome page
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		modelAndView.setViewName("welcome");
		modelAndView.addObject("top", playerService.topThreeHighScoreWithName());//update top highscores
		player.setScore(0);//setting score as 0 for game attempt 
		playerService.savePlayer(player);
		return modelAndView;
	}

	//display game modes
	@GetMapping("/gamemode")
	public ModelAndView gameMode() {
		modelAndView.setViewName("gamemode");
		return modelAndView;
	}

	//configure game data
	@GetMapping("/startgame")
	public ModelAndView startgame(@RequestParam("submitButton") String modeButtonValue) {
		mode = modeButtonValue.toLowerCase();
		modelAndView.setViewName("numbergame");
		game = gameService.getGame(mode); //getting game model for the selected mode
		modelAndView.addObject("game", game);

		return modelAndView;

	}

	//game data validation to update score
	@GetMapping("/result")
	public ModelAndView result(@RequestParam("submitButton") String clickedValue) {
		if (Integer.parseInt(clickedValue) == game.getAnswer()) {
			player.setScore(player.getScore() + 25);
			return startgame(mode);
		} else {
			playerService.updateHighScore(player);
			playerService.savePlayer(player);
			modelAndView.setViewName("gameover");
			return modelAndView;
		}

	}

	//logout message
	@GetMapping("/logout")
	public ModelAndView logout() {
		player = null;
		game = null;
		modelAndView.setViewName("logout");
		return modelAndView;
	}

}
