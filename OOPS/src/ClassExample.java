public class ClassExample {
    public static void main(String[] args) {
//        Student Vishesh = new Student(); //object 1
//        Student Akshat = new Student(); //object 2

        Student Don; // just declare reference doesn't created object (Don == null);
        Don = new Student(1,"don", 27.8f); // Now object is created in memory;

        //Access properties using dot operator;
        //Vishesh.rollNumber = 11;
      //  Vishesh.name = "Vishesh";
      //  Vishesh.marks = 86.8f;

       // System.out.println(Vishesh.name);
       // System.out.println(Vishesh.marks);
        //System.out.println(Vishesh.rollNumber);


      //  System.out.println(Don.name);
      //  System.out.println(Don.marks);
       // System.out.println(Don.rollNumber);

        Student manisha = new Student(64,"Manisha",90.0f);

        System.out.println(manisha.rollNumber);
        manisha.greeting();

        //using different constructor;
        Student student1 = new Student();
        Student student2 = new Student(12,"Prateek", 78.0f);
        Student student3 = new Student(23,"Noni");

        System.out.println(student1.name);
        System.out.println(student2.marks);
        System.out.println(student3.marks);
    }
}

class Student{
    int rollNumber; //property
    String name; //property
    float marks; //property

    Student(){
        rollNumber = 0;
        name = "Default";
        marks = 0.0f;

    }


    void greeting(){
        System.out.println("Hello My Name is "+ this.name);
    }

    Student(int rollNumber,String name,float marks){     // Custom constructor
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    Student(int rollNumber,String name){     // Custom constructor
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = 0.0f; //default value;
    }
}
