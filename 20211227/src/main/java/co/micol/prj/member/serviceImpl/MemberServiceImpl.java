package co.micol.prj.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.micol.prj.member.service.MemberMapper;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

@Repository("memberDao")  //@Service, @Component와 동일, 아무거나 써도 됨.
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper map; //IoC 에 있는 SqlSessionTemplate를 자동주입 
	

	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO member) {
		return map.memberSelect(member);
	}

	@Override
	public int memberInsert(MemberVO member) {

		return map.memberInsert(member);
	}

	@Override
	public int memberDelete(MemberVO member) {
		return map.memberDelete(member);
	}

	@Override
	public int memberUpdate(MemberVO member) {
		return map.memberUpdate(member);
	}

	@Override
	public boolean isIdCheck(String id) {
		return map.isIdCheck(id);
	}

	@Override
	public List<MemberVO> memberSearch(String key, String data) {
		return map.memberSearch(key, data);
	}

}
