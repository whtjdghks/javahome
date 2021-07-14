package chap05;

public class StringEqualsExample {

	public static void main(String[] args) {
//자바는 문자열을 string 변수에 저장하기 때문에 string 을 먼저 선언해야한다.
		String strVar1 ="신민철";// strvar1 이 변수가 된다
		String strvar2 = "신민철";// 내용이 같고 변수명이 다르면 그 주소는 동일함 why? 내용이 같아서
		
		if(strVar1==strvar2) {
			System.out.println("strvar1과strvar2는 참조가 같음");
		}else {
			System.out.println("strvar1과strvar2는 참조가 다름");
		}
		if(strVar1.equals(strvar2)) {
			System.out.println("strvar1과strvar2는 문자열이 같음");
		}
		String strVar3 =new String("신민철");//여기서 new는 일종의 가방을 메모리공간에 만드는것
		//동적인 메모리에 만드는것이다. 이동성이 있다. 메모리는 스레드 단위로 움직임
		// 스레드 : 프로그램내에서 움직이는 프로세스의 단위
		// new 는 가방이라고 생각하면 된다.
		String strvar4 =new String("신민철"); // 3이랑 4는 new로 만드는 순간 메모리공간이 따로생겨서 
		//주소도 다르다 
		// !!!!!!!!!  0new 가 있으면 동적이 메모리 공간을 만든다 라는걸 인식하고 있어야한다.!!!!
		
		if(strVar3==strvar4) {
			System.out.println("strvar3과strvar4는 참조가 같음");
			
		}else {
			System.out.println("strvar3과strvar4는 참조가 다름");
		}
		if(strVar3.equals(strvar4)) {
			System.out.println("strvar3과strvar4는 문자열이 같음");
		}
	}

}
