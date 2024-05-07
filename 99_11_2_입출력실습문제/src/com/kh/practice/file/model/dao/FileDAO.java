package com.kh.practice.file.model.dao;

import java.io.File;
import java.util.*;

public class FileDAO {
	private Map<String,String> files = new HashMap<>();
	
	//파일 이름이 존재하는지 containsKey
	public boolean checkName(String file) {
		return files.containsKey(file);
	}
	//파일 저장 유무 확인 put
	public StringBuilder fileSave(String File,String s) {
		files.put(File, s);
		System.out.println("파일 저장 완료 : "+s);
		if(files.containsKey(s)) {
			System.out.println("파일 열기 완료 : "+s);
			return new StringBuilder(files.get(s));
		}else {
			System.out.println("파일이 존재하지 않습니다.");
			return new StringBuilder();
		}
	//파일 내용 수정
	}public void fileEdit(String file,String s) {
		
	}
	public StringBuilder fileOpen(String file) {
		// TODO Auto-generated method stub
		return null;
	}
}

