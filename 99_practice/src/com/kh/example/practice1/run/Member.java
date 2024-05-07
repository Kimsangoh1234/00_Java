package com.kh.example.practice1.run;

public class Member {

	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public Member() {
		
	}
	public void changeName(String name) {
		this.memberName=name;
		System.out.println("변경된 이름 : " + name);
	}
	public void printName(String name) {
		System.out.println("이름 : "+memberName);
	}
}
