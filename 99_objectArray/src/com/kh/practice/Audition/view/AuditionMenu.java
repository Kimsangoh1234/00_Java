package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;
import com.kh.practice.student.controller.StudentController;

public class AuditionMenu {
	private AuditionController AU = new AuditionController();
	
	public AuditionMenu() {
		
	}
	public void printAuditionMenu() {
		System.out.println("슈스케 이름 분야 점수");
		System.out.println("---------------");
		
		for(Audition audition : AU.printAudition()) {
			System.out.println(audition.inform());
		
		System.out.println("----------------");
		System.out.println("총점 : "+AU.sumscore());
		System.out.printf("평균 : %.2f/n",AU.avgScore());
		System.out.println("합격 점수 : "+(AU.avgScore()>=StudentController.CUT_LINE));
		}
		AU.printPass();
	}
}
