package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID

 */
public class School {
    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setStudentInfo("Naci", 25, 'M', 1024, "Section 1");
        Student stu2 =new Student();
        stu2.setStudentInfo("Minnos",8,'F',1,"koltuk");

        System.out.println(stu1);
        stu1.attendClass("Math");
        stu1.eat("lahmacun arasi Adana kebap");
        stu1.code();


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(stu1,stu2));

        for (Student each : studentList){
            System.out.println(each.name+" "+ each.studentID);

        }



    }
}
