package datatypes;
/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
 * •A byte is an 8-bit signed integer.
 * •A short is a 16-bit signed integer.
 * •An int is a 32-bit signed integer.
 * •A long is a 64-bit signed integer
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 * Input Format:
 * The first line contains an integer,T, denoting the number of test cases. Each test case,T, is comprised of a single line with an integer,n, which can be arbitrarily large or small.
 * Output Format:
 * For each input variablenand appropriate primitivedatatype, you must determine if the given primitives are capable of storing it. If yes, then print
 * referensi: https://github.com/yanzv/HackerRank/blob/master/Java/Introduction/JavaDatatypes.java
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DataTypes {
	static String whoCanFitTheNumber(String numString)
    {
        String answer = "";
        try{
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                answer = answer.concat("* byte\n* short\n* int\n* long");
            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    answer = answer.concat("* int\n* long");
            }else{
                    answer = answer.concat("* long");
            }
        }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
    }

	public static void main(String []argh)
    {
		    Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt() ;
	        scanner.nextLine();
	        String[] N = new String[t] ;
	        for(int i=0; i<t;i++){
	          //  String[] N = new String[t] ;
	            N[i]=scanner.nextLine();
	        }
	        for(int j=0; j<t;j++){
	        System.out.println(whoCanFitTheNumber(N[j]));
    }
}
	
}
