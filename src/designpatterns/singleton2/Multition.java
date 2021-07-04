
//designpatterns.singleton.Multition.java
package designpatterns.singleton2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//充当单例角色
public class Multition {
	//私有静态成员变量，存储限制的实例
	private static List<Multition> instance=new ArrayList();
	private static int maxNum=3;
	//构造方法私有化
	private Multition(){
		;
	}

	public static Multition getMultition() {
		//如果实例不存在或者实例数量少于上限，则继续添加
		if(instance==null || instance.size()<maxNum){
			Multition temp=new Multition();
			instance.add(temp);
			System.out.println("Create successfully , now has "+instance.size());
			return temp;
		}
		//否则失败，返回第一个实例
		else{
			System.out.println("Create failing! now has "+instance.size());
			return instance.get(0);

		}
	}


}