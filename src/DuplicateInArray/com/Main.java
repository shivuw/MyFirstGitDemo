 package DuplicateInArray.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Main {
	
	
	public static void main(String[] args)
	{
		int[] a = {2,9,2,4,5,1,2,5};
	
		
////		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());
		}  
		int ab[] = new int[set.size()];
//		int j=0;
//		for(int num : set)
//		{
//			ab[j] = num;
//			j++;
//		}
//		
//		for(int k : ab)
//		{
//			System.out.print(k+" ");
//		}
		
		
//		USING HASH MAP
		
//		HashMap<Integer,Integer> hm = new LinkedHashMap<>();
//		for(int i=0; i<a.length; i++)
//		{
//			if(hm.containsKey(a[i])) {
//				hm.put(a[i], hm.get(a[i])+1);
//			}else {
//				hm.put(a[i], 1);
//			}
//		}
//		int j=0;
//		int b[] = new int[hm.size()];
//	for(int k : hm.keySet()) 
//	{
//		b[j] = k;
//		j++;
//	}
//	System.out.println("I am HAshMap "+hm);
//	System.out.println("Array is "+Arrays.toString(b));
		
//	} HASH MAP END----
	
	}
//	NOT EFFICIENT PRINT DOUBLLE VALUE IF DUPLICATES ARE MORE THAN TWO
//	public static ArrayList<Integer> duplicates(int arr[], int n) {
//		
//		ArrayList<Integer> list = new ArrayList<>();
//
//		for(int i=0; i<n; i++)
//		{
//			for(int j = i+1; j<n; j++)
//			{
//				if(arr[i] == arr[j] && i != j)
//				{
//				
//					list.add(arr[i]);
//					break;
//				}
//			}
//		}
////		Collections.sort(list);
//		return list;
//        // code here
//    }
//
//
//	public static void main(String[] args) {
//		
//   
//	
//		int[] ar = new int[] {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23 ,14};
//		int n = ar.length;
//		ArrayList<Integer> ll = duplicates(ar,n);
//		for(int i=0; i<ll.size(); i++)
//		{
//			System.out.print(ll.get(i)+" ");
//		}
//		
//}
	}
