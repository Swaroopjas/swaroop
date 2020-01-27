import java.util.*;
class PalindromeDate{
public static void main(String[] arg)
{
Scanner o=new Scanner(System.in);
String s1=o.next();
s1.replace("/","");
StringBuilder s2=new StringBuilder(s1);
StringBuilder s3=s2.reverse();
//System.out.println(s3);
if(s3.equals(s2))
System.out.println("palindrome date");
else 
System.out.println("not palindrome date");


}
}