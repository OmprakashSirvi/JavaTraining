package com.einfo.repository;

import java.util.ArrayList;
import java.util.List;

import com.einfo.model.Member;

public class MemberRepository {
	public List<Member> getMembers() {
		List<Member> members = new ArrayList<>();
		members.add(new Member(1, "test", "1234"));
		members.add(new Member(2, "test1", "12345"));

		return members;
	}

	public Member getMemberByEmail(String email) {
		return new Member(1, "test", "1234");
	}
}
