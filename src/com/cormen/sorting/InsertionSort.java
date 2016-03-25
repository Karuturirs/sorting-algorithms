package com.cormen.sorting;

import java.util.Random;

import com.cormen.util.RunningTime;

public class InsertionSort  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int size= 1000;
		int[] items = new int[size]; 	//{21,54,2,43,98,67,50};
		//intializing random values 
		for(int i=0;i<size;i++){
			items[i]= new Random().nextInt(1000);
		}
		
		System.out.print("Input order: ");
		for(int i=0;i<items.length;i++)
			System.out.print(items[i]+" ");
		
		RunningTime rt=new RunningTime();
		long starttime = System.currentTimeMillis();
		
		for(int i=1;i<items.length;i++){
			int key = items[i];
			int j=i-1;
			while(j >= 0 && items[j]>key){
				items[j+1]=items[j];
				items[j]=key;
				j=j-1;
			}	
		}
		//Thread.sleep(2000);
	    System.out.print("\n Time Taken in millsec: "+rt.timeTakenInMillSec(starttime)+ " ");
		System.out.print("\nOutput order: ");
		for(int i=0;i<items.length;i++)
			System.out.print(items[i]+" ");
	}

}
