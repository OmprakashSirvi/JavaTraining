package com.javacourse.assesment.ques3;

import java.util.Comparator;

public class PowerRatingComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getPowerRating() > o2.getPowerRating())
			return 1;
		else if (o1.getPowerRating() < o2.getPowerRating())
			return -1;
		return 0;
	}

}
