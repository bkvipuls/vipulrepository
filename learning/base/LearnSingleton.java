package com.learning.base;

public class LearnSingleton {
	private static LearnSingleton clas_ref=null;
	public String str;
	
	private LearnSingleton(){
		str="Mera Baba, Pyara Baba Metha Baba";
	}

	private static LearnSingleton getInstance() {
		if(clas_ref==null)
		{
			clas_ref = new LearnSingleton();
		}	
		return clas_ref;
	}
	
	
	public static void main(String[] s)
	{
		LearnSingleton ls1=LearnSingleton.getInstance();
		LearnSingleton ls2=LearnSingleton.getInstance();
		LearnSingleton ls3=LearnSingleton.getInstance();

		ls1.str=(ls1.str).toUpperCase();
		ls2.str=(ls2.str).toLowerCase();
		ls2.str="baba";
		System.out.println(ls1.str);
		System.out.println(ls2.str);
		System.out.println(ls3.str);
	}

}
