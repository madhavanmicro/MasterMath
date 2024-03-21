package com.madhavan.mastermath.model.player;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Player {

		@Id
		private String mobileNumber;
		private String name;
		private String password;
		private int highScore;
		private int score;
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getHighScore() {
			return highScore;
		}
		public void setHighScore(int highScore) {
			this.highScore = highScore;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "Player [mobileNumber=" + mobileNumber + ", name=" + name + ", password=" + password + ", highScore="
					+ highScore + ", score=" + score + "]";
		}

}
