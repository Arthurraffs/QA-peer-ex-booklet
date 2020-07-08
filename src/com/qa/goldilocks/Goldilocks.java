package com.qa.goldilocks;

public class Goldilocks {

	private int[] chairSize = new int[] { 297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59,
			124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132 };
	private int[] porridgeTemp = new int[] { 90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197,
			59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132 };

	private int goldiWeight = 100;
	private int goldiTemp = 120;

	public void FindChair() {
	for(int g = 0; g<chairSize.length; g++) {
		if (chairSize[g] >= goldiWeight) {
			
			System.out.println(g);
			
		}
	}
			
			
		}

	}

