package chap03;

public class InputdatacheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		double currentBalance =10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val=0.0; //이 부분이 NaN을 만났을대 초기화 되는 부분
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
/*산술연산에서 / 와 %를 사용할경우 0으로 계산하면 오류가 발생하게
	되고 이를방지하기 위해 Infinity,NaN을 만나면 0.0으로 초기화할것*/
}
