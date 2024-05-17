package conditionals;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Alphabetrnot {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter anything");
char ch	=sc.next().charAt(0);
if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z') {
	System.out.println("this is alphabet");
	
}
else {
	System.out.println("this is number");
}
}}
