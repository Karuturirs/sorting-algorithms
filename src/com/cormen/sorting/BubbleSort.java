package com.cormen.sorting;

import java.util.Random;

import com.cormen.util.RunningTime;

/*
 * Bubble sort is equalent to insertion sort but the order we check is from back to front.
 * Even bith have O(n^2). Insertion sort is faster and efficient than bubble sort.
 */
		
		
public class BubbleSort {

	public static void main(String[] args) {
		
		int size= 1000;
		int[] items = 	new int[size]; //{21,54,2,43,98,67,50};
		//intializing random values 
		for(int i=0;i<size;i++){
			items[i]= new Random().nextInt(1000);
		}
		
		System.out.print("Input order: ");
		for(int i=0;i<items.length;i++)
			System.out.print(items[i]+" ");
		
		RunningTime rt=new RunningTime();
		long starttime = System.currentTimeMillis();
		for(int i=0;i<items.length;i++){
			for(int j=items.length-1;j>i;j--){
				if(items[j]<items[j-1]){
					items[j] =items[j]+items[j-1];
					items[j-1] =items[j]-items[j-1];
					items[j] =items[j]-items[j-1];
				}
			}
		}
		//Thread.sleep(2000);
		System.out.print("Time Taken in Millsec: "+rt.timeTakenInMillSec(starttime)+ " ");
		System.out.print("\nOutput order: ");
		for(int i=0;i<items.length;i++)
			System.out.print(items[i]+" ");
	}

}
