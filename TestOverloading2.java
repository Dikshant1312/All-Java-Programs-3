class Adder{
static int add(int a,int b){return a+b;}
}
class TestOverloading2{
public static void main(String[]args){
System.out.println(Adder.add(11,11));

System.out.println(Adder.add(11.4,11.5));
}}