package tw.idv.tibame.tha102.web.userinfo.service.impl;

import java.lang.reflect.Member;

import tw.idv.tibame.tha102.web.userinfo.dao.UserInfoDao;
import tw.idv.tibame.tha102.web.userinfo.dao.UserInfoDaoImpl;
import tw.idv.tibame.tha102.web.userinfo.service.MemberService;
import tw.idv.tibame.tha102.web.userinfo.vo.UserInfo;



public class MemberServiceImpl implements MemberService{
	
	private UserInfoDao userInfoDao = null;
	public MemberServiceImpl() {
		userInfoDao = new UserInfoDaoImpl();
	}
	@Override
	public Member register(UserInfo userInfo) {
		
	}
	@Override
	public Member login(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
