package day35_Static;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Naci", 1024,4.0);
        System.out.println(student1);//name naci, school name cybertek

        Student student2 = new Student();
        System.out.println(student2); // name null, school name cybertek

        Student.printSchoolName();// school name is cybertek

    }
}
