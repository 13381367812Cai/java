import java.util.Scanner;





public class TestMain {
	public static void main(String[] args) {
		People firstPeople=new People();
		firstPeople.setName("Сһ");
		People secondPeople=new People();
		secondPeople.setName("С��");
		// 0����,1ʯͷ,2��
		System.out.print("��һ���˳�ȭ��");
		People.mymetchd firPeoAnswer = firstPeople.getMyChoose();
		System.out.println(firPeoAnswer);
		
		System.out.print("�ڶ����˳�ȭ��");
		People.mymetchd secPeoAnswer = firstPeople.getMyChoose();
		System.out.println(secPeoAnswer);
		Boolean flag=true;
		
		do{
			
			if(firPeoAnswer==secPeoAnswer){
				System.out.println("ƽ��");
			}else if(firPeoAnswer==People.mymetchd.values()[0]&&secPeoAnswer==People.mymetchd.values()[1]){//������ʯͷ
				System.out.println(secondPeople.getName()+"Ӯ�ˣ�");
			}else if(firPeoAnswer==People.mymetchd.values()[0]&&secPeoAnswer==People.mymetchd.values()[2]){//��������
				System.out.println(firstPeople.getName()+"Ӯ�ˣ�");
			}else if(firPeoAnswer==People.mymetchd.values()[1]&&secPeoAnswer==People.mymetchd.values()[0]){//ʯͷ������
				System.out.println(firstPeople.getName()+"Ӯ�ˣ�");
			}else if(firPeoAnswer==People.mymetchd.values()[2]&&secPeoAnswer==People.mymetchd.values()[0]){//��������
				System.out.println(secondPeople.getName()+"Ӯ�ˣ�");
			}else if(firPeoAnswer==People.mymetchd.values()[1]&&secPeoAnswer==People.mymetchd.values()[2]){//ʯͷ����
				System.out.println(secondPeople.getName()+"Ӯ�ˣ�");
			}else if(firPeoAnswer==People.mymetchd.values()[2]&&secPeoAnswer==People.mymetchd.values()[1]){//����ʯͷ
				System.out.println(firstPeople.getName()+"Ӯ�ˣ�");
			}
			
			System.out.println("�Ƿ�����һ�֣�y/n");
			Scanner scan = new Scanner(System.in);
			 String temp = scan.next();
			 if(temp.equalsIgnoreCase("n")){
				 flag=false;
				 System.out.println("��Ϸ������");
			 }
		}while(flag);
		
		
	}
}
