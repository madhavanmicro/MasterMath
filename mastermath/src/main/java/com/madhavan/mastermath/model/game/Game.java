package com.madhavan.mastermath.model.game;

import java.util.Random;

public abstract class Game {

	protected int numberOne;
	protected int numberTwo;

	protected int answer;

	protected int optionOne;
	protected int optionTwo;
	protected int optionThree;
	protected int optionFour;

	protected String symbol;



	public int getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	public int getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public int getOptionOne() {
		return optionOne;
	}
	public void setOptionOne(int optionOne) {
		this.optionOne = optionOne;
	}
	public int getOptionTwo() {
		return optionTwo;
	}
	public void setOptionTwo(int optionTwo) {
		this.optionTwo = optionTwo;
	}
	public int getOptionThree() {
		return optionThree;
	}
	public void setOptionThree(int optionThree) {
		this.optionThree = optionThree;
	}
	public int getOptionFour() {
		return optionFour;
	}
	public void setOptionFour(int optionFour) {
		this.optionFour = optionFour;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getRandomNumber(int upperLimit) {
		Random random = new Random();
		return random.nextInt(upperLimit);

	}


	public int[] getfourChoices(int number) {

		int[] choices = new int[4];
		int randomPosition = getRandomNumber(4);
		int options = number - randomPosition;
		for (int i = 0; i < 4; i++)
			choices[i] = options++;

		return choices;
	}

	public abstract void generate();


}
