import java.util.Scanner;





public class TestMain {
	public static void main(String[] args) {
		People firstPeople=new People();
		firstPeople.setName("小一");
		People secondPeople=new People();
		secondPeople.setName("小二");
		// 0剪刀,1石头,2布
		System.out.print("第一个人出拳：");
		People.mymetchd firPeoAnswer = firstPeople.getMyChoose();
		System.out.println(firPeoAnswer);
		
		System.out.print("第二个人出拳：");
		People.mymetchd secPeoAnswer = firstPeople.getMyChoose();
		System.out.println(secPeoAnswer);
		Boolean flag=true;
		
		do{
			
			if(firPeoAnswer==secPeoAnswer){
				System.out.println("平局");
			}else if(firPeoAnswer==People.mymetchd.values()[0]&&secPeoAnswer==People.mymetchd.values()[1]){//剪刀、石头
				System.out.println(secondPeople.getName()+"赢了！");
			}else if(firPeoAnswer==People.mymetchd.values()[0]&&secPeoAnswer==People.mymetchd.values()[2]){//剪刀、布
				System.out.println(firstPeople.getName()+"赢了！");
			}else if(firPeoAnswer==People.mymetchd.values()[1]&&secPeoAnswer==People.mymetchd.values()[0]){//石头、剪刀
				System.out.println(firstPeople.getName()+"赢了！");
			}else if(firPeoAnswer==People.mymetchd.values()[2]&&secPeoAnswer==People.mymetchd.values()[0]){//布、剪刀
				System.out.println(secondPeople.getName()+"赢了！");
			}else if(firPeoAnswer==People.mymetchd.values()[1]&&secPeoAnswer==People.mymetchd.values()[2]){//石头、布
				System.out.println(secondPeople.getName()+"赢了！");
			}else if(firPeoAnswer==People.mymetchd.values()[2]&&secPeoAnswer==People.mymetchd.values()[1]){//布、石头
				System.out.println(firstPeople.getName()+"赢了！");
			}
			
			System.out.println("是否再来一局？y/n");
			Scanner scan = new Scanner(System.in);
			 String temp = scan.next();
			 if(temp.equalsIgnoreCase("n")){
				 flag=false;
				 System.out.println("游戏结束！");
			 }
		}while(flag);
		
		
	}
}
