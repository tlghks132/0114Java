import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// DTO클래스의 인스턴스를 만들고 내용을 채운 후 출력
		DTO dto1 = new DTO();
		dto1.setNum(1);
		dto1.setName("김정화");
		//출력 - 인스턴스 이름을 출력하는 메소드에 대입하면 toString()을 호출한 결과가 출력
		System.out.println(dto1.toString());
		
		DTO dto2 = new DTO();
		dto2.setNum(1);
		dto2.setName("김정화");
		
		//참조를 비교 -각각 new를 했기 때문에 참조가 다름
		System.out.println(dto1 == dto2);
		//내용을 비교- equals를 재정의해서 내용의 비교
		System.out.println(dto1.equals(dto2));		
				
		
		String id = "root";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String input = sc.nextLine();
		
		//참조형이라서 내용이 같더라도 false 로 나올수가 있다.
		System.out.println(id==input);
		System.out.println(id.equals(input));
	
		//내용 복제 - 하나의 변경이 다른 것에 영향을 주지 않는다.
		DTO dto4 = dto1.clone();
		dto4.setNum(3);
		System.out.println(dto1);
		
	}

}

