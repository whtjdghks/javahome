package chap03;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		//문자열 변수는 위치값이 같음
		//==을 했을 경우 위치값으로 비교 . 니 어디사니
		//equal을 썻을경우 내용을 비교 . 니 이름은 뭐야
		System.out.println(strVar1==strVar2);
		System.out.println(strVar1==strVar3);//==은 번지를 참조한다.
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		 

	}

}
