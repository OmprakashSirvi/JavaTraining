package com.javaCourse.ques1;

import java.util.*;

public class Match {
	private ArrayList<Integer> scores = new ArrayList<Integer>();

	Match(String score, String matchType) {
		String[] stScores = score.split(",");
		for (String strScore : stScores) {
			scores.add(Integer.parseInt(strScore));
		}
	}
}
