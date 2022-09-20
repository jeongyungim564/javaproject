package manage;
import java.util.*;
public class main {

	public static void main(String[] args) {
		//System.out.println("당신의 이름을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		//String name = scanner.next();
		System.out.println("기준이 될 연도를 입력해주세요.");
		int thisyear = scanner.nextInt();
		System.out.println("당신의 태어난 연도를 입력해주세요.");
		int birthyear = scanner.nextInt();
		System.out.println("생일이 지났나요? yes = 1 / no = 2");
		int yesorno = scanner.nextInt();
		int year = thisyear-birthyear;
		
		if(yesorno == 1) {	//조건식이 참일때 실행
			year = year;  //생일이 지났으면 0
		}else{	//if조건식이 거짓이면 실행
			year = year - 1;  //생일이 안지났으면 -1
		}System.out.println("만 나이는 "+ year + "입니다");	
	}
}
