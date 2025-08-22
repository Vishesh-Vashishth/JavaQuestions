public class CallingConstructorFromConstructor {
    public static void main(String[] args) {
        Student2 hehe = new Student2();
        System.out.println(hehe.name);
        final int a = 10;
        // a=20;  not possible;

        hehe = new Student2(11,"vishesh",12.2f);
        System.out.println(hehe.name);

        //final with objects
        final Student2 haha= new Student2(39 , "Akshat" , 78.0f);
        //haha = new Student2(); // not possible to reassign reference but object properties can change;

        Student2 obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new Student2();
        }



    }
}

class Student2{
    int rollNumber;
    String name;
    float marks;

    Student2(){ //calling another constructor from this constructor;
        this(0,"Default", 0.0f);
    }

    Student2(int rollNumber,String name, float marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    protected void finalize() throws Throwable { //whenever object of class Student2 is destroyed this will be called;
        System.out.println("Object is destroyed ");
    }
}
