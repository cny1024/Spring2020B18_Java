package day41_Inheritance.Task01;
/*
 create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee {

    public void writingRequiremnts(){
        System.out.println(name + " is writing Requiremnts");
    }
    public void gathering(){
        System.out.println(name +" is gathering");
    }
    public BusinessAnalyst(String name,double salary, long id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

}
