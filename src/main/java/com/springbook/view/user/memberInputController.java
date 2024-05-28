package com.springbook.view.user;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class memberInputController {

   @RequestMapping("/memberInput.do")
   public String insertUser(UserVO vo, UserDAO userDAO) throws Exception, IOException {
	  MultipartFile uploadFile = vo.getU_pic();
	  if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			// new File("D:/example.txt")는 File 객체를 생성하여 해당 경로를 참조하도록 합니다
			String uploadPath = "C:/1kosmosc/sts/work_space3/upload/useruploadfile/";
          // 파일 업로드
          uploadFile.transferTo(new File(uploadPath + fileName));
	  }
      userDAO.insertUser(vo);
      return "login.jsp";
   }  
}