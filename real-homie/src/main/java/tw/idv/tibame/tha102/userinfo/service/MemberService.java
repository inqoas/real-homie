package tw.idv.tibame.tha102.userinfo.service;

import java.lang.reflect.Member;

public interface MemberService {
	//註冊
	Member register(Member member);
	//登入
	Member login(Member member);
	//修改
	Member edit(Member member);
}
