package resson;

public class Resson01 {
	public static void main(String[] args) {
		
		//偶数昇順
		int[] arry = {1,2,3,4,5,6,7,8,9,10};
		int val = 0;
//		int[] val = new int [arry.length];
//		System.out.println(val.length);
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] % 2 == 0) {
				val ++;
				System.out.println(arry[i]);
			}
		}
		
		System.out.println("偶数の数は"+val);
		
		//偶数の数・合計
		int v = 0;
		for (int ary : arry) {
			if(ary % 2 == 0) {
				v += ary;
			}
		}
		
		System.out.println("偶数の合計は"+v);
		String s;
		for (int i = 0; i < arry.length; i++) {
			if (i < arry.length - 1) {
				System.out.print(arry[i]+",");
			} else {
				System.out.println(arry[i]);
			}
		}
		
		int[] num = new int[20];
		
		for (int i = 1; i < num.length; i++) {
			//num[0]は0のため、5を足してnum[1]は5になる。を繰り返す
			num[i] = num[i-1] + 5;
		}
		
		for (int i = 0; i < num.length; i ++) {
			if (i <= 10) {
				if (num[i] %2 != 0) {
					System.out.println("["+i+"] は"+num[i]+",");
				} else {
					System.out.println("["+i+"] は"+num[i]);
				}
			}else {
				if (num[i] % 2 == 0) {
					System.out.println("["+i+"] は"+num[i] + ",");
				} else {
					System.out.println("["+i+"] は"+num[i]);
				}
			}
			
		}
		
	}
}
