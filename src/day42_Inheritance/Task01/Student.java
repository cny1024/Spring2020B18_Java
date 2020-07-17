package day42_Inheritance.Task01;
/*
create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person{

    public int studentID;
    public String clazz;

    static String schoolName ="Cybertek";

    public void setStudentInfo(String name, int age, char gender, int studentID,String clazz){
        setPersonInfo(name,age,gender);
        this.studentID=studentID;
        this.clazz= clazz;

    }

    public void attendClass(String lesson){
        System.out.println(name + " is attending "+lesson+" class");
    }
    public void code(){
        System.out.println(name + " is coding");
    }
    public String toString(){
        return name +", " + age +", "+gender + ", "+studentID+", "+clazz + ", "+schoolName;
    }

}
