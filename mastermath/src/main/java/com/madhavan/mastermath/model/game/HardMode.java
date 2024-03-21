package com.madhavan.mastermath.model.game;

import org.springframework.stereotype.Component;

@Component("hard")
public class HardMode extends Game {

	@Override
	public void generate() {
		numberOne=getRandomNumber(10);
		numberTwo=getRandomNumber(10);
		answer=numberOne*numberTwo;
		int[] options = getfourChoices(answer);
		optionOne=options[0];
		optionTwo=options[1];
		optionThree=options[2];
		optionFour=options[3];

		symbol=" X ";

	}

}
