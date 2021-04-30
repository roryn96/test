
public class Ex8 {
	public static void main (String [] args) {
		//논리연산자 :  논리현 (boolean)을 연산 : 참과 거짓인 값을 연산
		
		int i = 65;
		int j = 70;
		int z = 80;
		boolean b = i<j;  // true
		boolean b1 = i>z; // false
		
		boolean result = b && b1; //false
		System.out.println(result);		
		
	}
}
