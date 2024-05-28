package com.springbook.view.board;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController  {
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) throws IOException{
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			// new File("D:/example.txt")는 File 객체를 생성하여 해당 경로를 참조하도록 합니다
			String uploadPath = "C:/1kosmosc/sts/work_space3/upload/boarduploadfile/";
            // 파일 업로드
            uploadFile.transferTo(new File(uploadPath + fileName));
            
//            vo.setUploadFile();
			
		}
		boardDAO.insertBoard(vo);
		return "getBoardList.do";
	}
	

}
