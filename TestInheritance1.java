class Animal{
void eat(){System.out.println("eating..");}
}
class Dog extends Animal{
void bark(){
System.out.println("barking..");
}
}
void cry(){
System.out.println("crying...");
}
class TestInheritance1{
public static void main(String args[]){
Dog d=new Dog();
d.cry();
d.bark();
d.eat();
}}