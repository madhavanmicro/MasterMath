package com.madhavan.mastermath.model.game;

import org.springframework.stereotype.Component;

@Component("easy")
public class EasyMode extends Game{

	@Override
	public void generate() {
		numberOne=getRandomNumber(20);
		numberTwo=getRandomNumber(20);
		answer=numberOne+numberTwo;
		int[] options = getfourChoices(answer);
		optionOne=options[0];
		optionTwo=options[1];
		optionThree=options[2];
		optionFour=options[3];
		symbol=" + ";

	}

}
