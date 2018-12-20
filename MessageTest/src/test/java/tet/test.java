package tet;
/**
* @author 作者 E-mail:
* @version 创建时间：2018年12月19日 上午11:35:26
* 类说明
*/
public class test {

	public static void main(String[] args) {
		String name=null;
		String sn=null;
		System.out.println("---");
		System.out.println((sn==null||sn.equals(""))&&(name!=null&&!name.equals("")));//true
		System.out.println(sn==null||sn.equals(""));//true
		System.out.println(name!=null&&!name.equals(""));//false
	    System.out.println(true&&false);//false

	}

}
