public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();// non parameterized
        Student s2 = new Student("Abhishek");//parameterised
        Student s3 = new Student(123);//parameterised
        //Copy constructer
        Student s4 = new Student();
        s4.name = "Abhi";
        s4.roll = 15;

        Student s5 = new Student(s4);
        Fish shark = new Fish();
        shark.eat();
        
    }
}

class Student {
    String name;
    int roll;

    //Copy constructer
    Student(Student s4) {
        this.name = s4.name;
        this.roll = s4.roll;
    }

   Student() {//non parameterized
        System.out.println("Constructor is called Non parameterized");
    }
    
   Student(String name) {

    this.name = name;//parameterised
    }
    Student(int roll) {
        this.roll = roll;
    }
    
}
// Single level Inheritance 

//Base class
class Animals {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("breath");
    }
}

//Derived class
class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Swim");
    }
}

//Multilevel Inheritance

//derived class 1
class Mammal extends Animals {
    int legs;
}

//Derived class 2
class Dog extends Mammals {
    int barks;
}