class Student{
    int rollno;
    String name;
    static String college="VCET";
    student(int r,String n){

     roll no=r;
     name=n;
     }
void display(){
System.out.println(rollno+"+name+"+college);}
}


public class StaticMethod
public static void main(String args[]){
Student s1=new Student(04,"Dikshant Buwa");
Student s2=new Student(00,"Person2");
s1.display();
s2.display();
}
}

