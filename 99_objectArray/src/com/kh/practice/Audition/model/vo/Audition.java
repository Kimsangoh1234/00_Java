package com.kh.practice.Audition.model.vo;

public class Audition {
public String name;
public String value;
public int score;
public void setName(String name) {
	this.name = name;
}
public void setValue(String value) {
	this.value = value;
}
public void setScore(int score) {
	this.score = score;
}
public String getName() {
	return name;
}
public String getValue() {
	return value;
}
public int getScore() {
	return score;
}
public boolean passed;
public boolean isPassed() {
	return passed;
}
public void setPassed(boolean passed) {
	this.passed = passed;
}
public Audition() {
	
}
public Audition(String name, String value, int score) {
	this.name=name;
	this.value=value;
	this.score=score;
}
public String inform() {
	return "이름 : " + name+ " 분야 : "+value+"점수 :"+score;
	
}
}
