package manage;
import java.util.*;
public class main {

	public static void main(String[] args) {
		//System.out.println("����� �̸��� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		//String name = scanner.next();
		System.out.println("������ �� ������ �Է����ּ���.");
		int thisyear = scanner.nextInt();
		System.out.println("����� �¾ ������ �Է����ּ���.");
		int birthyear = scanner.nextInt();
		System.out.println("������ ��������? yes = 1 / no = 2");
		int yesorno = scanner.nextInt();
		int year = thisyear-birthyear;
		
		if(yesorno == 1) {	//���ǽ��� ���϶� ����
			year = year;  //������ �������� 0
		}else{	//if���ǽ��� �����̸� ����
			year = year - 1;  //������ ���������� -1
		}System.out.println("�� ���̴� "+ year + "�Դϴ�");	
	}
}
