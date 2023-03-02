package com.assignment.jdbc.ques1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assignment.jdbc.ques1.config.ConnectionConfig;
import com.assignment.jdbc.ques1.model.Skill;

public class SkillDAO {
	public Skill getSkillById(int skill_id) throws SQLException {
		Connection connect = ConnectionConfig.connect();

		PreparedStatement prepareStatement = connect.prepareStatement("select * from skill where skill_id=?");
		prepareStatement.setInt(1, skill_id);

		ResultSet resultSet = prepareStatement.executeQuery();
		Skill retSkill = new Skill();

		while (resultSet.next()) {
			retSkill.setSkillId(resultSet.getLong(1));
			retSkill.setSkillName(resultSet.getString(2));
		}

		return retSkill;
	}
}
