package practice;

public class Chapter12 {

	public static void main(String[] args) {
		CapsuelMan man = new CapsuelMan("小林",32);
		
		System.out.println("名前は" +man.getName()+ "です");
		System.out.println("年齢は" +man.getAge()+ "です");
		man.setAge(33);
		System.out.println("誕生日を迎えたので、年齢が"+man.getAge()+"になりました");
	}

}
