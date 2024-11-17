package nov24;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(34,76,87,45,97,65,34,898);
		Integer integer = list.stream().max(Integer::compare).get();
		System.out.println("Max number : "+integer);
		
		int temp =0;		
		int num[]= {34,76,87,45,97,65,34,898};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Max number");
	}

}
