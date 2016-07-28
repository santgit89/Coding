package code;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReRec {
	String reverse="";
	
	public String reverseString(String s){
		if(s.length()==1)
			return s;
		else{
			reverse+= s.charAt(s.length()-1)+reverseString(s.substring(0, s.length()-1));
		}
		return reverse;
	}
	public static void main(String[] args) throws IOException {
		StringReRec obj = new StringReRec();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s=br.readLine();
		String a="hello how are you";
		System.out.println("Reverse of the string is"+"\n"+obj.reverseString(s));
	}
}
