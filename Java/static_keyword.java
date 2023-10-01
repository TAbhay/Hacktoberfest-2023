class Student{
    String name;
    static String school;//school name will be same forr every one therefore add static keyword

    public static void changeSchool() {
        school="new school";
    }
}
public class static_keyword {
    public static void main(String[] args) {
        Student.school="Swaraj India";
        Student s1=new Student();
        s1.name="Samarjeet";
        System.out.println(s1.school);
    }
}
