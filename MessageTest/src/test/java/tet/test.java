package tet;
/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��19�� ����11:35:26
* ��˵��
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
