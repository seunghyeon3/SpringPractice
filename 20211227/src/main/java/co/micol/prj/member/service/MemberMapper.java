package co.micol.prj.member.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

public interface MemberMapper {
	List<MemberVO> memberSelectList();

	MemberVO memberSelect(MemberVO member);

	int memberInsert(MemberVO member);

	int memberDelete(MemberVO member);

	int memberUpdate(MemberVO member);

	boolean isIdCheck(String id);
}