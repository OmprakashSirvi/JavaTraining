package com.javacourse.ques1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		if (o1.getName().compareTo(o2.getName()) == 0){
			return o1.getSkill().compareTo(o2.getSkill());
		}
		
		return o1.getName().compareTo(o2.getName());
	}

}
