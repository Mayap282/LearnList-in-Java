package com.learn.list;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Vector;

public class LearnList {
		
		
		public static void main(String args[]) {
			
			
			PriorityQueue<String> queue=new PriorityQueue<String>();  
			queue.add("Amit");  
			queue.add("Vijay");  
			queue.add("Karan");  
			queue.add("Jai");  
			queue.add("Rahul");  
			System.out.println("head:"+queue.element());  
			System.out.println("head:"+queue.peek());  
			System.out.println("iterating the queue elements:");  
			Iterator itr=queue.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());		
			}
			
			HashMap<Integer,String> map=new HashMap<Integer,String>();  
			  map.put(100,"Amit");  
			  map.put(101,"Vijay");  
			  map.put(102,"Rahul");  
			 
			   
			 
			  for(Map.Entry m:map.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  } 
		}
}

