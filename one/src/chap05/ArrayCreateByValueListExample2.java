package chap05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores =new int[] {83,90,87};
		int sum1 =0;
		
		 for(int i=0; i<3; i++) {
			 sum1 += scores[i];//인라인함수
		 }
		 	System.out.println("총합 :"+ sum1);
		 	//리턴된 총합을 sum2에 저장
		 	int sum2 = add(new int[] {83,90,87});
		 	System.out.println("총합 :"+ sum2);
		 	System.out.println();
		 	
	}// ↓ 총합을 계산해서 리턴하는 메소드
public static int add(int[] scores) {
	int sum = 0;
	for(int i = 0; i<3; i++) {
		sum += scores[i];
	}//블록화 방식 , 호출하기 편하고 ,만들기 편함
	return sum;
}
}
