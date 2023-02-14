package com.javaCourse.ques1;

import java.util.*;

public class SortScore extends Thread {
	private String matchString;
	private String scoreString;
	private ArrayList<Integer> scores = new ArrayList<Integer>();

	public SortScore(String matchString, String scoreString) {
		this.matchString = matchString;
		this.scoreString = scoreString;

		System.out.println("Current Match is : " + this.matchString);

		for (String strScore : this.scoreString.split(",")) {
			this.scores.add(Integer.parseInt(strScore));
		}
	}

	@Override
	public void run() {
		Collections.sort(scores);
	}

	public ArrayList<Integer> getScores() {
		return this.scores;
	}

}
