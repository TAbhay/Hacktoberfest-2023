class Student{
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(String name,int age)
    // {
    //     this.name=name;
    //     this.age=age;
    //     System.out.println("CONSTRUCTOR CALLED");
    // }Parameterized

    //copy constaructor
    Student(Student s2){//copies info from student 2
        this.name=s2.name;
        this.age=s2.age;
    }
    Student()
    {

    }
}

public class OOPS2 {
    public static void main(String[] args) {
        //Student s1=new Student("Samarjeet",19);for parameterized
        Student s1=new Student();
        s1.name="Samarjeet Singh Gandhi";
        s1.age=19;

        Student s2=new Student(s1);
        s2.printInfo();
        //s1.name="Samarjeet Singh Gandhi";
        //s1.age=19;
        // s1.printInfo();
    }
}
