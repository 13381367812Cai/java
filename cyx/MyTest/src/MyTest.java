
public class MyTest {

	/**
	 * @ ���ַ����еĵ�һ��Ψһ�ַ� �ҵ������ַ��±꣬�Ҳ�����-1
	 * @author cyx
	 * 
	 */
	public static void main(String[] args) {
		String name="abbcde";
		//System.out.println(findChar(name));
		System.out.println(find(name));
	}
	//�ռ临�Ӷȡ�ʱ�临�Ӷȸ�
	public static String findChar(String name){
		String temp="";
		for (int i = 0; i < name.length(); i++) {
			temp=name.substring(i,i+1);
			int ishasright=name.lastIndexOf(temp);//����������
			int ishasleft=name.indexOf(temp);//����������
			if(ishasright==i&&ishasleft==i){//���������ҵ����±궼�ǵ�ǰ�ַ����±꣬˵��Ψһ
				return temp+"ΪΨһ�ַ�����һ�γ��ֵ��±��ǣ�"+i;
			}
		}
		return "-1";
	}
	//ʱ�临�ӶȻ��Ǹ�
	public static String find(String name){
		String temp="";
		String tempOther="";
		int ishas=-1;
		boolean isbreak=false;
		for (int i = 0; i < name.length(); i++) {
			temp=name.substring(i,i+1);
			isbreak=false;
			for (int j = 0; j < name.length(); j++) {
				if(i==j){
					continue;
				}
				tempOther=name.substring(j,j+1);
				if(temp.equals(tempOther)){
					isbreak=true;
					break;
				}else{
					ishas=i;
				}
			}
			if(!isbreak&&ishas!=-1){
				return temp+"ΪΨһ�ַ�����һ�γ��ֵ��±��ǣ�"+ishas;
			}
		}
		return "û���ҵ����ظ����ַ�";
	}
	
}
