import java.util.Random;



/**
 * 参与游戏的人
 * @author Administrator
 *
 */
public class People {
	//游戏者名称
	private String name;
	
	public enum mymetchd {
	    剪刀,石头,布
	}
	//游戏者出拳
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
