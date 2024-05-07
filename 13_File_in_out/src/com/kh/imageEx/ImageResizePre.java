package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	//원본이미지 pigs.jpg pigs_cute.jps 가로=400 세로=200
	public static void main(String[] args) {
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 사이즈조정이미지 = "src/com/kh/imageEx/pigs_cute.jpg";
		
		int 가로길이= 400;
		int 세로길이= 200;
		//원본 이미지 데이터를 버퍼 이미지로 읽어들임
		try {
			BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
			//새로운 크기 이미지 생성
			BufferedImage 크기조정이미지 = new BufferedImage(가로길이,세로길이,BufferedImage.TYPE_INT_RGB);
			//이미지 크기 조정해서 새로운 이미지에 그릴것!
			Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로길이, 세로길이, Image.SCALE_AREA_AVERAGING);
			//모든 준비 완료 이미지 그리기 시작!
			크기조정이미지.createGraphics().drawImage(이미지그리기, 0, 0, null);
			ImageIO.write(크기조정이미지, "jpg", new File(사이즈조정이미지));
			System.out.println("이미지 크기 조정 성공!");
		}catch (IOException e) {
			System.out.println("이미지 젖아에 실패했습니다.");
			e.printStackTrace();
		}
	}
}
