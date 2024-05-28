package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class updateUserController {
	@RequestMapping("/updateUser.do")
	public String updateUser(UserVO vo, UserDAO userDAO) {
		
		userDAO.updateUser(vo);
		return "getUserList.do";
	}

}
