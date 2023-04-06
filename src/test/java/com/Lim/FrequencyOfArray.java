package com.Lim;

public class FrequencyOfArray {

	public static void main(String[] args) {
		char[] ch= {'a','b','c','a','c','a'};
		int[] count=new int[26];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				count[ch[i]-97]++;
			}
			else if(ch[i]>='A'&&ch[i]<='Z') {
				count[ch[i]-65]++;
		}
			for(int k=0;k<26;k++) {
				if(count[k]!=0)
				System.out.println(count[k]);
			}

		}
	}
}
