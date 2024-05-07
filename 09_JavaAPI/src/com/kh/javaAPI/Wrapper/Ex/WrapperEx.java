package com.kh.javaAPI.Wrapper.Ex;
/*
Wrapper = 감싸다
기본데이터타입 : primi tive types
	기본 자료형 타입을 객체로 감싸서 사용할 수 있는 클래스
	기본으로 제공해주는 int, double char, short, long, boolean, float,byte
	ArrayList 부를 때 사용 많이함
	Byte      = byte
	Short     = short
	Integer   = int
	Long      = long
	Float     = float
	Double    = double
	Character = char
	Boolean   = boolean
 */
public class WrapperEx {
	public static void main(String[] args) {
		//Byte
		Byte 바이트값 = 10;
		//Byte 객체로 된 값을 객체가 아닌 기본 byte값으로 사용할 때
		byte 기본바이트값 = 바이트값.byteValue();
		System.out.println("바이트 값 :" + 바이트값);
		System.out.println("기본 바이트 값 : "+기본바이트값);
		
		//short
		Short 쇼트값 = 20;
		short 기본쇼트값 = 쇼트값.shortValue();
		System.out.println("쇼트값 : "+쇼트값);
		System.out.println("기본쇼트값 : "+기본쇼트값);
		
		//Integer
		Integer 인테져값 = 30;
		int 기본인테져값 = 인테져값.intValue();
		System.out.println("인테져값"+인테져값);
		System.out.println("기본인테져값 :"+인테져값);
		
		//Long
		Long 롱값 = 40L;
		Long 기본롱값 = 롱값.longValue();
		System.out.println("롱값: "+롱값);
	
		//Float 
		Float 플롯값 = 50.5f;
		//Float -> float 기본 플롯값
		
		//Double 
		Double 더블값 = 60.6;
		//Double -> double 기본더블값
		
		Character 캐릭터값 = 'A';
		//Character -> char
		
		//Boolean
		Boolean 불리언값 = true;
		//Boolean -> boolean
	}
}
