import java.util.Random;



/**
 * ������Ϸ����
 * @author Administrator
 *
 */
public class People {
	//��Ϸ������
	private String name;
	
	public enum mymetchd {
	    ����,ʯͷ,��
	}
	//��Ϸ�߳�ȭ
	public mymetchd getMyChoose(){
		 int pick = new Random().nextInt(mymetchd.values().length);
		    return mymetchd.values()[pick];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
