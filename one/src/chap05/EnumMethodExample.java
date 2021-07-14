package chap05;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		//180p

	}

}
