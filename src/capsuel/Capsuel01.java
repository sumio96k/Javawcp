package capsuel;

import capsuel.human.HumanCapsuel;
import capsuel.human.HumanNoCapsuel;

public class Capsuel01 {
	public static void main(String[] args) {
		HumanNoCapsuel human1 = new HumanNoCapsuel("田中", 28);
		System.out.println(human1.name + human1.age);
		human1.name = "今田";
		human1.age = 70;
		System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です");
		
		HumanCapsuel human2 = new HumanCapsuel("小林",32);
		
		System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です");
		human2.setName("佐々木");
		System.out.println("変更した名前は" + human2.getName() + "です");
	}
}
