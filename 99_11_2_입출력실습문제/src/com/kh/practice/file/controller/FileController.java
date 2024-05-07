package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
FileDAO fd = new FileDAO();
	
	//이름이 존재하는지 확인하는 코드 작성
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	public void filesave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
	}
	
	//파일열기
	public StringBuilder fileOpen(String file)	{
		return fd.fileOpen(file);
	}
	//파일수정
	public void fileEdit(String file,StringBuilder sb) {
		fd.fileEdit(file,sb.toString());
	}
}

