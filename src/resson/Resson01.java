package resson;

import java.util.Arrays;

public class Resson01 {
	public static void main(String[] args) {

		//偶数昇順
		int[] arry = { 1, 2, 10, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
		Arrays.sort(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
			
		int val = 0;
		//		int[] val = new int [arry.length];
		//		System.out.println(val.length);
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] % 2 == 0) {
				val++;
				System.out.println(arry[i]);
			}
		}

		System.out.println("偶数の数は" + val);

		//偶数の合計
		int v = 0;
		for (int ary : arry) {
			if (ary % 2 == 0) {
				v += ary;
			}
		}

		System.out.println("偶数の合計は" + v);
		
		for (int i = 0; i < arry.length; i++) {
			if (i < arry.length - 1) {
				System.out.print(arry[i] + ",");
			} else {
				System.out.println(arry[i]);
			}
		}

		int[] num = new int[20];

		for (int i = 1; i < num.length; i++) {
			//num[0]は0のため、num[0]に5を足してnum[1]を5にする。を繰り返す
			//iの初期値は1のためnum[i-1(0)]に5をたす
			num[i] = num[i - 1] + 5;
		}

		for (int i = 0; i < num.length; i++) {
			if (i <= 10) {
				if (num[i] % 2 != 0) {
					System.out.println("[" + i + "] は" + num[i] + ",");
				} else {
					System.out.println("[" + i + "] は" + num[i]);
				}
			} else {
				if (num[i] % 2 == 0) {
					System.out.println("[" + i + "] は" + num[i] + ",");
				} else {
					System.out.println("[" + i + "] は" + num[i]);
				}
			}

		}

	}
}
