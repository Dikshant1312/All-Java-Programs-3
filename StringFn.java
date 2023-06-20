public class StringFn
{
public static void main(String args[])
{
//String Length

String s1="Dikshant"; 
String s2="Buwa";

System.out.println("string length is:"+s1.length());

System.out.println("string length is:"+s2.length());



s1=s1.concat(" who are you?");

System.out.println(s1); //to check whether it's Empty

String s3="";

String s4="hello"; 
System.out.println(s3.isEmpty());

System.out.println(s4.isEmpty());

// true // false

//replace 
String replaceString=s2.replace('h','t');

System.out.println (replaceString);

//toLowercase

String s5="Dikshant buwa"; 
String s5lower=s5.toLowerCase();

System.out.println(s5lower);
}
}