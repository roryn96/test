
public class Ex7 {
	public static void main(String [] args) {
		// + : 부호연산자, 산술연산, 문자열 연결 연산자
		int i = 10;
		System.out.println(+i);
		int j = 10;
		System.out.println(i + j);
		String str = "홍길동" + 1;
		System.out.println(str);
		System.out.println("i+j=" + (i+j));
		String str1 = "java version : " + 1.8;
		System.out.println(str1);
		
		// 비교연산자 : if, for (제어문)에서 자주 사용
		i = 10;
		j = 20;
		boolean b =  i > j; // 비교 연산자의 결과값은 boolean으로 가져온다. (논리를 비교한 결과이기 때문에)
		System.out.println("i > j : " + b);
		b= i==j;
		System.out.println("i == j : " + b);
		b= i < j;
		System.out.println("i < j : " + b);
		b= i <= j;
		System.out.println("i <= j :" + b);
		
		float f = 10.1f;
		double d = 10.1;
		b = f==d;
		System.out.println("f == d : "+ b); // false
		b = (double) f==d;
		System.out.println("f == d : "+b); // false
		b = f==(float)d;
		System.out.println("f == d : "+b); // true
		
		i = 1;
		d = 1.0;
		b = i==d; //true
		System.out.println("i == d : " +b);
		
		
		
		
	}
}
