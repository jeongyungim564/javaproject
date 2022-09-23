package ch03;
import java.util. Scanner;
public class Linear_time {

	public static void main(String[] args) {

		
		System.out.println("배열에 저장할 숫자를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int inscore[] = new int[3]; 
		//score[0] ~ score[9] 
		
		//for문이 반복되면서 i 값 증가 + [i]값에 입력한 값 저장
		int i=0;
		for(; i<inscore.length;i++) {
			inscore[i] = scanner.nextInt();
			System.out.println("score[" + i + "]는" + inscore[i] + "입니다.");
		}//end of for
		
		System.out.println("---------------------------------");
		System.out.println("찾으려는 값을 입력해주세요.");
		int findscore = scanner.nextInt();
		System.out.println("입력하신 값은" + findscore + "입니다.");
		System.out.println("---------------------------------");
		
		for(i=0; i<inscore.length;i++) 
			if(inscore[i] == findscore) { 
			System.out.println("찾았어요. inscore["+ i +"]에 있습니다.");
			}else {
			System.out.println("못찾았어요.현재 inscore의 위치는"+i+"입니다.");
			}
		//end of for
	}//end of main
}//end of class
