package com.learning.base;

public class playwithString {
	public static void main (String[] s){
	//String is immutable and String Buffer mutable class
		playwithString revs=new playwithString();
		//revs.revbyCharAt();
		//revs.revbyStrBuffer();
		//revs.removeSpecialChar();
		//revs.playString();
		revs.swapString();
		//revs.revInteger();
		//revs.revLong();
	}

	public void revbyCharAt(){
		String str="Selenium";
		String rev = "";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev= rev + str.charAt(i);
		}
		System.out.println(rev);

	}

	public void revbyStrBuffer(){
		String str="Selenium";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

	public void removeSpecialChar(){
		String str="Sele!@#$%^&*()n+_ium";
		//regular expression[]
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

	public void revInteger(){
		int num=12345, rev=0;
		
		while (num!=0){
			rev=rev*10+num%10;			
			//System.out.println(""+num%10);
			num=num/10;
		}
		System.out.println(""+rev);

	}

	public void revLong(){
		long num=123456;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		long l=Long.parseLong(sb.reverse().toString());
			
		System.out.println(l+"");
	}

	public void playString(){
		String rev="",str="Baba to bas mera hai";
		//System.out.print(str.indexOf("c"));
		String[] sr=str.split(" ");
		for(int i=sr.length-1;i>=0;i--){
			rev=rev+sr[i]+" ";
		System.out.print(sr[i]+" ");
		
		}System.out.println();
		System.out.print(rev);
	}

	public void swapString(){
		String a="Meraaa", b="Baba";
		int x=a.length();
		int y=b.length();
		a=b.concat(a);
		b=a;
		System.out.println(a+"    "+b);
		a=a.substring(0, y);
		b=b.substring(y, b.length());

		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	
}
