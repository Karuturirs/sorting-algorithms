package com.cormen.sorting;

/*  Consider sorting n numbers stored in array A by first finding the smallest element
of A and exchanging it with the element in A[1]. Then find the second smallest
element of A, and exchange it with A[2]. Continue in this manner for the first n1
elements of A. Write pseudocode for this algorithm, which is known as selection
sort. What loop invariant does this algorithm maintain? Why does it need to run
for only the first n-1 elements, rather than for all n elements? Give the best-case
and worst-case running times of selection sort in (-) notation. 
 */

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items = {-2,54,2,20,98,-1,50};
		int index=items[0];
		int key = 0;
		
		loop: for(int a=0;a<items.length-1;a++){
			int smallest=items[a];
			//System.out.println(smallest);
		//	boolean assign = false;
			for(int i=a+1;i<items.length;i++){
				if(1==1){
					break loop;
				}
				if(items[i]<smallest)
				{
					smallest = items[i];
					key = i;
					//assign = true;
					items[key]=items[a];
					items[a]=smallest;
				}
			}
			//if(assign){
				
			//}
			
		}
		for(int i=0;i<items.length;i++)
			System.out.print(items[i]+" ");
	}
	

}
