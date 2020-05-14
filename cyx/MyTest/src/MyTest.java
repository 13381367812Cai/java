
public class MyTest {

	/**
	 * @ 找字符串中的第一个唯一字符 找到返回字符下标，找不返回-1
	 * @author cyx
	 * 
	 */
	public static void main(String[] args) {
		String name="abbcde";
		//System.out.println(findChar(name));
		System.out.println(find(name));
	}
	//空间复杂度、时间复杂度高
	public static String findChar(String name){
		String temp="";
		for (int i = 0; i < name.length(); i++) {
			temp=name.substring(i,i+1);
			int ishasright=name.lastIndexOf(temp);//从右往左找
			int ishasleft=name.indexOf(temp);//从左往右找
			if(ishasright==i&&ishasleft==i){//两个方向找到的下标都是当前字符的下标，说明唯一
				return temp+"为唯一字符，第一次出现的下标是："+i;
			}
		}
		return "-1";
	}
	//时间复杂度还是高
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
				return temp+"为唯一字符，第一次出现的下标是："+ishas;
			}
		}
		return "没有找到不重复的字符";
	}
	
}
