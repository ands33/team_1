package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping("/login.do")
	public String loginView(UserVO vo, UserDAO userDAO, HttpSession session) {
		UserVO user = userDAO.getUser(vo);
		UserVO user1 = userDAO.getUserOne(vo);
		if (user != null) {
	        session.setAttribute("userName", user.getU_name());
	        if ("admin".equals(user1.getU_id()) && "admin123".equals(user1.getU_pw())){
	        	System.out.println("유저리스트로1");
	            return "redirect:getUserList.do";
	        } else {
	        	System.out.println("보드리스트로1");
	            return "redirect:getBoardList.do";
	        }
	    } else {
	        return "login.jsp";
	    }
	}
}
	
//	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
//	public String loginView(UserVO vo) {
//		System.out.println("로그인 화면으로 이동");
//		vo.setU_id("test");
//		vo.setU_pw("test123");
//		return "login.jsp";
//	}
//
//	@RequestMapping(value = "/login.do", method = RequestMethod.GET) // 메소드를 받으려면 value 처리를 해야함
//	public String login(UserVO vo, UserDAO userDAO) {
//		System.out.println("로그인 인증 처리");
//		if (userDAO.getUser(vo) != null)
//			return "getBoardList.do";
//		else
//			return "login.jsp";
//	}


