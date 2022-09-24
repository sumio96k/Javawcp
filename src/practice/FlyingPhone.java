package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int minitus;
	
	public FlyingPhone(int minitus) {
		this.minitus = minitus;
	}
	
	public void fly() {
		System.out.println(minitus+"分間、飛びます");
	}
	
	public void call(String number) {
		System.out.println(number + "に電話をします。通話できるのは飛んでいる時だけです");
	}

	@Override
	public void powerOff() {
		// TODO 自動生成されたメソッド・スタブ
		Flying.super.powerOff();
	}
}
