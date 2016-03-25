package com.cormen.sorting;

/*
 * The key operation of the merge sort algorithm is the merging of two sorted
sequences in the “combine” step. We merge by calling an auxiliary procedure
MERGE.A; p; q; r/, where A is an array and p, q, and r are indices into the array
such that p <= q < r. The procedure assumes that the subarrays A[p : : q] and
A[q + 1: : r] are in sorted order. It merges them to form a single sorted subarray
that replaces the current subarray A[p : : r].
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,4};
		int[] b={35,64,77,99};
		int[] c=new int[a.length+b.length];
		
		for(int i=0,j=0,z=0;i<a.length || j<b.length;z++){
			if(i==a.length  ){
				c[z]=b[j];
				j++;
			}
			else if( j==b.length){
				c[z]=a[i];
				i++;
			}else{
				if(a[i] <= b[j]){
					c[z]=a[i];
					i++;
				}else{
					c[z]=b[j];
					j++;
				}
			}
				
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		
		
	}

}
