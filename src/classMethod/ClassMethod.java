package classMethod;

import classMethod.human.Human04;

public class ClassMethod {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodPrint();
		
		System.out.println(Human04.GREETING);
		
		yamada.instanceMethodPrint();
	}
}
