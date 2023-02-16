package com.javacourse.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLower {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("hhueue");
		l1.add("hehe");
		l1.add("huehue");
		l1.add("lioi");
		
		List<String> l2 = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(l1);
		System.out.println(l2);
		
	}
}
