import java.util.Scanner;

public class Hunter_11 {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String ss[]=s.split("\\s");
String out="";
	for(int i=0;i<ss.length;i++) {
		
		StringBuilder sb=new StringBuilder(ss[i]);
       		
		out=out+sb.reverse().toString()+" ";
	}
	
	System.out.println(out.substring(0,out.length()-1));
	
}
}
