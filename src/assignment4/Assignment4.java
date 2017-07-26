package assignment4;
import java.util.Scanner;
import java.util.ArrayList;
public class Assignment4 {
	 public static void main(String[] args) {
		 int range = 10000;
	        ArrayList<Integer> perfectNums = new ArrayList<Integer>(); 
	        for(int i=0; i<=range;i++)
	        {
	            if(IsPerfectNumber.isPerfectNumber(i))
	                perfectNums.add(i);
	        }
	         
	        System.out.format("Perfect numbers within %s: %s\n",range,perfectNums.toString());
	    }
public class IsPerfectNumber{	
public static boolean isPerfectNumber(int num)
{
    boolean isPerfect = false;
    int sum=1;
     
    if(num<6)return false;
     
    for(int i=2; i<=num/2; i++)
    {
        if(num%i == 0)
        {
            sum += i;
        }
    }
     
    if(sum==num) return true;
     
    return isPerfect;
}
}}