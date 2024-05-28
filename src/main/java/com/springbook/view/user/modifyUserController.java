package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class modifyUserController {
	@RequestMapping("/modifyUser.do")
	public String modifyUser(UserVO vo, UserDAO userDAO, Model model) {
		model.addAttribute("user", userDAO.getUserOne(vo));
		return "modifyUser.jsp";
	}

}
