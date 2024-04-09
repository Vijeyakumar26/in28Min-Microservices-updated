package com.minutes;

import java.util.Arrays;

public class Solution{
	
	public static int[] funcDistance(int[] inputDist, int start, int end){
		int[] answer = new int[inputDist.length];
		if(inputDist.length>0){
			Arrays.sort(inputDist);
			int j = 0;
			for(int i =0; i<inputDist.length-1;i++){
				if(inputDist[i]>=start && inputDist[i] <= end){
					answer[j]=inputDist[i];
					j++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		int[] inputDist = {2,10,89,5,88};		
		int[] result = funcDistance(inputDist, 4, 8);
		for(int idx = 0; idx < result.length - 1; idx++)
		{
			System.out.print(result[idx] + " ");
		}
		System.out.print(result[result.length - 1]);
	}
}
