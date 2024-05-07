package practice3.model.vo;

import java.util.Random;

//true면 토끼
//false면 말이 들어감
public class AnimalWorld {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		Random random = new Random();
		for(int i=0; i<animals.length; i++) {
			if(random.nextBoolean()) {
				animals[i] = new Rabbit("토깽이" + i, "토끼", random.nextInt(20)+1,   "갈색");
			}else {
				animals[i] = new Horse("힝힝이" + i, "얼룩말", "우리집","흰&검정색"	);
			}
		}
		for(Animal a : animals) {
			a.speak();
		}
	}
}
