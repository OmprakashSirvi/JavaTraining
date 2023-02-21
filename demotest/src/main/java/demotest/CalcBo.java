package demotest;

import java.util.ArrayList;
import java.util.List;

public class CalcBo {
	public int add(int a, int b) {
		return a+b;
	}
	public List<Integer> getAll(){
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		return li;
	}
}
