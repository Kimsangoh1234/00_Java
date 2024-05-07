package com.kh.example.practice7.model.ve;

public class Employee {
	public int empNo;
	public String empName;
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonuspoint;
	public String phone;
	public String address;
	
	public Employee() {
		
	}
	public Employee(int empNo, String empNmae,String job, int age, char gender,
			int salary, double bonuspoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.job=job;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.bonuspoint=bonuspoint;
		this.phone=phone;
		this.address=address;
	}


	}
/*
 +Employee()
 +Employee(empNo;int, emPName : String)
 +Employee(empNo;int, empName : String, dept : String, job: String,age :int,gender:
 * 
 * 
 */
