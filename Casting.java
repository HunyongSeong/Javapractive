
public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1; // 이것은 정수지만 손실이 없기 때문에 자동으로 캐스팅 시켜준것이다.
		double b2 = (double) 1; // '수동으로' 프로그래밍에서는 '명시적으로' 라고 한다.

		System.out.println(b);
		
//		int c = 1.1;
		double d = 1.1; // 실수에 맞는 double을 사용하여라.
		int e = (int) 1.1; // 실수를 강제로 인트로 바꾸어 주겠다.
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1); // 숫자 1을 넣으면 인티저를 스트링으로 바꾸나 보다~ 생각해라.
		System.out.println(f);// 여기서 나오는 1은 숫자가 아니라 문자열이다.
		System.out.println(f.getClass());// 여기서 .getClas() 란 f 의 Datatype을 볼 수 있는 코드다.


		
	}

}
