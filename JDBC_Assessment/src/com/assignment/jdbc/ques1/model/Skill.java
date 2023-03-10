package com.assignment.jdbc.ques1.model;

public class Skill {
	private long skillId;
	private String skillName;

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Skill(int skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public Skill() {
	}

	@Override
	public String toString() {
		return skillName;
	}

}
