package com.javacourse.ques2;

import java.util.Objects;

public class Bowler {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bowler(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bowler other = (Bowler) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Bowler name=" + name;
	}

}
