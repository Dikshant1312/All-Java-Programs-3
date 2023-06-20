class stringbuffer
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("Object language");
System.out.println("Original String:"+str);
System.out.println("Length of String:"+str.length());
for(int i=0;i<str.length();i++)
{
int p=i+1;
System.out.println("Character at position"+p+"is"+str.charAt(i));
}
str.insert(7,"Oriented ");
System.out.println("Modified String:"+str);
str.setCharAt(6,'-');
System.out.println("Modified String:"+str);
str.append(":Java");
System.out.println("Modified String:"+str);

}
}