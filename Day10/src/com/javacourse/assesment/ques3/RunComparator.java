package com.javacourse.assesment.ques3;

import java.util.Comparator;

public class RunComparator implements Comparator<Player> {

    @Override
    public int compare(Player arg0, Player arg1) {
        if (arg0.getRuns() > arg1.getRuns())
            return 1;
        else if (arg0.getRuns() < arg1.getRuns())
            return -1;
        else
            return 0;
    }

}
