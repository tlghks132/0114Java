import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
		int [] ar = {100, 300};
		System.out.println(ar[2]);   //ArrayIndexOutOfBoundsException 발생.
		
		}catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f.getLocalizedMessage());
			System.out.println("예외가 발생했다.");
		
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		//Exception 클래스가 ArrayIndexOutOfBoundsException 의 상위 클래스 라서
		//예외가 발생하면 Exception이 처리
		//아래 catch 구문은 도달 할 수 없는 코드가 된다.		
	}
		
		
	}

