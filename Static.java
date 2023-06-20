
public class Static{
public static void main(String args[]){
Student s1=new Student(04,"Dikshant");
Student s2=new Student(00,"Person2");
s1.display();
s2.display();
}
}
class Student{
    int rollno;
    String name;
    static String college="VCET";
    Student(int r,String n){

     rollno=r;
     name=n;
     }
void display(){
System.out.println(rollno+" "+name+" "+college);}
}


