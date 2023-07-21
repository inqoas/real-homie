package tw.idv.tibame.tha102.web.userinfo.service;

import java.lang.reflect.Member;

import tw.idv.tibame.tha102.web.userinfo.vo.UserInfo;

public interface MemberService {
	//註冊
	Member register(UserInfo userInfo);
	//登入
	Member login(UserInfo userInfo);
}
