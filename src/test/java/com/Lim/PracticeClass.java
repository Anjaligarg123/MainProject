package com.Lim;

public class PracticeClass {

	public static void main(String[] args) {
		int[] a={0,1,3,0,4,2,5};
		 int i=0,j=a.length-1;
		 while(i<j) {
			 int al=a[i];
			 int ar=a[j];
			 if(a[i]==0) {
				 i++;
			 }
			 if(a[j]>0) {
				 j--;
		 
			 }
			 if(a[i]>0&&a[j]==0) {
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 
			 }
		}


	for(int k=0;k<a.length;k++) 
		System.out.println(a[k]);
	}
	}




	
