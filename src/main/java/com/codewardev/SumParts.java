package com.codewardev;

import java.util.Arrays;

public class SumParts {

	public static int[] sumParts(int[] ls) {
		if(ls.length == 0) {
			return new int[] {0};
		}
		int[] result = new int[ls.length+1];
		result[0] = Arrays.stream(ls).sum();
		System.arraycopy(sumParts(Arrays.stream(ls).skip(1).toArray()), 0, result, 1, ls.length);
		
		return result;
	}

}
