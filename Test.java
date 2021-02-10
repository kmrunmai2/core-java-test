//Write a Program using all Core java concepts like Interface, Collections, Classes, Polymorphism. Push the code to GIT repository & share the url of the repo.


import java.util.ArrayList;

 //Polymorphism Method overloading


class Test
{
void show(int a)
{
 System.out.println("1");
}
void show(String a)
{
 System.out.println("2");
}
public static void main(String[] args) {

ArrayList<String> list=new ArrayList<String>();  //Creating arraylist  
list.add("A");   //Adding object in arraylist  
list.add("B");  
list.add("C");  
 
//Traversing list through Iterator  

Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  

 Student s1=new Student();
 s1.display();

 
 Test t=new Test();
 t.show(10);

Abc ab=new Abc();
ab.show();

Xyz xy=new Xyz();
xy.show();
}

//Polymorphism overriding


class Abc
{
void show()
{
 System.out.println("I am from class Abc");
}
}

class Xyz extends Abc
{
void show()
{
 System.out.println("I am from class Xyz");
}
}
//interface

interface Details{

 
void display();

 
}

public class Student implements Details{

 
 public void display() {

 
System.out.println("This are student details");

 
}
}
 
 

 
 }
