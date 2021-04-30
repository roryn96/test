
public class Ex5 {

	public static void main(String[] args) {
		// i++ : i = i + 1
		// i-- : i = i - 1
		int i = 10;
		--i ;
		System.out.println(i);
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		System.out.println(--i);// 선행연산
		System.out.println(i--);// 후행연산
		System.out.println(i);
		
	}

}
