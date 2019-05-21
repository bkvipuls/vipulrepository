package com.learning.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class javaArrayList {
//How to remove duplicates from ArrayList in Java?

//Read more: http://www.java67.com/2015/06/20-java-arraylist-interview-questions.html#ixzz5oU1KVQoz
	public static void main(String[] s){
		javaArrayList jrl=new javaArrayList();
		List<Integer> prime=new ArrayList<Integer>();
		prime.add(2);
		prime.add(5);
		prime.add(5);
		prime.add(7);
		prime.add(11);
		prime.add(11);
		prime.add(11);
		prime.add(13);
		prime.add(17);
		prime.add(19);
		jrl.removeDuplicate(prime);
		jrl.rotateBy(prime, 3);
	}
	
	public void removeDuplicate(List<Integer> rD){
		
		System.out.println(rD);
		Set<Integer> pset=new LinkedHashSet<Integer>();
		pset.addAll(rD);
		System.out.println(pset);
		rD.clear();
		rD.addAll(pset);
		//Collections.reverse(prime);
		System.out.println(rD);
		//rotateBy(prime,2);
		
	}
	
	
	public void rotateBy(List<Integer> al,int frm){
		al.subList(0,frm);
		al.subList(frm, al.size());
		System.out.println(al.subList(0,frm)+"  "+al.subList(frm, al.size()));
		List<Integer> swap=new ArrayList<Integer>();
		swap.addAll(al.subList(frm, al.size()));
		swap.addAll(al.subList(0,frm));
		al.clear();
		al.addAll(swap);
		System.out.println("Swap "+swap);
	}
}
