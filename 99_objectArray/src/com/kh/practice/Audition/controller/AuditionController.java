package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {
	private Audition[] sArr= new Audition[5];
	public static final int CUT_LINE=60;
	
	public AuditionController() {
		sArr[0]=new Audition("김영희","발라드",100);
		sArr[1]=new Audition("박영희","힙합",50);
		sArr[2]=new Audition("이연이","뮤지컬",85);
		sArr[3]=new Audition("정영히","댄스",60);
		sArr[4]=new Audition("홍영희","팝",20);
	}
	public Audition[] printAudition() {
		return sArr;
	}
	public int sumscore() {
		int sum = 0;
		for(Audition a : sArr) {
			sum += a.getScore();
		}
		return sum;
	}
	public double avgScore() {
		double avgArr = sumscore()/sArr.length;
		return avgArr;
	}
	public void printPass() {
		for(Audition a : sArr) {
			a.setPassed(a.getScore()>=CUT_LINE);
			System.out.println(a.getName() + "참가자는" + (a.isPassed()? "통과" :"불합격입니다."));
		}
	}
}
