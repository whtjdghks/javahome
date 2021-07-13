package chap03;

public class InputdatacheckNaNExample1 {
//대입연산자 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";//이곳에서 유저인풋은 문자열
		
		double val = Double.valueOf(userInput);//여기서 val은 NaN이 된다.
		//NAN이 double때문에 정수의 입장에서 보게된다.
		double currentBalance =10000.0;
		//NAN이나 INFINITY에는 어떤값을 더해도 NAN과 INFINITY밖에 안뜬다
		//결론은 아무 계산도 안되는 상태
		
		currentBalance += val;// -> 100000+NaN (대입연산자) 결과는?
		System.out.println(currentBalance);
	}

}
