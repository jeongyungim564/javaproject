package ch03;
import java.util. Scanner;
public class Linear_time {

	public static void main(String[] args) {

		
		System.out.println("�迭�� ������ ���ڸ� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int inscore[] = new int[3]; 
		//score[0] ~ score[9] 
		
		//for���� �ݺ��Ǹ鼭 i �� ���� + [i]���� �Է��� �� ����
		int i=0;
		for(; i<inscore.length;i++) {
			inscore[i] = scanner.nextInt();
			System.out.println("score[" + i + "]��" + inscore[i] + "�Դϴ�.");
		}//end of for
		
		
		//�����˻��˰���
		System.out.println("---------------------------------");
		System.out.println("ã������ ���� �Է����ּ���.");
		int findscore = scanner.nextInt();
		System.out.println("�Է��Ͻ� ����" + findscore + "�Դϴ�.");
		System.out.println("---------------------------------");
		
		for(i=0; i<inscore.length;i++) 
			if(inscore[i] == findscore) { 
			System.out.println("ã�Ҿ��. inscore["+ i +"]�� �ֽ��ϴ�.");
			}else {
			System.out.println("��ã�Ҿ��.���� inscore�� ��ġ��"+i+"�Դϴ�.");
			}//i++;
		//end of for
	}//end of main
}//end of class
