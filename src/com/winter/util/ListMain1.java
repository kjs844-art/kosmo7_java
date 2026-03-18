package com.winter.util;

import java.util.ArrayList;

public class ListMain1 {
	
	public static void main(String[] args)
	    //Arryalist 객체 생성
	   int [] ar = new int [2];
	   ArrayList<E> list = new ArrayList();
	   list.add(1);
	   list.add("two");
	   list.add(true);
	   list.add(3);
	     
	   
	   list.add(1,0);
	   
	   list.set(0, 100);
	   
	   //list.remove(1);
	   
	   
	   for(int i=0;i<list.size();i++) {
		   System.out.println(list.get(i));
		   
	   }
		
	   

}
