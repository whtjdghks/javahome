package chap05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		//args argument의 줄임말
		
		if(args.length !=2) {
			System.out.println("프로그램사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		//문자를 정수로 ▽ 위가 	String 이기 때문에  정수 int로 바꿔줘야한다
		int num1 =Integer.parseInt(strNum1);//Integer.parseInt 들어온 문자를 숫자로 바꿔줘라
		int num2 =Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1+ " + "+ num2 + "="+result
				);
		//161P 참고
		
	}

}
