package com.greedy.section01.javconfig;

public interface MemberDAO {
	
	/* 회원 번호로 회원 정보를 조회하는 메소드*/
	MemberDTO selectMember(int sequence);
	
	/* 회원 정보를 저장하고  결과를 리턴 받는  메소드*/
	boolean insertMember(MemberDTO member);

}
